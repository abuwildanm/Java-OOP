package Constructor;

public class Mhs {
    private String nama, fakultas, prodi;
    private long NIM;
    
    public Mhs() {
        nama = "";
        NIM = 0;
    }
    
    public Mhs(String nama, long NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }
    
    public void set_Nama(String nama) {
        this.nama = nama;
    }
    
    public String get_Nama() {
        return nama;
    }
    
    public void set_NIM(long NIM) {
        this.NIM = NIM;
    }
    
    public long get_NIM() {
        return NIM;
    }
    
    public void set_Fakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    public String get_Fakultas() {
        return fakultas;
    }
    
    public void set_Prodi(String prodi) {
        this.prodi = prodi;
    }
    
    public String get_Prodi() {
        return prodi;
    }
}
