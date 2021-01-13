/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import java.io.Serializable;

/**
 *
 * @author Nuckrieg
 */
public class Damage implements Serializable{
    private final String damage;

    public Damage(String damage) {
        this.damage = damage;
    }        
    
    
    public String getDamage() {
        return damage;
    }
   

    // Override equals however you want here

 
     

}
