package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class Sniper extends Ranger{
    private double critical;

    public double getCritical() {
        return critical;
    }

    public void setCritical(double critical) {
        this.critical = critical;
    }
    
    public double damageSP(){
        double dSP;
        dSP = basicAttack * vision * critical;
        return dSP;
    }
}
