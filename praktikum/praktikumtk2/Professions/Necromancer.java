package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class Necromancer extends Wizard{
    private int summoner;

    public int getSummoner() {
        return summoner;
    }

    public void setSummoner(int summoner) {
        this.summoner = summoner;
    }
    
    public double damageNC(){
        double dNC;
        dNC = (basicAttack + mana) / summoner;
        return dNC;
    }
}
