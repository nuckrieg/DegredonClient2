/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.panels;

import com.nuckrieg.degredon.specifics.Character;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ana
 */
public class CharacterPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public CharacterPanel() {
        initComponents();
        initCombos();
        setIcons();
    }

    private void initCombos() {

        hairCombo.setModel(new DefaultComboBoxModel<>(new String[]{"hair1", "hair2", "hair3", "hair4", "hair5"}));
        headCombo.setModel(new DefaultComboBoxModel<>(new String[]{"face1", "face2", "face3", "face4", "face5", "face6", "face7", "face8", "face9", "face10"}));
        torsoCombo.setModel(new DefaultComboBoxModel<>(new String[]{"torso1", "torso2", "torso3", "torso4", "torso5"}));
        armsCombo.setModel(new DefaultComboBoxModel<>(new String[]{"arm1", "arm2", "arm3"}));
        waistCombo.setModel(new DefaultComboBoxModel<>(new String[]{"waist1", "waist2", "waist3"}));
        legsCombo.setModel(new DefaultComboBoxModel<>(new String[]{"legs1", "legs2", "legs3", "legs4", "legs5"}));
    }

    private void setIcons() {
        HAIR.setIcon(new ImageIcon(getClass().getResource("/hairs/" + hairCombo.getSelectedItem().toString() + ".png"))); // NOI18N
        HEAD.setIcon(new ImageIcon(getClass().getResource("/faces/" + headCombo.getSelectedItem().toString() + ".png")));
        TORSO.setIcon(new ImageIcon(getClass().getResource("/torsos/" + torsoCombo.getSelectedItem().toString() + ".png")));
        RIGHT_ARM.setIcon(new ImageIcon(getClass().getResource("/arms/r" + armsCombo.getSelectedItem().toString() + ".png")));
        LEFT_ARM.setIcon(new ImageIcon(getClass().getResource("/arms/l" + armsCombo.getSelectedItem().toString() + ".png")));
        WAIST.setIcon(new ImageIcon(getClass().getResource("/waists/" + waistCombo.getSelectedItem().toString() + ".png")));
        LEGS.setIcon(new ImageIcon(getClass().getResource("/legs/" + legsCombo.getSelectedItem().toString() + ".png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        HAIR = new javax.swing.JLabel();
        HEAD = new javax.swing.JLabel();
        TORSO = new javax.swing.JLabel();
        RIGHT_ARM = new javax.swing.JLabel();
        LEFT_ARM = new javax.swing.JLabel();
        LEGS = new javax.swing.JLabel();
        WAIST = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        hairCombo = new javax.swing.JComboBox<>();
        headCombo = new javax.swing.JComboBox<>();
        torsoCombo = new javax.swing.JComboBox<>();
        armsCombo = new javax.swing.JComboBox<>();
        waistCombo = new javax.swing.JComboBox<>();
        legsCombo = new javax.swing.JComboBox<>();
        resetButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HAIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hairs/hair1.png"))); // NOI18N
        HAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(HAIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 110));

        HEAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faces/face1.png"))); // NOI18N
        HEAD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(HEAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 150));

        TORSO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TORSO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/torsos/torso4.png"))); // NOI18N
        jPanel1.add(TORSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, 220));

        RIGHT_ARM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arms/rarm3.png"))); // NOI18N
        jPanel1.add(RIGHT_ARM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 40, 280));

        LEFT_ARM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arms/larm3.png"))); // NOI18N
        jPanel1.add(LEFT_ARM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 40, 280));

        LEGS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEGS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/legs/legs3.png"))); // NOI18N
        jPanel1.add(LEGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 150, 340));

        WAIST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WAIST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waists/waist1.png"))); // NOI18N
        WAIST.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(WAIST, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 150, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("HAIR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setText("HEAD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("TORSO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("ARMS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("WAIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText("LEGS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel6, gridBagConstraints);

        jButton1.setText("<");
        jButton1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton1.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setText("<");
        jButton2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton2.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton2.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jButton2, gridBagConstraints);

        jButton3.setText("<");
        jButton3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton3.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton3.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton3.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jButton3, gridBagConstraints);

        jButton4.setText("<");
        jButton4.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton4.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton4.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton4.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jButton4, gridBagConstraints);

        jButton5.setText("<");
        jButton5.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton5.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton5.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton5.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jButton5, gridBagConstraints);

        jButton6.setText("<");
        jButton6.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton6.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton6.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton6.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jButton6, gridBagConstraints);

        jButton8.setText(">");
        jButton8.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton8.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton8.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton8.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jButton8, gridBagConstraints);

        jButton9.setText(">");
        jButton9.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton9.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton9.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton9.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jButton9, gridBagConstraints);

        jButton10.setText(">");
        jButton10.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton10.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton10.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton10.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jButton10, gridBagConstraints);

        jButton11.setText(">");
        jButton11.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton11.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton11.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton11.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jButton11, gridBagConstraints);

        jButton12.setText(">");
        jButton12.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton12.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton12.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton12.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jButton12, gridBagConstraints);

        jButton13.setText(">");
        jButton13.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton13.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton13.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton13.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jButton13, gridBagConstraints);

        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 5, 5, 5);
        jPanel2.add(acceptButton, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 5, 5, 5);
        jPanel2.add(cancelButton, gridBagConstraints);

        randomButton.setText("Random");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 5, 5, 5);
        jPanel2.add(randomButton, gridBagConstraints);

        hairCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hair1", "hair2", "hair3", "hair4", "hair5" }));
        hairCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hairComboActionPerformed(evt);
            }
        });
        hairCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                hairComboPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 50;
        jPanel2.add(hairCombo, gridBagConstraints);

        headCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        headCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 50;
        jPanel2.add(headCombo, gridBagConstraints);

        torsoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        torsoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torsoComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 50;
        jPanel2.add(torsoCombo, gridBagConstraints);

        armsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        armsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armsComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 50;
        jPanel2.add(armsCombo, gridBagConstraints);

        waistCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        waistCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waistComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 50;
        jPanel2.add(waistCombo, gridBagConstraints);

        legsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        legsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legsComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 50;
        jPanel2.add(legsCombo, gridBagConstraints);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 5, 5, 5);
        jPanel2.add(resetButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hairComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_hairComboPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_hairComboPropertyChange

    private void hairComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hairComboActionPerformed
        // TODO add your handling code here:
        setIcons();
    }//GEN-LAST:event_hairComboActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if ((hairCombo.getSelectedIndex() + 1) < hairCombo.getItemCount()) {
            hairCombo.setSelectedIndex(hairCombo.getSelectedIndex() + 1);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ((hairCombo.getSelectedIndex()) != 0) {
            hairCombo.setSelectedIndex(hairCombo.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if ((headCombo.getSelectedIndex()) != 0) {
            headCombo.setSelectedIndex(headCombo.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if ((torsoCombo.getSelectedIndex()) != 0) {
            torsoCombo.setSelectedIndex(torsoCombo.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if ((armsCombo.getSelectedIndex()) != 0) {
            armsCombo.setSelectedIndex(armsCombo.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if ((waistCombo.getSelectedIndex()) != 0) {
            waistCombo.setSelectedIndex(waistCombo.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if ((legsCombo.getSelectedIndex()) != 0) {
            legsCombo.setSelectedIndex(legsCombo.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if ((headCombo.getSelectedIndex() + 1) < headCombo.getItemCount()) {
            headCombo.setSelectedIndex(headCombo.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if ((torsoCombo.getSelectedIndex() + 1) < torsoCombo.getItemCount()) {
            torsoCombo.setSelectedIndex(torsoCombo.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if ((armsCombo.getSelectedIndex() + 1) < armsCombo.getItemCount()) {
            armsCombo.setSelectedIndex(armsCombo.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if ((waistCombo.getSelectedIndex() + 1) < waistCombo.getItemCount()) {
            waistCombo.setSelectedIndex(waistCombo.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if ((legsCombo.getSelectedIndex() + 1) < legsCombo.getItemCount()) {
            legsCombo.setSelectedIndex(legsCombo.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void headComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headComboActionPerformed
        setIcons();
    }//GEN-LAST:event_headComboActionPerformed

    private void torsoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torsoComboActionPerformed
        // TODO add your handling code here:
        setIcons();
    }//GEN-LAST:event_torsoComboActionPerformed

    private void armsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armsComboActionPerformed
        // TODO add your handling code here:
        setIcons();
    }//GEN-LAST:event_armsComboActionPerformed

    private void waistComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waistComboActionPerformed
        // TODO add your handling code here:
        setIcons();
    }//GEN-LAST:event_waistComboActionPerformed

    private void legsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legsComboActionPerformed
        // TODO add your handling code here:
        setIcons();
    }//GEN-LAST:event_legsComboActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        // TODO add your handling code here:
        Character character = new Character(HEAD,HAIR,TORSO,RIGHT_ARM,LEFT_ARM,WAIST,LEGS);
        character.setHair(HAIR.getIcon());
        character.setHead(HEAD.getIcon());
        character.setTorso(TORSO.getIcon());
        character.setRightArm(RIGHT_ARM.getIcon());
        character.setLeftArm(LEFT_ARM.getIcon());
        character.setWaist(WAIST.getIcon());
        character.setLegs(LEGS.getIcon());
        
        character.displayPanel(character);
        
        
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        hairCombo.setSelectedIndex(0);
        headCombo.setSelectedIndex(0);
        torsoCombo.setSelectedIndex(0);
        armsCombo.setSelectedIndex(0);
        waistCombo.setSelectedIndex(0);
        legsCombo.setSelectedIndex(0);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        // TODO add your handling code here:
        hairCombo.setSelectedIndex(new Random().nextInt(hairCombo.getItemCount()));
        headCombo.setSelectedIndex(new Random().nextInt(headCombo.getItemCount()));
        torsoCombo.setSelectedIndex(new Random().nextInt(torsoCombo.getItemCount()));
        armsCombo.setSelectedIndex(new Random().nextInt(armsCombo.getItemCount()));
        waistCombo.setSelectedIndex(new Random().nextInt(waistCombo.getItemCount()));
        legsCombo.setSelectedIndex(new Random().nextInt(legsCombo.getItemCount()));
    }//GEN-LAST:event_randomButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        JFrame mother = (JFrame)SwingUtilities.getWindowAncestor((Component)evt.getSource());
        mother.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel HAIR;
    public static javax.swing.JLabel HEAD;
    public static javax.swing.JLabel LEFT_ARM;
    public static javax.swing.JLabel LEGS;
    public static javax.swing.JLabel RIGHT_ARM;
    public static javax.swing.JLabel TORSO;
    public static javax.swing.JLabel WAIST;
    private javax.swing.JButton acceptButton;
    private javax.swing.JComboBox<String> armsCombo;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> hairCombo;
    private javax.swing.JComboBox<String> headCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> legsCombo;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> torsoCombo;
    private javax.swing.JComboBox<String> waistCombo;
    // End of variables declaration//GEN-END:variables
}
