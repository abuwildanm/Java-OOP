package Constructor;

public class Buku {
    private String Judul, Penulis, Penerbit;
    private int Kode, TahunTerbit;
    
    Buku() {
        Judul = "";
        Kode = 0;
    }
    
    Buku(String judul, int kode) {
        Judul = judul;
        Kode = kode;
    }
    
    public void set_Judul(String judul) {
        Judul = judul;
    }
    
    public String get_Judul() {
        return Judul;
    }
    
    public void set_Kode(int kode) {
        Kode = kode;
    }
    
    public int get_Kode() {
        return Kode;
    }
    
    public void set_Penulis(String penulis) {
        Penulis = penulis;
    }
    
    public String get_Penulis() {
        return Penulis;
    }
    
    public void set_Penerbit(String penerbit) {
        Penerbit = penerbit;
    }
    
    public String get_Penerbit() {
        return Penerbit;
    }
    
    public void set_TahunTerbit(int tahunTerbit) {
        TahunTerbit = tahunTerbit;
    }
    
    public int get_TahunTerbit() {
        return TahunTerbit;
    }
}