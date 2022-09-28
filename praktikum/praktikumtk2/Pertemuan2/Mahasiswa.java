/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.praktikumtk2.Pertemuan2;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String email;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "2131740042";
        mhs.nama = "Mochammad Khulafat Fazrul Insani";
        mhs.email = "afadinsani@gmail.com";
        System.out.println(mhs.biodata());
    }
    
    public String biodata() {
        String bio;
        bio = "Nim Mahasiswa    :"+this.nim+"\n"+
              "Nama Mahasiswa   :"+this.nama+"\n"+
              "Email Mahasiswa  :"+this.email+"\n";
        return bio;
    } 
}
