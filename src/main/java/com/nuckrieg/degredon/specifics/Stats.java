/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author FabioAbreu
 */
public class Stats implements Serializable {

    public int CONSTITUTION;
    public float MAX_HP;
    public float PHYS_RES;

    public int BASE_CONSTITUTION = 5;
    public float BASE_MAX_HP = 1500;
    public float BASE_PHYS_RES = 0.05f;

    public int STRENGTH;
    public float PHYS_DMG;
    public float CRIT_SEV;

    public int BASE_STRENGTH = 5;
    public float BASE_PHYS_DMG = 350;
    public float BASE_CRIT_SEV = 1.5f;

    public int INTELLIGENCE;
    public float MAX_MP;
    public float MAGIC_RES;

    public int BASE_INTELLIGENCE = 5;
    public float BASE_MAX_MP = 500;
    public float BASE_MAGIC_RES = 0.05f;

    public int MEDITATION;
    public float HP_RGN;
    public float MP_RGN;

    public int BASE_MEDITATION = 5;
    public float BASE_HP_RGN = 6;
    public float BASE_MP_RGN = 1;

    public int SPIRIT;
    public float MAGIC_DMG;
    public float GUARD_CHANCE;

    public int BASE_SPIRIT = 5;
    public float BASE_MAGIC_DMG = 350;
    public float BASE_GUARD_CHANCE = 0.05f;

    public int QUICKNESS;
    public float MOVE_SPD;
    public float DODGE_CHANCE;

    public int BASE_QUICKNESS = 5;
    public float BASE_MOVE_SPD = 250;
    public float BASE_DODGE_CHANCE = 0.05f;

    public int AGILITY;
    public float CRIT_CHANCE;
    public float HIT_CHANCE;
    
     public int BASE_AGILITY = 5;
    public float BASE_CRIT_CHANCE = 0.05f;
    public float BASE_HIT_CHANCE = 0.85f;

    public int ARCANE;
    public float COOLDOWN_RED;
    public float RES_PENETRATION;
    
    public int BASE_ARCANE = 5;
    public float BASE_COOLDOWN_RED = 0.05f;
    public float BASE_RES_PENETRATION = 0.05f;

    public int AFFINITY;
    public float ELEMENTAL_DMG;
    public float ELEMENTAL_RES;
    
    public int BASE_AFFINITY = 7;
    public float BASE_ELEMENTAL_DMG = 350;
    public float BASE_ELEMENTAL_RES = 0.07f;

    public int WATER;
    public float WATER_DMG;
    public float WATER_RES;
    
    public int BASE_WATER = 4;
    public float BASE_WATER_DMG = 300;
    public float BASE_WATER_RES = 0.04f;

    public int FIRE;
    public float FIRE_DMG;
    public float FIRE_RES;
    
    public int BASE_FIRE = 4;
    public float BASE_FIRE_DMG = 300;
    public float BASE_FIRE_RES = 0.04f;

    public int AIR;
    public float AIR_DMG;
    public float AIR_RES;
    
    public int BASE_AIR = 4;
    public float BASE_AIR_DMG = 300;
    public float BASE_AIR_RES = 0.04f;

    public int LIGHT;
    public float LIGHT_DMG;
    public float LIGHT_RES;
    
    public int BASE_LIGHT = 4;
    public float BASE_LIGHT_DMG = 300;
    public float BASE_LIGHT_RES = 0.04f;

    public int ICE;
    public float ICE_DMG;
    public float ICE_RES;
    
    public int BASE_ICE = 4;
    public float BASE_ICE_DMG = 300;
    public float BASE_ICE_RES = 0.04f;

    public int DARK;
    public float DARK_DMG;
    public float DARK_RES;
    
    public int BASE_DARK = 4;
    public float BASE_DARK_DMG = 300;
    public float BASE_DARK_RES = 0.04f;

    public int EARTH;
    public float EARTH_DMG;
    public float EARTH_RES;
    
    public int BASE_EARTH = 4;
    public float BASE_EARTH_DMG = 300;
    public float BASE_EARTH_RES = 0.04f;

    DecimalFormat df;

    public Stats() {
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
    }

    public void setAll(int stat) {
        setConstitution(stat);
        setStrength(stat);
        setIntelligence(stat);
        setMeditation(stat);
        setSpirit(stat);
        setQuickness(stat);
        setAgility(stat);
        setArcane(stat);
        setAffinity(stat);
        setWater(stat);
        setFire(stat);
        setAir(stat);
        setLight(stat);
        setIce(stat);
        setDark(stat);
        setEarth(stat);
    }

    public void randomizeAllStats() {
        setConstitution(new Random().nextInt(6253));
        setStrength(new Random().nextInt(6253));
        setIntelligence(new Random().nextInt(6253));
        setMeditation(new Random().nextInt(6253));
        setSpirit(new Random().nextInt(6253));
        setQuickness(new Random().nextInt(6253));
        setAgility(new Random().nextInt(6253));
        setArcane(new Random().nextInt(6253));
        setAffinity(new Random().nextInt(6253));
        setWater(new Random().nextInt(6253));
        setFire(new Random().nextInt(6253));
        setAir(new Random().nextInt(6253));
        setLight(new Random().nextInt(6253));
        setIce(new Random().nextInt(6253));
        setDark(new Random().nextInt(6253));
        setEarth(new Random().nextInt(6253));
    }

