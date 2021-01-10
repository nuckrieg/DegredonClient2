/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import com.nuckrieg.degredon.panels.BackgroundPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ana
 */
public class Character {

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

    public void createConcatenatedImage() {
        if (nothingIsNull()) {
            BufferedImage finalImage = finalizeCharacter(getHead(), getHair(), getTorso(), getRightArm(), getLeftArm(), getWaist(), getLegs());
            displayPanel(finalImage);
        }
    }

    public void displayPanel(BufferedImage image) {
        JFrame frame = new JFrame();
        BackgroundPanel backgroundPicker = new BackgroundPanel(image);

        //  JPanel panel = new GameScreen(image);
        // panel.setBackground(Color.red);
        frame.setSize(1440, 900);

        //  frame.add(new ImagePanel(new ImageIcon("backgrounds/streetAnime.png").getImage()));
        frame.add(backgroundPicker/*panel*/);

        frame.setResizable(false);
        //   frame.pack();
        frame.setVisible(true);
        backgroundPicker.changeScale();

    }

    public BufferedImage finalizeCharacter(Icon head, Icon hair, Icon torso, Icon rightArm, Icon leftArm, Icon waist, Icon legs) {

        final int width = rightArmL.getWidth() - 10 + torsoL.getWidth() + leftArmL.getWidth() - 10;
        final int height = headL.getHeight() + torsoL.getHeight() + waistL.getHeight() - 10 + legsL.getHeight();
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        g.drawImage(((ImageIcon) waist).getImage(), rightArmL.getWidth() - 10, hairL.getHeight() - 10 + torsoL.getHeight(), null);
        g.drawImage(((ImageIcon) legs).getImage(), rightArmL.getWidth() - 10, hairL.getHeight() - 10 + torsoL.getHeight() + waistL.getHeight(), null);
        g.drawImage(((ImageIcon) rightArm).getImage(), 0, hairL.getHeight() - 10, null);
        g.drawImage(((ImageIcon) leftArm).getImage(), rightArmL.getWidth() - 10 + torsoL.getWidth() - 10, hairL.getHeight() - 10, null);
        g.drawImage(((ImageIcon) torso).getImage(), rightArmL.getWidth() - 10, hairL.getHeight() - 10, null);
        g.drawImage(((ImageIcon) head).getImage(), rightArmL.getWidth() + 20, 25, null);
        g.drawImage(((ImageIcon) hair).getImage(), rightArmL.getWidth() + 10, 5, null);

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

}
