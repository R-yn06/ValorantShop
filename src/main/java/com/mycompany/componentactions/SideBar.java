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
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class SideBar extends JPanel {
    public static final Color BACKGROUND = Color.decode("#522081");
    public static final Color HOVERCOLOR = Color.decode("#1c0333");
    
    public SideBar(){
        setPreferredSize(new Dimension(200,400));
        setBackground(BACKGROUND);
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("CLICKED SideBar");
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
