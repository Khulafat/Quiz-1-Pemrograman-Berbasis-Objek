package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class EyeOfGalaxy extends Ranger{
    private int multiTarget;

    public int getMultitarget() {
        return multiTarget;
    }

    public void setMultitarget(int multitarget) {
        this.multiTarget = multitarget;
    }
    
    public double damageEOG(){
        double dEOG;
        dEOG = basicAttack * vision * multiTarget;
        return dEOG;
    }
}
