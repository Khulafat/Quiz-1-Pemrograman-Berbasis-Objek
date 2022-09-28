package com.praktikum.praktikumtk2.Sword;

/**
 *
 * @author HP
 */
public class Sword {
    private String idSword;
    private String namaSword;
    private String gradeSword;
    private double basicDamage;

    public void setIdSword(String idSword) {
        this.idSword = idSword;
    }

    public String getIdSword() {
        return idSword;
    }

    public void setNamaSword(String namaSword) {
        this.namaSword = namaSword;
    }

    public String getNamaSword() {
        return namaSword;
    }

    public void setGradeSword(String gradeSword) {
        this.gradeSword = gradeSword;
    }

    public String getGradeSword() {
        return gradeSword;
    }

    public void setBasicDamage(double basicDamage) {
        this.basicDamage = basicDamage;
    }

    public double getBasicDamage() {
        return basicDamage;
    }  
}
