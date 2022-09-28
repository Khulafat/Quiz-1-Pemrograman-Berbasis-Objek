package com.praktikum.praktikumtk2.Professions;

/**
 *
 * @author HP
 */
public class Cleric extends Professions{
    private double pointBlessing;
    private int follower;

    public double getPointBlessing() {
        return pointBlessing;
    }

    public void setPointBlessing(double pointBlessing) {
        this.pointBlessing = pointBlessing;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }
    
    public double healing(){
        double heal;
        heal = (basicAttack + pointBlessing) * follower;
        return heal;
    }
}
