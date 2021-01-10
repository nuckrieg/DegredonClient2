/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import java.io.Serializable;

/**
 *
 * @author FabioAbreu
 */
public class Unit implements Serializable{
    
    
    Stats stats;
    String name = "Undefined";
    private Character character;

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
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
    
    

//    public void setStatGrowth() {
//
//    }

}