/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.client;

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

    public int STRENGTH;
    public float PHYS_DMG;
    public float CRIT_SEV;

    public int INTELLIGENCE;
    public float MAX_MP;
    public float MAGIC_RES;

    public int MEDITATION;
    public float HP_RGN;
    public float MP_RGN;

    public int SPIRIT;
    public float MAGIC_DMG;
    public float GUARD_CHANCE;

    public int QUICKNESS;
    public float MOVE_SPD;
    public float DODGE_CHANCE;

    public int AGILITY;
    public float CRIT_CHANCE;
    public float HIT_CHANCE;

    public int ARCANE;
    public float COOLDOWN_RED;
    public float RES_PENETRATION;

    public int AFFINITY;
    public float ELEMENTAL_DMG;
    public float ELEMENTAL_RES;

    public int WATER;
    public float WATER_DMG;
    public float WATER_RES;

    public int FIRE;
    public float FIRE_DMG;
    public float FIRE_RES;

    public int AIR;
    public float AIR_DMG;
    public float AIR_RES;

    public int LIGHT;
    public float LIGHT_DMG;
    public float LIGHT_RES;

    public int ICE;
    public float ICE_DMG;
    public float ICE_RES;

    public int DARK;
    public float DARK_DMG;
    public float DARK_RES;

    public int EARTH;
    public float EARTH_DMG;
    public float EARTH_RES;

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
        CONSTITUTION = stat;
        MAX_HP = CONSTITUTION * 24;
        PHYS_RES = CONSTITUTION * 0.0001f;
    }

    public void setStrength(int stat) {
        STRENGTH = stat;
        PHYS_DMG = STRENGTH * 7;
        CRIT_SEV = STRENGTH * 0.001355f;
    }

    public void setIntelligence(int stat) {
        INTELLIGENCE = stat;
        MAX_MP = INTELLIGENCE * 8;
        MAGIC_RES = INTELLIGENCE * 0.0001f;
    }

    public void setMeditation(int stat) {
        MEDITATION = stat;
        HP_RGN = MEDITATION * 0.12f;
        MP_RGN = MEDITATION * 0.02f;
    }

    public void setSpirit(int stat) {
        SPIRIT = stat;
        MAGIC_DMG = SPIRIT * 7;
        GUARD_CHANCE = SPIRIT * 0.000625f;
    }

    public void setQuickness(int stat) {
        QUICKNESS = stat;
        MOVE_SPD = QUICKNESS * 0.1256f;
        DODGE_CHANCE = QUICKNESS * 0.000125f;
    }

    public void setAgility(int stat) {
        AGILITY = stat;
        CRIT_CHANCE = AGILITY * 0.000115f;
        HIT_CHANCE = AGILITY * 0.001f;
    }

    public void setArcane(int stat) {
        ARCANE = stat;
        COOLDOWN_RED = ARCANE * 0.0001f;
        RES_PENETRATION = 0.000057f;
    }

    public void setAffinity(int stat) {
        AFFINITY = stat;
        ELEMENTAL_DMG = AFFINITY * 1;
        ELEMENTAL_RES = AFFINITY * 0.0000165f;
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
            WATER = stat;
        }
        WATER_DMG = (WATER * 7) + ELEMENTAL_DMG;
        WATER_RES = (WATER * 0.0001158f) + ELEMENTAL_RES;
    }

    public void setFire(int stat) {
        if (stat != -1) {
            FIRE = stat;
        }
        FIRE_DMG = (FIRE * 7) + ELEMENTAL_DMG;
        FIRE_RES = (FIRE * 0.0001158f) + ELEMENTAL_RES;
    }

    public void setAir(int stat) {
        if (stat != -1) {
            AIR = stat;
        }
        AIR_DMG = (AIR * 7) + ELEMENTAL_DMG;
        AIR_RES = (AIR * 0.0001158f) + ELEMENTAL_RES;
    }

    public void setLight(int stat) {
        if (stat != -1) {
            LIGHT = stat;
        }
        LIGHT_DMG = (LIGHT * 7) + ELEMENTAL_DMG;
        LIGHT_RES = (LIGHT * 0.0001158f) + ELEMENTAL_RES;
    }

    public void setIce(int stat) {
        if (stat != -1) {
            ICE = stat;
        }
        ICE_DMG = (ICE * 7) + ELEMENTAL_DMG;
        ICE_RES = (ICE * 0.0001158f) + ELEMENTAL_RES;
    }

    public void setDark(int stat) {
        if (stat != -1) {
            DARK = stat;
        }
        DARK_DMG = (DARK * 7) + ELEMENTAL_DMG;
        DARK_RES = (DARK * 0.0001158f) + ELEMENTAL_RES;
    }

    public void setEarth(int stat) {
        if (stat != -1) {
            EARTH = stat;
        }

        EARTH_DMG = (EARTH * 7) + ELEMENTAL_DMG;
        EARTH_RES = (EARTH * 0.0001158f) + ELEMENTAL_RES;
    }

}
