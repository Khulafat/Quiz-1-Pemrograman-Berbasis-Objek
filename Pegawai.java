package enkapsulasi_kantor;
/**
 *
 * @author Afad
 */
public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok = 2000;
    private double lembur = 3000;
    private double uangMakan = 3500;
    private double transport = 4000;
    private int jumlahJamKerja = 0;
    
    Pegawai(String nama, String nip, int jamKerja){
        this.nama = nama;
        this.nip = nip;
        jumlahJamKerja = jamKerja;
    }
    
    public void hitungGajiHarian(){
        gajiPokok *= 6;
        if(jumlahJamKerja >= 7){
            lembur *= (jumlahJamKerja - 6);
            System.out.println("Anda mendapatkan gaji lembur");
        } else { 
            lembur *= 0;
            System.out.println("Maaf anda tidak mendapatkan uang lembur");
        }
        if(jumlahJamKerja >= 8){
            System.out.println("Anda mendapatkan uang makan");
        } else {
            uangMakan *= 0;
            System.out.println("Maaf anda tidak mendapatkan uang makan");
        }
        if(jumlahJamKerja >= 9){
            System.out.println("Anda mendapatkan uang transport");
        } else {
            transport *= 0;
            System.out.println("Maaf anda tidak mendapatkan uang transport");
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public int getJumlahJamKerja() {
        return jumlahJamKerja;
    }

    void cetakPenghasilan(){
        System.out.println("Nama Pegawai    : " + getNama());
        System.out.println("NIP Pegawai     : " + getNip());
        System.out.println("Gaji Pokok      : " + gajiPokok);
        System.out.println("Uang Lembur     : " + lembur);
        System.out.println("Uang Makan      : " + uangMakan);
        System.out.println("Uang Transport  : " + transport);
        System.out.println("Take Home Pay   : " + (gajiPokok + lembur + uangMakan + transport));
    }
}
