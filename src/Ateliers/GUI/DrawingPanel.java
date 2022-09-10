/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ateliers.GUI;

/**
 *
 * @author M.Savoie
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

 public class DrawingPanel extends javax.swing.JPanel
 {
 

   public DrawingPanel()
   {
   }
   

   @Override
   protected void paintComponent( Graphics g )
   {
       super.paintComponent(g); 
       Graphics2D g2 = (Graphics2D) g;
       g2.setColor(Color.DARK_GRAY);
       g2.drawRect((int)(0), (int)(0), (int)(170), (int)(85));
       g2.setStroke(new BasicStroke(5));
       g2.setColor(Color.BLUE);
       g2.drawOval(5, 5, 50, 50);
       g2.setColor(Color.DARK_GRAY);
       g2.drawOval(60, 5, 50, 50);
       g2.setColor(Color.RED);
       g2.drawOval(115, 5, 50, 50);
       g2.setColor(Color.YELLOW);
       g2.drawOval(32, 30, 50, 50);
       g2.setColor(Color.GREEN);
       g2.drawOval(89, 30, 50, 50);
   }
 }
