/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.ultimate;

/**
 *
 * @author HP
 */
public class Pemain {
    public String nama;
    public int basicPower;
    private Senjata sjt;
    
    public double totalPower(Senjata s){
        sjt = s;
        double tp;
        tp = basicPower + s.dayaHancur();
        return tp;
    }
}
