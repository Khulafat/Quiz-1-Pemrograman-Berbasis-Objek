/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi_kantor;

/**
 *
 * @author Afad
 */
public class MainPegawai {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Khulafat", "2131740042", 7);
        pegawai1.hitungGajiHarian();
        pegawai1.cetakPenghasilan();  
        
        Pegawai pegawai2 = new Pegawai("Andre", "2131740099", 9);
        pegawai2.hitungGajiHarian();
        pegawai2.cetakPenghasilan(); 
    }
}
