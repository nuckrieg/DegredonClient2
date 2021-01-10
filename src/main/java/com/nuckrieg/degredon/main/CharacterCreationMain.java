/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.main;

import com.nuckrieg.degredon.panels.CharacterPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Ana
 */
public class CharacterCreationMain {
    public static void main(String args[]) {
        CharacterCreationMain app = new CharacterCreationMain();
        app.showPanel();
    }
    
    public void showPanel() {
        JFrame mainFrame = new JFrame();
        mainFrame.add(new CharacterPanel());
        
        mainFrame.setResizable(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);

        // this.pdfSearchPanel();
        mainFrame.setTitle("Char Creation");
        mainFrame.setVisible(true);
        getInfo();
    }
    
    public void getInfo() {
//        System.out.println("HEAD "+ HEAD.getSize());
//        System.out.println("HAIR "+HAIR.getSize());
//        System.out.println("TORSO "+TORSO.getSize());
//        System.out.println("LEFT_ARM "+LEFT_ARM.getSize());
//        System.out.println("RIGHT_ARM "+RIGHT_ARM.getSize());
//        System.out.println("LEGS "+LEGS.getSize());
//        System.out.println("WAIST "+WAIST.getSize());
        
    }
}
