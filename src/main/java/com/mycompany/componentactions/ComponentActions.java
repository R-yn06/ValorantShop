/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.componentactions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author rcaraos
 */
public class ComponentActions extends JFrame {

        
    public static JPanel STORE;
    public static JPanel SIDEBAR;
    public static JPanel BOTBAR;
    
    public static ArrayList<StoreItem> STOREITEMS = new ArrayList();
    public static final HashMap<String, Integer> ITEMS = new HashMap<>(Map.of(
            "Alejandro",1000,
            "Sam",1000,
            "Aegis",2000,
            "Vandal",3000,
            "Glock",4000,
            "EndRod",5000,
            "Bianca",6000,
            "Duterte",6700
    ));
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            ComponentActions ca = new ComponentActions();
        });
    }
    
    public ComponentActions() throws HeadlessException{
        setSize(800,500);
        setPreferredSize(new Dimension(800,500));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        STORE = new Store();
        SIDEBAR = new SideBar();
        BOTBAR = new BottomBar();
        
        add(STORE);
        add(SIDEBAR, BorderLayout.EAST);
        add(BOTBAR, BorderLayout.SOUTH);
        
        setStoreUp();
    }
    
    public static void setStoreUp(){
        for(String s: ITEMS.keySet()){
            STOREITEMS.add(new StoreItem(s,ITEMS.get(s)));
        }
        for(StoreItem si: STOREITEMS){
            STORE.add(si);
        }
    }
        
}
