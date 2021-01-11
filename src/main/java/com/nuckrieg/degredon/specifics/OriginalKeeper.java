/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import java.awt.Image;
import javax.swing.JButton;

/**
 *
 * @author Ana
 */
public class OriginalKeeper {

    private Image image;
    private JButton button;
    private String string;

    public OriginalKeeper() {

    }

    public JButton getButton() {
        return button;
    }

    public Image getImage() {
        return image;
    }
    
    public String getString() {
        return string;
    }
    
    public void setString(String string) {
        this.string = string;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
