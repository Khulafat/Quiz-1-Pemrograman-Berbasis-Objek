package com.praktikum.praktikumtk2.Sword;

/**
 *
 * @author HP
 */
public class MainSword {
    public static void main(String[] args) {
        Sword pedang = new Sword();
        pedang.setIdSword("S01");
        pedang.setNamaSword("Excalibur");
        pedang.setGradeSword("Legendary");
        pedang.setBasicDamage(1789.233);
        
        System.out.println("===============================");
        System.out.println("Nama Pedang     : "+pedang.getNamaSword());
        System.out.println("Grade Pedang    : "+pedang.getGradeSword());
        System.out.println("Basic Damage    : "+pedang.getBasicDamage());
    }
}
