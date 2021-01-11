/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import com.nuckrieg.degredon.panels.StatsPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ana
 */
public class Character implements Serializable {

    private Icon head;
    private Icon hair;
    private Icon torso;
    private Icon rightArm;
    private Icon leftArm;
    private Icon waist;
    private Icon legs;
    private final JLabel legsL;
    private final JLabel waistL;
    private final JLabel leftArmL;
    private final JLabel rightArmL;
    private final JLabel torsoL;
    private final JLabel hairL;
    private final JLabel headL;
    private transient ImageIcon background;

    public Character(JLabel headL, JLabel hairL, JLabel torsoL, JLabel rightArmL, JLabel leftArmL, JLabel waistL, JLabel legsL) {
        this.headL = headL;
        this.hairL = hairL;
        this.torsoL = torsoL;
        this.rightArmL = rightArmL;
        this.leftArmL = leftArmL;
        this.waistL = waistL;
        this.legsL = legsL;
    }

    public Icon getHead() {
        return head;

    }

    public Icon getHair() {
        return hair;
    }

    public Icon getTorso() {
        return torso;
    }

    public Icon getRightArm() {
        return rightArm;
    }

    public Icon getLeftArm() {
        return leftArm;
    }

    public Icon getWaist() {
        return waist;
    }

    public Icon getLegs() {
        return legs;
    }

    public void setHead(Icon head) {
        this.head = head;
    }

    public void setHair(Icon hair) {
        this.hair = hair;
    }

    public void setTorso(Icon torso) {
        this.torso = torso;
    }

    public void setRightArm(Icon rightArm) {
        this.rightArm = rightArm;
    }

    public void setLeftArm(Icon leftArm) {
        this.leftArm = leftArm;
    }

    public void setWaist(Icon waist) {
        this.waist = waist;
    }

    public void setLegs(Icon legs) {
        this.legs = legs;
    }
    
    public void setBackground(ImageIcon background) {
        this.background = background;
    }
    
    public ImageIcon getBackground() {
        return background;
    }

//    public void createConcatenatedImage() {
//        if (nothingIsNull()) {
//            displayPanel(finalImage);
//        }
//    }

    public void displayPanel(Character character) {

        JFrame frame = new JFrame();
        frame.add(new StatsPanel(character));
        frame.pack();
        frame.setVisible(true);

    }

    public BufferedImage finalizeCharacter(Character character) {
        Icon localWaist = character.getWaist();
        Icon localLegs = character.getLegs();
        Icon localRightArm = character.getRightArm();
        Icon localLeftArm = character.getLeftArm();
        Icon localTorso = character.getTorso();
        Icon localHead = character.getHead();
        Icon localHair = character.getHair();
        final int width = rightArmL.getWidth() - 10 + torsoL.getWidth() + leftArmL.getWidth() - 10;
        final int height = headL.getHeight() + torsoL.getHeight() + waistL.getHeight() - 10 + legsL.getHeight();
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        g.drawImage(((ImageIcon) localWaist).getImage(), rightArmL.getWidth() - 10, hairL.getHeight() - 10 + torsoL.getHeight(), null);
        g.drawImage(((ImageIcon) localLegs).getImage(), rightArmL.getWidth() - 10, hairL.getHeight() - 10 + torsoL.getHeight() + waistL.getHeight(), null);
        g.drawImage(((ImageIcon) localRightArm).getImage(), 0, hairL.getHeight() - 10, null);
        g.drawImage(((ImageIcon) localLeftArm).getImage(), rightArmL.getWidth() - 10 + torsoL.getWidth() - 10, hairL.getHeight() - 10, null);
        g.drawImage(((ImageIcon) localTorso).getImage(), rightArmL.getWidth() - 10, hairL.getHeight() - 10, null);
        g.drawImage(((ImageIcon) localHead).getImage(), rightArmL.getWidth() + 20, 25, null);
        g.drawImage(((ImageIcon) localHair).getImage(), rightArmL.getWidth() + 10, 5, null);

        return bi;
    }

    private boolean nothingIsNull() {
        return getHead() == null ? false
                : getHair() == null ? false
                        : getTorso() == null ? false
                                : getRightArm() == null ? false
                                        : getLeftArm() == null ? false
                                                : getWaist() == null ? false
                                                        : getLegs() == null ? false
                                                                : true;
    }

//    public void setImage() {
//        
//    }

}
