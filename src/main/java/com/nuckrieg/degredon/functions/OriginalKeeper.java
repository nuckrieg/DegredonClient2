/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.functions;

import java.awt.Image;
import javax.swing.JButton;

/**
 *
 * @author Ana
 */
public class OriginalKeeper {

    private Image image;
    private JButton button;

    public OriginalKeeper() {

    }

    public JButton getButton() {
        return button;

    }

    public Image getImage() {
        return image;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
