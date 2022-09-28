package com.praktikum.pertemuan4.komposisi;
import java.util.*;

public class Kabupaten {
    private String namaKab;
    private List<Kecamatan> kecamatan;
    
    public Kabupaten(String nm, List<Kecamatan> kc){
        this.namaKab = nm;
        this.kecamatan = kc;
    }

    public void setNamaKab(String namaKab) {
        this.namaKab = namaKab;
    }

    public String getNamaKab() {
        return namaKab;
    }

    public List<Kecamatan> getKecamatan() {
        return kecamatan;
    }
    
    public static void main(String[] args) {
        Kecamatan kec1 = new Kecamatan("Candipuro", 141.49);
        Kecamatan kec2 = new Kecamatan("Pasirian", 128.39);
        Kecamatan kec3 = new Kecamatan("Tempeh", 73.21);
        Kecamatan kec4 = new Kecamatan("Tekung", 27.88);
        
        List<Kecamatan> kc = new ArrayList<Kecamatan>();
            kc.add(kec1);
            kc.add(kec2);
            kc.add(kec3);
            kc.add(kec4);
        
        Kabupaten kab = new Kabupaten("Lumajang", kc);
        System.out.println("Kabupaten " + kab.getNamaKab());
        
        List<Kecamatan> dataKec = kab.getKecamatan();
        
        for(Kecamatan kecam : dataKec){
            System.out.println("Nama Kecamatan  : " + kecam.getNamaKec());
            System.out.println("Luas Wilayah    : " + kecam.getLuasWilayah());
        }
    }
}
