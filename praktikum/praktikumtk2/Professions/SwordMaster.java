package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class SwordMaster extends Fighter{
    private double evasion;

    public double getEvasion() {
        return evasion;
    }

    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }
    
    public double damageSM(){
        double dSM;
        dSM = basicAttack * aura * evasion;
        return dSM;
    }
}
