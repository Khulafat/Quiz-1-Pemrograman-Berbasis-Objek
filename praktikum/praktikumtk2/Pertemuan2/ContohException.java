/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.Pertemuan2;

/**
 *
 * @author HP
 */
public class ContohException {
    public static void main(String[] args) {
        try {
            int hasil = 100/0;
            System.out.println(hasil);
        } catch (Exception e) {
            System.out.println("Hasil error");
        }
    }
}
