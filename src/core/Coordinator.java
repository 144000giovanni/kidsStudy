/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.*;
import java.lang.*;
/**
 *
 * @author giovanni
 */
public class Coordinator {
    
    public Coordinator(){}
    
    public static List<String> getAllStories()
    {
        Stories stories = new Stories();
        List<String> allStories = stories.getStories();
        return allStories;
    }
    
    public static void addStories(String aStory)
    {
        Editor editor = new Editor();
        editor.setStories(aStory);
    }
    
    public static List<String> getBibleNames()
    {
        KJV kjv = new KJV();
        kjv.getBibleFiles();
        return kjv.getBibleBooks();

    }
    
    public static ArrayList<String> readABook(String fileName)
    {
        KJV kjv = new KJV();
        return kjv.readBook(fileName);
    }
    
    public static String getchapterVerse(String fileName, String reference)
    {
        KJV kjv = new KJV();
        kjv.readBook(fileName);
        HashMap<String, String> chapterVerse = kjv.joinedBook();
        String foundText = chapterVerse.get(reference);
        return foundText;
    }
    
    public static List<String> getTheChapter(String fileName, Integer chapterNumber)
    {

        KJV kjv = new KJV();
        List<String> theChapter = kjv.getChapter(fileName, chapterNumber);
        return theChapter;
    }
    
    public static HashMap<String, HashMap> getTheBible()
    {
        KJV kjv = new KJV();
        kjv.buildBibleMap();
        return kjv.getBibleMap();
    }
    
    public static HashMap<Integer, String> getProperBibleNames()
    {
        KJV kjv = new KJV();
        HashMap<Integer, String> names = kjv.setProperBibleNames();
        return names;
    }
    
    public static HashMap<String, String> getBibleMapProperNames()
    {
        KJV kjv = new KJV();
        kjv.buildBibleMap();
        return kjv.getBibleMapProperNames();
    }

    public static void buildTheSearchIndex()
    {
        KJV kjv = new KJV();
        kjv.buildSearchIndex();
    }
    public static HashMap<String, List> getSearchIndex()
    {
         KJV kjv = new KJV();
         kjv.buildSearchIndex();
        HashMap<String, List> index = kjv.getSearchIndex();
        return index;
    }
    
    public static String getTheStoryTitle(int indexTitle)
    {
        Stories stories = new Stories();
        String title = stories.getTitle(indexTitle);
        return title;
    }
    
    public static String getTheBookFile(int indexTitle)
    {
        Stories stories =  new Stories();
        String bookFile = stories.getBookFile(indexTitle);
        return bookFile;
    }
    
    public static int getTheChapterNumber(int indexTitle)
    {
        Stories stories =  new Stories();
        int bookFile = stories.getChapterNumber(indexTitle);
        return bookFile;
    }
    
    public static String getImageDirectory(int titleIndex)
    {
        Stories stories =  new Stories();
        String directory = stories.getImageDirectory(titleIndex);
        return directory;
    }
    
    public static HashMap<String, String> getImages(String imageDirectory)
    {
        Stories stories = new Stories();
        HashMap<String, String> images = stories.getImages(imageDirectory);
        return images;
    }
    
    public static String ScienceGetImageDirectory(int titleIndex)
    {
        Science science =  new Science();
        String directory = science.getImageDirectory(titleIndex);
        return directory;
    }
    
    public static HashMap<String, String> ScienceGetImages(String imageDirectory)
    {
        Science science = new Science();
        HashMap<String, String> images = science.getImages(imageDirectory);
        return images;
    }
    
        public static List<String> ScienceGetAllTopics()
    {
        Science science = new Science();
        List<String> allTopics = science.getStories();
        return allTopics;
    }
        
    public static String ScienceGetTheStoryTitle(int indexTitle)
    {
        Science science = new Science();
        String title = science.getTitle(indexTitle);
        return title;
    }
}
    

