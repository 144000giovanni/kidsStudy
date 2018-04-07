/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import javax.swing.*; 
import java.io.*; 
import java.awt.*; 
import java.awt.image.*; 
import javax.imageio.*; 
/**
 *
 * @author giovannisaberon
 */
public class PaintImage extends JPanel{
     
  public static BufferedImage image; 
  
  public PaintImage (String imagePath) 
  { 
    super(); 
    try 
    {                
      image = ImageIO.read(getClass().getResource(imagePath)); 
    } 
    catch (IOException e) 
    { 
      //Not handled. 
    } 
  } 

  public void paintComponent(Graphics g) 
  { 
    g.drawImage(image, 0, 0, null); 
    repaint(); 
  } 
  
  public Image returnImage()
  {
      return image;
  }
}
