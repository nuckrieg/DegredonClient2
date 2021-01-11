/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author FabioAbreu
 */
public class Unit implements Serializable{
    
    
    private Stats stats;
    private String name = "Undefined";
    private Character character;
    private String background;
    private float currentHp = -1;

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
    }
    
    public float getCurrentHp() {
       // System.out.println(currentHp == -1 ? getStats().MAX_HP : currentHp);
        return currentHp == -1 ? getStats().MAX_HP : currentHp;
    }
    
    public void setCurrentHp(float currentHp) {
        //System.out.println("SETTTING HP AS "+currentHp);
        this.currentHp = currentHp;
    }
    
    public boolean isEnemy(Unit unit) {
        return unit instanceof Enemy;
    }
    
    public boolean isPlayer(Unit unit) {
        return unit instanceof Player;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public Character getCharacter() {
        return character;
    }
    
    public void setBackground(String background) {
        this.background = background;
    }
    
    public String getBackground() {
        return background;
    }
    
    

//    public void setStatGrowth() {
//
//    }

}
