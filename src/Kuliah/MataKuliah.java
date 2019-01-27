package Kuliah;

public class MataKuliah {
    private int sks;
    private String nama, kode;
    public static int jml_matkul = 0;
    
    public MataKuliah() {
        nama = "";
        kode = "";
        sks = 0;
        jml_matkul++;
    }
    
    public MataKuliah(String kode, String nama, int sks) {
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
        jml_matkul++;
    }
    
    //Method set-get
    public void set_Kode(String kode) { this.kode = kode; }
    public String get_Kode() { return kode; }
    public void set_Nama(String nama) { this.nama = nama; }
    public String get_Nama() { return nama; }
    public void set_SKS(int sks) { this.sks = sks; }
    public int get_SKS() { return sks; }
}
