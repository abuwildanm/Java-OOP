package Kuliah;

public class Ruang {
    private String nama;
    private char gedung;
    private final int kapasitas;
    public static int jml_ruang = 0;
    
    public Ruang() {
        nama = "";
        kapasitas = 0;
        jml_ruang++;
    }
    
    public Ruang(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        jml_ruang++;
    }
    
    //Method set-get
    public void set_Nama(String nama) { this.nama = nama; }
    public String get_Nama() { return nama; }
    public void set_Gedung(char gedung) { this.gedung = gedung; }
    public char get_Gedung() { gedung = nama.charAt(0); return gedung; }
    public int get_Kapasitas() { return kapasitas; }
}
