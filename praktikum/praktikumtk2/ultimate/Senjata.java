/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.ultimate;

/**
 *
 * @author HP
 */
public class Senjata {
    public String tipe;
    public String namaSenjata;
    public double basicDamage;
    public int effek;
    
    public double dayaHancur(){
        double dh;
        dh = basicDamage * effek;
        return dh;
    }
}
