package com.praktikum.pertemuan4.komposisi;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private Jurusan jurusan;
    private Kelas kelas;
    
    public Mahasiswa(String nim, String nama, String alamat, Jurusan jrs, Kelas kls){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jrs;
        this.kelas = kls;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public Kelas getKelas() {
        return kelas;
    }
    
    public String jrs(Jurusan js){
        String j;
        j = js.getNamaJurusan();
        return j;
    }
    
    public String kls(Kelas ks){
        String k;
        k = ks.getNamaKelas();
        return k;
    }
    
    public static void main(String[] args) {
        Jurusan jrs = new Jurusan();
        jrs.setNamaJurusan("Teknologi Informasi");
        jrs.setKodeJurusan("JTI");
        
        Kelas kls = new Kelas();
        kls.setNamaKelas("Teknologi Informasi 2A");
        kls.setKodeKelas("TI 2A");
        
        Mahasiswa mhs = new Mahasiswa("2131740042","M.Khulafat Fazrul Insani", "Ngadimulyo, Kec.Sukorejo, Kab.Pasuruan", jrs, kls);
        System.out.println("NIM                 : " + mhs.getNim());
        System.out.println("Nama                : " + mhs.getNama());
        System.out.println("Alamat              : " + mhs.getAlamat());
        System.out.println("Codename Jurusan    : " + jrs.getKodeJurusan());
        System.out.println("Nama Jurusan        : " + jrs.getNamaJurusan());
        System.out.println("Kode Kelas          : " + kls.getKodeKelas());
        System.out.println("Nama Kelas          : " + kls.getNamaKelas());
    }
}
