/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.functions;

import com.nuckrieg.degredon.specifics.Player;
import com.nuckrieg.degredon.specifics.Stats;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author FabioAbreu
 */
public class Calculator implements Serializable {

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    Stats p1Stats;
    Stats p2Stats;
    private float currentHp = 0;

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }
    
    

    public float fight(Player p1, Player p2) {
        p1Stats = p1.getStats();
        //    System.out.println(p1Stats);
        p2Stats = p2.getStats();
        //  System.out.println(p2Stats);
        float p1DamageDealt = p1Stats.PHYS_DMG;
        final float originalDamage = p1DamageDealt;
        // System.out.println("DAMAGE IS: " + p1DamageDealt);
        if (!isAttackDodged()) {
            if (isAttackCritical()) {
                p1DamageDealt *= (p1Stats.CRIT_SEV + 1.5);
                //  System.out.println("DAMAGE IS: " + p1DamageDealt);
            }
            if (isAttackGuarded()) {
                p1DamageDealt = getGuardEfficiency(p1DamageDealt);
                //   System.out.println("DAMAGE IS: " + p1DamageDealt);
            }
            p1DamageDealt = getPhysicalReduction(p1DamageDealt);

            // System.out.println("DAMAGE IS: " + p1DamageDealt);
        } else {
            p1DamageDealt = 0;
        }
        return p1DamageDealt;

    }

    public float getPhysicalReduction(float damage) {
        damage = damage * (1 - p2Stats.PHYS_RES);
        return damage;
    }

    public float getGuardEfficiency(float damage) {

        float p2Guard = p2Stats.GUARD_CHANCE;
        float p2GuardPercentage = p2Guard * 100;
        float multiplier = 1;
        float severity = 0.15f;
        float formula = 1;
        if (between((int) p2GuardPercentage, 0, 100)) {
            formula = 1;
        }
        if (between((int) p2GuardPercentage, 101, 200)) {
            formula = 0.72f;
        }
        if (between((int) p2GuardPercentage, 201, 300)) {
            formula = 0.4608f;
        }
        if (between((int) p2GuardPercentage, 301, 400)) {
            formula = 0.2949f;
        }
        if (between((int) p2GuardPercentage, 401, 500)) {
            formula = 0.1887f;
        }
        if (p2GuardPercentage > 500) {
            formula = 0.1208f;
        }
        multiplier = multiplier + (multiplier * formula);
        severity = severity * multiplier;
        damage = damage * (1 - severity);
        return damage;
    }

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }

    public void setCurrentHp(Player player, float damageDealt, JProgressBar healtBar) {
        float newCurrentHp1 = player.getCurrentHp() == -1 ? player.getStats().MAX_HP : player.getCurrentHp();
        float newCurrentHp2 = newCurrentHp1 - damageDealt;
        healtBar.setValue((int)newCurrentHp2);
        
       // changes.firePropertyChange("currentHp", null, newCurrentHp2);
        player.setCurrentHp(newCurrentHp2);
        

    }
    
    public void setCurrentHp(Player player, float damageDealt) {
        float newCurrentHp1 = player.getCurrentHp() == -1 ? player.getStats().MAX_HP : player.getCurrentHp();
        float newCurrentHp2 = newCurrentHp1 - damageDealt;
       
        
       // changes.firePropertyChange("currentHp", null, newCurrentHp2);
        player.setCurrentHp(newCurrentHp2);
        

    }
    

    public float getCurrentHp(Player player) {
        return player.getCurrentHp() == -1 ? player.getStats().MAX_HP : player.getCurrentHp();
    }

    public float getAttackDelay(Player player) {
        return ((1 / ((player.getStats().MOVE_SPD * 0.01f) / 3f)) * 1000);
    }

    public boolean isAttackDodged() {

        float p1Hit = p1Stats.HIT_CHANCE;
//        System.out.println("PLAYER 1 HIT CHANCE: " + p1Hit * 100 + "%");
        float p2Dodge = p2Stats.DODGE_CHANCE;
//        System.out.println("PLAYER 2 DODGE CHANCE: " + p2Dodge * 100 + "%");
        float effectiveHitChance = p1Hit * (1 - p2Dodge);
        float effectiveHitChanceInPercentage = effectiveHitChance * 100000;
        float randomNumber = new Random().nextInt(100000);
//        System.out.println("RANDOM NUMBER IS: "+randomNumber + " VERSUS: "+effectiveHitChanceInPercentage);
//        System.out.println("FINALIZED HIT CHANCE: " + effectiveHitChance * 100 + "%");
        boolean isDodged = randomNumber > effectiveHitChanceInPercentage;
        //   System.out.println("HIT? " + !isDodged + " (" + effectiveHitChance * 100 + "% HIT CHANCE)");
        if (isDodged) {
            //  JOptionPane.showConfirmDialog(null, "Your attack missed!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
//        System.out.println("ATTACK WAS DODGED??? "+isDodged);

        return isDodged;

    }

    public boolean isAttackCritical() {
        float p1Crit = p1Stats.CRIT_CHANCE;
        float p1CritPercentage = p1Crit * 100;
        //System.out.println(p1CritPercentage);
        float p1CritForRandomComparison = p1Crit * 100000;
        float randomNumber = new Random().nextInt(100000);
        boolean isCritical = randomNumber <= p1CritForRandomComparison;
        //  System.out.println("CRITICAL? " + isCritical + " (" + p1CritPercentage + "% CRIT CHANCE)");
        return isCritical;
    }

    public boolean isAttackGuarded() {
        float p2Guard = p2Stats.GUARD_CHANCE;
        float p2GuardPercentage = p2Guard * 100;
        //System.out.println(p2GuardPercentage);
        float p2GuardForRandomComparison = p2Guard * 100000;
        float randomNumber = new Random().nextInt(100000);
        boolean isGuarded = randomNumber <= p2GuardForRandomComparison;
        //  System.out.println("GUARDED? " + isGuarded + " (" + p2GuardPercentage + "% GUARD CHANCE)");

        return isGuarded;
    }

    public void testPercentages() {
        int menores = 0;
        int maiores = 0;
        for (int i = 0; i < 100000; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(100000);
            if (randomInt < 50000) {
                menores++;
            } else {
                maiores++;
            }
        }
//        System.out.println("MENORES: " + menores);
//        System.out.println("MAIORES: " + maiores);
    }
}
