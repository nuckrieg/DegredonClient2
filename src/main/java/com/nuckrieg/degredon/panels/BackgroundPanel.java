/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.panels;

import com.nuckrieg.degredon.specifics.OriginalKeeper;
import com.nuckrieg.degredon.specifics.Character;
import com.nuckrieg.degredon.specifics.Client;
import com.nuckrieg.degredon.specifics.Player;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ana
 */
public class BackgroundPanel extends javax.swing.JPanel {

//    private final BufferedImage player;
//    private Image background;
    public ArrayList<OriginalKeeper> allOriginals = new ArrayList<OriginalKeeper>();
    private Character character;
    private Player player;
    private String background;

    /**
     * Creates new form PickBackground
     * @param character
     * @param player
     */
    public BackgroundPanel(Character character, Player player) {
        this.character = character;
        this.player = player;
        initComponents();

    }
    
    public ArrayList<OriginalKeeper> getOriginals() {
        return allOriginals;
    }

    public void changeScale() {
        for (Component comp : this.getComponents()) {
            if (comp instanceof JButton || comp instanceof JLabel) {
                changeIconScale((JComponent) comp);
            }
        }
    }

    public void changeIconScale(JComponent component) {
        
        double scale = 0.3;
        Image origImage = null;
        Image finalImage = null;
        ImageIcon icon = null;

        if (component instanceof JButton) {
            icon = (ImageIcon) ((JButton) component).getIcon();
            origImage = icon.getImage();
            OriginalKeeper originals = new OriginalKeeper();
            originals.setButton((JButton)component);
            originals.setImage(origImage);
            allOriginals.add(originals);
          //  System.out.println(component.getSize());
            double localDivideScale = origImage.getWidth(null) / origImage.getHeight(null);
            finalImage = origImage.getScaledInstance((int) ((JButton) component).getWidth(), (int) (component.getWidth() / localDivideScale), Image.SCALE_FAST);
            ((JButton) component).setIcon(new ImageIcon(finalImage));

        }
//        if (component instanceof JLabel) {
//            icon = (ImageIcon) ((JLabel) component).getIcon();
//            origImage = icon.getImage();
//            double localDivideScale = origImage.getWidth(null) / origImage.getHeight(null);
//            finalImage = origImage.getScaledInstance((int) ((JLabel) component).getWidth(), (int) (component.getWidth() / localDivideScale), Image.SCALE_FAST);
//            ((JLabel) component).setIcon(new ImageIcon(finalImage));
//
//        }

    }
    
    
    
    public void setBackground(JButton x, ActionEvent origin, String background) {
        
//        for (OriginalKeeper original : getOriginals()) {
//            if ((JButton)origin.getSource() == original.getButton()) {
//                background = original.getString();
//                //background = original.getImage();
//            }
//        }
        SwingUtilities.windowForComponent((Component)origin.getSource()).dispose();
        
        this.background = background;
//        character.setBackground(new ImageIcon(background));
        player.setCharacter(character);
//        player.getCharacter().setBackground(new ImageIcon(background));
        player.setBackground(this.background);
        askServer();
        
       
        
        
    }
    
    public void askServer() {
          
        Client client = new Client();
        //Player actualPlayer = player;
        System.out.println("ASKING SERVER!!!");
//        player.setCharacter(character);
//        System.out.println(player.getCharacter());
//        System.out.println(player.getStats());
        client.sendData(player);
//        sentCount++;
//        if (sentCount % 2 == 0) {
//            client.receiveData();
//        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("WAITING FOR A MATCH!");
                client.receiveData();
            }
        }).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/abandonedBackalley.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/abandonedRuins.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/bellDay.gif"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/bellNight.gif"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/partyBoat.gif"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/rainyPark.gif"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/blanka.gif"))); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(1473, 909));
        jButton7.setMinimumSize(new java.awt.Dimension(1473, 909));
        jButton7.setPreferredSize(new java.awt.Dimension(1473, 909));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/waterfalls.gif"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/windmill.gif"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        intermediateBackground(evt,"/backgrounds/abandonedBackalley.gif");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         intermediateBackground(evt,"/backgrounds/abandonedRuins.gif");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         intermediateBackground(evt,"/backgrounds/bellDay.gif");// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         intermediateBackground(evt,"/backgrounds/bellNight.gif");// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         intermediateBackground(evt,"/backgrounds/partyBoat.gif");// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         intermediateBackground(evt,"/backgrounds/rainyPark.gif");// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         intermediateBackground(evt,"/backgrounds/blanka.gif");// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        intermediateBackground(evt,"/backgrounds/waterfalls.gif");// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        intermediateBackground(evt,"/backgrounds/windmill.gif");// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    
    
    private void intermediateBackground(ActionEvent evt, String string) {
        setBackground(((JButton)evt.getSource()),evt, string);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
