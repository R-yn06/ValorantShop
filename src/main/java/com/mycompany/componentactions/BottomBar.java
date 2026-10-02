/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentactions;

/**
 *
 * @author rcaraos
 */


import static com.mycompany.componentactions.Store.BACKGROUND;
import static com.mycompany.componentactions.Store.HOVERCOLOR;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class BottomBar extends JPanel {
    
    public static final Color BACKGROUND = Color.decode("#360f5a");
    public static final Color HOVERCOLOR = Color.decode("#1c0333");
    public BottomBar(){
        setPreferredSize(new Dimension (800,100));
        setBackground(BACKGROUND);
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Clicked BOTBAR");
            }
           @Override
           public void mouseEntered(MouseEvent e){
               setBackground(HOVERCOLOR);
           } 
           
           public void mouseExited(MouseEvent e){
                setBackground(BACKGROUND);
        }
        });
    }
}
