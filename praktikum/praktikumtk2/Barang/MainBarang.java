/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.Barang;

import java.util.*;
import java.text.*;

public class MainBarang {
    public static void main(String[] args){
        Barang barang = new Barang();
        barang.kode = "B01";
        barang.nama = "Laptop";
        barang.tglProduksi = "10/09/2022";
        barang.tglExpired = "14/09/2022";
        DateFormat tglProd = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat tglExp = new SimpleDateFormat ("dd/MM/yyyy");
        
        try{
            Date tglAwal = tglProd.parse(barang.tglProduksi);
            Date tglAkhir = tglExp.parse(barang.tglExpired);
            
            Date TGLAwal = tglAwal;
            Date TGLAkhir = tglAkhir;
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(TGLAwal);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(TGLAkhir);
            
            String hasil = String.valueOf(barang.masaBarang(cal1, cal2));
            System.out.println("Masa Berlaku    :"+hasil+" hari");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan penghitungan");
        }
    }
}
