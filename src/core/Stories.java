/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.*;
import java.io.*;

/**
 *
 * @author giovanni
 */
public class Stories {
    
    private List<String> stories = new ArrayList();

    public Stories(){}
    
    public List<String> getStories() 
    {
        
        String fileName = "/resources/stories.txt";
        
        String line = null;
        try
        {
            InputStream fileReader = getClass().getResourceAsStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
            while((line = reader.readLine()) != null) 
            {
                stories.add(line);
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
        return stories;

    }
    
    public String getTitle(int titleIndex)
    {
        getStories();
        String[] split = stories.get(titleIndex).split(",");
        String title = split[1];
        return title;
    }
    
        public String getBookFile(int titleIndex)
    {
        getStories();
        String[] split = stories.get(titleIndex).split(",");
        String bookFile = split[2];
        return bookFile;
    }
    
    public int getChapterNumber(int titleIndex)
    {
        getStories();
        String[] split = stories.get(titleIndex).split(",");
        int chapterNumber = Integer.parseInt(split[3]);
        return chapterNumber;
    }
    
        public  String getImageDirectory(int titleIndex)
    {
        getStories();
        String[] split = stories.get(titleIndex).split(",");
        String imageDirectory = split[4];
        System.out.println(imageDirectory);
        return imageDirectory;
    }
    
    public HashMap<String, String> getImages(String imageDirectory)
    {
        String directory = imageDirectory; 
        HashMap<String, String> imageKeys = new HashMap<>();
        String line;
        try
        {
            InputStream fileReader = getClass().getResourceAsStream(directory);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
            while((line = reader.readLine()) != null) 
                {
                    
                    String[] split = line.split("\\.");
                    Stemmer stemmer = new Stemmer();
                    String rawWord = split[0];
                    char[] characters = rawWord.toCharArray();
                    for (char c : characters)
                    {
                        stemmer.add(c);
                    }
           
                    stemmer.stem();
                    String stemmedWord = stemmer.toString();
                    imageKeys.put(stemmedWord, line);
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
        return imageKeys;
    }
}

