package com.praktikum.praktikumtk2.Wizard;

/**
 *
 * @author HP
 */
public class DarkMagic extends Wizard{
    public String darkAttribute;
    
    public String profileDM(){
        String ps;
        ps = "Nama Wizard   : "+namaWizard+"\n"+
             "Mana Wizard   : "+manaWizard+"\n"+
             "Attribute     : "+darkAttribute+"\n";
        return ps;
    }
}
