/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.charactercreation;

import static com.nuckrieg.degredon.charactercreation.CreationPanel.HAIR;
import static com.nuckrieg.degredon.charactercreation.CreationPanel.HEAD;
import static com.nuckrieg.degredon.charactercreation.CreationPanel.LEFT_ARM;
import static com.nuckrieg.degredon.charactercreation.CreationPanel.LEGS;
import static com.nuckrieg.degredon.charactercreation.CreationPanel.RIGHT_ARM;
import static com.nuckrieg.degredon.charactercreation.CreationPanel.TORSO;
import static com.nuckrieg.degredon.charactercreation.CreationPanel.WAIST;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String args[]) {
        Main app = new Main();
        app.showPanel();
    }
    
    public void showPanel() {
        JFrame mainFrame = new JFrame();
        mainFrame.add(new CreationPanel());
        
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
        System.out.println("HEAD "+ HEAD.getSize());
        System.out.println("HAIR "+HAIR.getSize());
        System.out.println("TORSO "+TORSO.getSize());
        System.out.println("LEFT_ARM "+LEFT_ARM.getSize());
        System.out.println("RIGHT_ARM "+RIGHT_ARM.getSize());
        System.out.println("LEGS "+LEGS.getSize());
        System.out.println("WAIST "+WAIST.getSize());
        
    }
}
