/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author giovanni
 */
public class KJV {
    
    private HashMap<Integer, String> properNames = new HashMap<>();
    private Hashtable<Integer,String> bookVerses = new Hashtable<>();
    private List<String> files = new ArrayList();
    private ArrayList<String> lines = new ArrayList<>();
    private ArrayList<String> fileName = new ArrayList<>();
    private String verseNumber = "";
    private HashMap<String, HashMap> bibleMap = new HashMap<>();
    private HashMap<String, String> bibleMapProperNames = new HashMap<>();
    private HashMap<String, List> searchIndexMap = new HashMap<>();
    public KJV (){}
    
    /**
     *
     */
    
    public HashMap<String, String> getBibleMapProperNames()
    {
        return bibleMapProperNames;
    }
        public void getBibleFiles()
    {
        String fileName = "/resources/bibleBooks.txt";
        String line;
        try
        {
        InputStream fileReader = getClass().getResourceAsStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
        while((line = reader.readLine()) != null) 
            {
                files.add(0, line);
            }
        }
                
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }   
    }
        
    public List<String> getStopWords()
    {
        List<String> stopWords = new ArrayList();
        String aStopWord;
            try
            {
                InputStream fileReader = getClass().getResourceAsStream("/resources/stopWords.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
                while((aStopWord = reader.readLine()) != null) 
                {
                    stopWords.add(aStopWord);
                }
                
            }
            catch (FileNotFoundException e)
            {
                System.out.println(e);
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
            catch (NullPointerException e)
            {
                System.out.println(e);
            }
            return stopWords;
    }
    public HashMap<Integer, List> getABook(String bibleFileName)
    {
        buildBibleMap();
        HashMap<Integer, List> chapters = bibleMap.get(bibleFileName);    
        return chapters;
    }
    
    public HashMap<String, List> getSearchIndex()
    {
        return searchIndexMap;
    }
    public void buildSearchIndex()
    {
        buildBibleMap();
        //searchIndexMap = new HashMap<>();
        Set<String> books = bibleMap.keySet();
        List<String> references = new ArrayList();
        List<String> stopWordsDatabase = getStopWords(); 
        System.out.println(stopWordsDatabase.size());
        for (String bookName : books)
        {
            
            HashMap<Integer, List> chapterMap = bibleMap.get(bookName);
            Set<Integer> chapters = chapterMap.keySet();
            for (Integer chapterNumber : chapters)
            {
                List<String> verses = chapterMap.get(chapterNumber);
                for (String verse : verses)
                {
                    String cleanVerse = verse.replaceAll("[\\)\\(\\,:;.?![0-9]\\}]", "").replaceAll("\\[", "").replaceAll("\\]", "");
                    
                    String[] words = cleanVerse.split(" ");
                    
                    for (String word : words)
                    {
                        
                        
                        int verseNumber = verses.indexOf(verse)+1;
                        String verseNumberString = Integer.toString(verseNumber);
                        String reference = bookName+"["+chapterNumber+"["+verseNumberString;
                          
                        if (stopWordsDatabase.contains(word)==false);
                        {
                            if (searchIndexMap.containsKey(word)==true)
                            {
                                searchIndexMap.get(word).add(reference);                         
                            }
                            else
                            {
                                references = new ArrayList();
                                searchIndexMap.put(word, references);
                            }
                        }
                    }
                }
            }
        }
        removeStopWords();
       System.out.println("finished building searchIndex"); 
    }
    
    public void removeStopWords()
    {
        Set<String> stopWordsKeys = searchIndexMap.keySet();
        List<String> stopWordsDatabase = getStopWords(); 
        for (String word : stopWordsDatabase)
        { 
            searchIndexMap.remove(word);
        }
    }
    public void buildBibleMap() 
    {
        getBibleFiles();
        setProperBibleNames();
        Set<Integer> keyProper = properNames.keySet();
        String line;
        HashMap<Integer, List> bookVerses = new HashMap<>();
        List<String> verses = new ArrayList();
        int count = 1;
        for (String file : files)
        {   
            String properNameOfBook = properNames.get(count);
            try
            {
                InputStream fileReader = getClass().getResourceAsStream("/resources/KJV/"+file);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
                StringBuilder sb = new StringBuilder();
               
                verses = new ArrayList();
                while((line = reader.readLine()) != null) 
                {
                    sb.append(line+" ");
                }
                String s = sb.toString();
                String[] split = s.split("\\{");
                verses = new ArrayList();
                int oldChapter = 1;
                bookVerses.put(oldChapter, verses);
                for (int a = 1; a<split.length; a++ )
                {
                    int l = split[a].indexOf(":");
                    int newChapter = Integer.parseInt(split[a].substring(0, l));
                    verses.add(split[a]);
                    
                    if (oldChapter!=newChapter)
                    {   
                        verses.remove(split[a]);
                        bookVerses.put(oldChapter,verses);
                        oldChapter++;
                        verses = new ArrayList();
                        verses.add(split[a]);
                        bookVerses.put(oldChapter, verses);
                    }      
                }
                
                bibleMap.put(file, bookVerses);
                bibleMapProperNames.put(properNameOfBook, file);
                count++;
                bookVerses = new HashMap<>();
                sb = new StringBuilder();
                verses = new ArrayList();


            }
            catch (FileNotFoundException e)
            {
                System.out.println(e);
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
            catch (NullPointerException e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    public HashMap<String, HashMap> getBibleMap()
    {
        HashMap<String, HashMap> copyMap = bibleMap;
        return copyMap;
    }

    
    public ArrayList<String> readBook(String fileName)
    {
        lines = new ArrayList();
        
        String aFile = "/resources/KJV/"+fileName;
        String line;
        try
        {
        InputStream in = getClass().getResourceAsStream(aFile);
        BufferedReader aReader = new BufferedReader(new InputStreamReader(in));
        int count = 1;
        while((line = aReader.readLine()) != null) 
            {
                lines.add(line);

            }
        
        }
                
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        return lines;
    }
    
    public HashMap<String, String>  joinedBook()
    {
        HashMap<String, String> chapterVerse = new HashMap<>();
        String joinedBook = String.join(" ", lines);
        String[] words = joinedBook.split(" ");
        ArrayList<String> verseNumber = new ArrayList<>();
        String text = "";
        StringBuilder verseText = new StringBuilder();
        ArrayList<String> complete = new ArrayList<>();
        for (String word : words)
        {
            
            verseText.append(word+ " ");
            
            if(word.contains("{"))
            {
                verseNumber.add(word);
                String perfect = verseText.toString();
                String[] words2 = perfect.split(" ");
                ArrayList<String> strings = new ArrayList<>();
                for (String x : words2)
                {
                    strings.add(x);
                }
                strings.remove(word);
                String element = String.join(" ", strings);
                complete.add(element);
                chapterVerse.put(word, text);
                verseText = new StringBuilder();
            }
            
            
            
            
        }

        Set<String> keys = chapterVerse.keySet(); 
        complete.remove(0);
        for (int verseIndex = 0; verseIndex < complete.size(); verseIndex++)
        {
            chapterVerse.put(verseNumber.get(verseIndex), complete.get(verseIndex));
        }
        return chapterVerse;
 
        
    }
    
    public void setFileName(String fileNameOfBook)
    {
        
        String fileNamePath = "/resources/fileName.txt";

        
        File storyFile = new File(getClass().getResource(fileNamePath).getPath());
        BufferedWriter bufferedFileWriter = null;
        try
        {
            bufferedFileWriter = new BufferedWriter(new FileWriter(storyFile));
            bufferedFileWriter.write(fileNameOfBook);
     
        }
        catch (Exception anException)
        {
            System.out.println("Error: " + anException);
        }
        finally
        {
            try
            {
                bufferedFileWriter.close();
            }
            catch (Exception anException)
            {
                System.out.println("Error: " + anException);
            }
        }
    }
    
    public void setVerse(String verse)
    {
        verseNumber = verse;
    }
    
    public List<String> getChapter(String filePath, Integer chapterNumber)
    {
        buildBibleMap();
        HashMap<String, List> theChapter = bibleMap.get(filePath);
        List<String> verses = theChapter.get(chapterNumber);
        return verses;
    }
    
    public String getVerse()
    {
        return fileName.get(0);
    }
    
    public String getTheFileName()
    {
        String fileName = "/resources/fileName.txt";
        ArrayList<String> content = new ArrayList<>();
        String line = null;
        try
        {
            InputStream fileReader = getClass().getResourceAsStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
            while((line = reader.readLine()) != null) 
            {
                content.add(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        String name = content.get(0);
        return name;
    }
    
    public HashMap<Integer, String> setProperBibleNames()
    {
        String fileName = "/resources/properNames.txt";
        ArrayList<String> content = new ArrayList<>();
        properNames = new HashMap<>();
        String line = null;
        try
        {
            InputStream fileReader = getClass().getResourceAsStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
            int count = 1;
            while((line = reader.readLine()) != null) 
            {
                String[] s = line.split(",");
                content.add(line);
                properNames.put(count, s[1]);
                count++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        return properNames;
        
    }
    
    public HashMap<Integer, String> getProperBibleNames()
    {
        HashMap<Integer, String> names = setProperBibleNames();
        return names;
    }


    
    public List<String> getBibleBooks()
    {
        return files;
    }
}
