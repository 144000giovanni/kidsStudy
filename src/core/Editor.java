/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.io.*;
import java.util.*;

/**
 *
 * @author giovanni
 */
public class Editor {
    
    public Editor(){}
    
    public void setStories(String aStory)
    {
        Stories stories = new Stories();
        List<String> newStories = stories.getStories();
        newStories.add(aStory);
        this.storyWriter(newStories);
        
    }
    
    
    public void storyWriter(List<String> newStories)
    {
        
        String fileName = "/resources/stories.txt";

        
        File storyFile = new File(getClass().getResource(fileName).getPath());
        BufferedWriter bufferedFileWriter = null;
        try
        {
            bufferedFileWriter = new BufferedWriter(new FileWriter(storyFile));
            for (String eachStory : newStories)
            {
                bufferedFileWriter.write(eachStory);
                bufferedFileWriter.newLine();
            }
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
}
