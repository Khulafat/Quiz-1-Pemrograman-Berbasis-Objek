/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.Barang;
import java.util.*;
import java.text.*;
/**
 *
 * @author HP
 */
public class Barang {
    
    public String kode;
    public String nama;
    public String tglProduksi;
    public String tglExpired;
    
    public static long masaBarang (Calendar tglProd, Calendar tglExp) {
        long lama = 0;
        
        Calendar tanggal = (Calendar) tglProd.clone();
        
        while(tanggal.before(tglExp)){
            tanggal.add(Calendar.DAY_OF_MONTH, 1);
            lama++;
        }
        return lama;
    }
}
