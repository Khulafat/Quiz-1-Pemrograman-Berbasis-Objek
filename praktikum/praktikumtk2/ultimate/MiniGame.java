/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.ultimate;

/**
 *
 * @author HP
 */
public class MiniGame {
    public static void main(String[] args) {
        Senjata weapon = new Senjata();
        weapon.tipe = "Long Sword";
        weapon.namaSenjata = "Grade Standar "+weapon.tipe;
        weapon.basicDamage = 11.2;
        weapon.effek = 2;
        weapon.dayaHancur();
        
        Pemain newbie = new Pemain();
        
        newbie.nama = "Xtreme Lighting Super Xstra";
        newbie.basicPower = 11;
        
        System.out.println("=============================================");
        System.out.println("Nama Pemain     :"+newbie.nama);
        System.out.println("Nama Senjata    :"+weapon.namaSenjata);
        System.out.println("Daya Hancur     :"+newbie.totalPower(weapon));
        System.out.println("=============================================");
    }
}
