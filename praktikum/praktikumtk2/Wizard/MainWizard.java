package com.praktikum.praktikumtk2.Wizard;

/**
 *
 * @author HP
 */
public class MainWizard {
    public static void main(String[] args) {
        DarkMagic darkMagic = new DarkMagic();
        darkMagic.namaWizard = "Hell Zinger";
        darkMagic.manaWizard = 4000;
        darkMagic.darkAttribute = "Dark Elemental";
        
        WhiteMagic whiteMagic = new WhiteMagic();
        whiteMagic.namaWizard = "Gandhalf";
        whiteMagic.manaWizard = 2500.7;
        whiteMagic.whiteAttribute = "Sun of Holyland";
        
        System.out.println("====== Dark Magician ======");
        System.out.println(darkMagic.profileDM());
        System.out.println("====== White Magician ======");
        System.out.println(whiteMagic.profileWM());
    }
}
