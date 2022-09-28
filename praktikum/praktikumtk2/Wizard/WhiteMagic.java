package com.praktikum.praktikumtk2.Wizard;

/**
 *
 * @author HP
 */
public class WhiteMagic extends Wizard{
    public String whiteAttribute;
    
    public String profileWM(){
        String ps;
        ps = "Nama Wizard   : "+namaWizard+"\n"+
             "Mana Wizard   : "+manaWizard+"\n"+
             "Attribute     : "+whiteAttribute+"\n";
        return ps;
    }
}
