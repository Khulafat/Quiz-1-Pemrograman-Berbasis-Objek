package com.praktikum.praktikumtk2.Ring;

/**
 *
 * @author HP
 */
public class MainRing {
    public static void main(String[] args) {
        Ring ring = new Ring();
        ring.idRing = "R01";
        ring.namaRing = "Ring of Basilius";
        ring.gradeRing = "Magic";
        ring.effekRing = "Corrosion";
        ring.atributRing = "Dark";
        
        System.out.println("Id Ring         : "+ring.idRing);
        System.out.println("Nama Ring       : "+ring.namaRing);
        System.out.println("Grade Ring      : "+ring.gradeRing);
        System.out.println("Effek Ring      : "+ring.effekRing);
        System.out.println("Atribut Ring    : "+ring.atributRing);
    }
}
