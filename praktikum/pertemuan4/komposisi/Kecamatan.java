package com.praktikum.pertemuan4.komposisi;

public class Kecamatan {
    private String namaKec;
    private double luasWilayah;

    public Kecamatan(String nmk, double lw){
        this.namaKec = nmk;
        this.luasWilayah = lw;
    }
    public String getNamaKec() {
        return namaKec;
    }

    public double getLuasWilayah() {
        return luasWilayah;
    }
    
    public void batasWilayah(){
        if(luasWilayah <= 100){
            
        }
    }
}
