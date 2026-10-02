/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentactions;

import static com.mycompany.componentactions.BottomBar.BACKGROUND;
import static com.mycompany.componentactions.BottomBar.HOVERCOLOR;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author rcaraos
 */
public class StoreItem extends JPanel {
    
    public static final Color BACKGROUND = Color.decode("#e3daff");
    public static final Color HOVERCOLOR = Color.decode("#000000");
    
    public StoreItem(String name, int price){
        setPreferredSize(new Dimension(150, 150));
        setBackground(BACKGROUND);
        setBorder(BorderFactory.createLineBorder(Color.RED,10));
        
        JLabel label = new JLabel(name);
        label.setFont(new Font("Sanserif", Font.BOLD,20));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel amount = new JLabel("$"+ price);
        amount.setFont(new Font("Sanserif", Font.ITALIC,15));
        amount.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println(name+"!!!!!");
            }
           @Override
           public void mouseEntered(MouseEvent e){
               setBackground(HOVERCOLOR);
           } 
           
           public void mouseExited(MouseEvent e){
                setBackground(BACKGROUND);
        }
        });
        
        add(label);
        add(amount);
    }
}
