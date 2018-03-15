/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import gui.MainGUI;
import java.lang.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author giovanni
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

           Stories stories  = new Stories();
           
           System.out.println(Coordinator.getImages("/resources/danielLion_images/").size());



        new MainGUI().setVisible(true);
    }
}
