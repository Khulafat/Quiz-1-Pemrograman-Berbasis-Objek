package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class BattleMage extends Wizard{
    private int battlePoint;

    public int getBattlePoint() {
        return battlePoint;
    }

    public void setBattlePoint(int battlePoint) {
        this.battlePoint = battlePoint;
    }
    
    public double damageBM(){
        double dBM;
        dBM = (basicAttack * battlePoint) + mana;
        return dBM;
    }
}
