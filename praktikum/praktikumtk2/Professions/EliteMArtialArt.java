package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class EliteMArtialArt extends Fighter{
    private double radiance;

    public double getRadiance() {
        return radiance;
    }

    public void setRadiance(double radiance) {
        this.radiance = radiance;
    }
    
    public double damageEMA(){
        double dEMA;
        dEMA = basicAttack * aura * radiance;
        return dEMA;
    }
}