    public void setConstitution(int stat) {
        CONSTITUTION = stat + BASE_CONSTITUTION;
        MAX_HP = CONSTITUTION * 24 + BASE_MAX_HP;
        PHYS_RES = CONSTITUTION * 0.0001f + BASE_PHYS_RES;
    }

    public void setStrength(int stat) {
        STRENGTH = stat + BASE_STRENGTH;
        PHYS_DMG = STRENGTH * 7 + BASE_PHYS_DMG;
        CRIT_SEV = STRENGTH * 0.001355f + BASE_CRIT_SEV;
    }

    public void setIntelligence(int stat) {
        INTELLIGENCE = stat + BASE_INTELLIGENCE;
        MAX_MP = INTELLIGENCE * 8 + BASE_MAX_MP;
        MAGIC_RES = INTELLIGENCE * 0.0001f + BASE_MAGIC_RES;
    }

    public void setMeditation(int stat) {
        MEDITATION = stat + BASE_MEDITATION;
        HP_RGN = MEDITATION * 0.12f + BASE_HP_RGN;
        MP_RGN = MEDITATION * 0.02f + BASE_MP_RGN;
    }

    public void setSpirit(int stat) {
        SPIRIT = stat + BASE_SPIRIT;
        MAGIC_DMG = SPIRIT * 7 + BASE_MAGIC_DMG;
        GUARD_CHANCE = SPIRIT * 0.000625f + BASE_GUARD_CHANCE;
    }

    public void setQuickness(int stat) {
        QUICKNESS = stat + BASE_QUICKNESS;
        MOVE_SPD = QUICKNESS * 0.1256f + BASE_MOVE_SPD;
        DODGE_CHANCE = QUICKNESS * 0.000125f + BASE_DODGE_CHANCE;
    }

    public void setAgility(int stat) {
        AGILITY = stat + BASE_AGILITY;
        CRIT_CHANCE = AGILITY * 0.000115f + BASE_CRIT_CHANCE;
        HIT_CHANCE = AGILITY * 0.001f + BASE_HIT_CHANCE;
    }

    public void setArcane(int stat) {
        ARCANE = stat + BASE_ARCANE;
        COOLDOWN_RED = ARCANE * 0.0001f + BASE_COOLDOWN_RED;
        RES_PENETRATION = 0.000057f + BASE_RES_PENETRATION;
    }

    public void setAffinity(int stat) {
        AFFINITY = stat + BASE_AFFINITY;
        ELEMENTAL_DMG = AFFINITY * 1 + BASE_ELEMENTAL_DMG;
        ELEMENTAL_RES = AFFINITY * 0.0000165f + BASE_ELEMENTAL_RES;
        setElementals(-1);
    }

    public void setElementals(int stat) {
        setWater(stat);
        setFire(stat);
        setAir(stat);
        setLight(stat);
        setIce(stat);
        setDark(stat);
        setEarth(stat);

    }

    public void setWater(int stat) {
        if (stat != -1) {
            WATER = stat + BASE_WATER;
        }
        WATER_DMG = (WATER * 7) + ELEMENTAL_DMG + BASE_WATER_DMG;
        WATER_RES = (WATER * 0.0001158f) + ELEMENTAL_RES + BASE_WATER_RES;
    }

    public void setFire(int stat) {
        if (stat != -1) {
            FIRE = stat + BASE_FIRE;
        }
        FIRE_DMG = (FIRE * 7) + ELEMENTAL_DMG + BASE_FIRE_DMG;
        FIRE_RES = (FIRE * 0.0001158f) + ELEMENTAL_RES + BASE_FIRE_RES;
    }

    public void setAir(int stat) {
        if (stat != -1) {
            AIR = stat + BASE_AIR;
        }
        AIR_DMG = (AIR * 7) + ELEMENTAL_DMG + BASE_AIR_DMG;
        AIR_RES = (AIR * 0.0001158f) + ELEMENTAL_RES + BASE_AIR_RES;
    }

    public void setLight(int stat) {
        if (stat != -1) {
            LIGHT = stat + BASE_LIGHT;
        }
        LIGHT_DMG = (LIGHT * 7) + ELEMENTAL_DMG + BASE_LIGHT_DMG;
        LIGHT_RES = (LIGHT * 0.0001158f) + ELEMENTAL_RES + BASE_LIGHT_RES;
    }

    public void setIce(int stat) {
        if (stat != -1) {
            ICE = stat + BASE_ICE;
        }
        ICE_DMG = (ICE * 7) + ELEMENTAL_DMG + BASE_ICE_DMG;
        ICE_RES = (ICE * 0.0001158f) + ELEMENTAL_RES + BASE_ICE_RES;
    }

    public void setDark(int stat) {
        if (stat != -1) {
            DARK = stat + BASE_DARK;
        }
        DARK_DMG = (DARK * 7) + ELEMENTAL_DMG + BASE_DARK_DMG;
        DARK_RES = (DARK * 0.0001158f) + ELEMENTAL_RES + BASE_DARK_RES;
    }

    public void setEarth(int stat) {
        if (stat != -1) {
            EARTH = stat + BASE_EARTH;
        }

        EARTH_DMG = (EARTH * 7) + ELEMENTAL_DMG + BASE_EARTH_DMG;
        EARTH_RES = (EARTH * 0.0001158f) + ELEMENTAL_RES + BASE_EARTH_RES;
    }

}
