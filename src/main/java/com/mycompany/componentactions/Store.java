/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentactions;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


/**
 *
 * @author rcaraos
 */
public class Store extends JPanel{
    
    public static final Color BACKGROUND = Color.decode("#6a329f");
    public static final Color HOVERCOLOR = Color.decode("#1c0333");
    
    public Store(){
        setPreferredSize(new Dimension(600,400));
        setBackground(BACKGROUND);
        setLayout(new GridLayout(3,3,10,10));
        
        addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent e){
                System.out.println("CLICKED STORE");
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
