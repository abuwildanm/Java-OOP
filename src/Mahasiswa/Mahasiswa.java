package Mahasiswa;

public class Mahasiswa {
    private String nama, prodi, password;
    private long NIM;
    private final char JK;
    private static final String fakultas = "Fakultas Ilmu Komputer";
    public static int jml_mhs = 0;
    
    public Mahasiswa() {
        nama = "";
        NIM = 0;
        JK = 'L';
        prodi = "";
        password = "";
        jml_mhs++;
    }
    
    public Mahasiswa(long NIM, String nama, char JK, String prodi, String password) {
        this.nama = nama;
        this.NIM = NIM;
        this.JK = JK;
        this.prodi = prodi;
        this.password = password;
        jml_mhs++;
    }

    public void Perkuliahan() {
        System.out.println("NIM             : " + get_NIM());
        System.out.println("Nama            : " + get_Nama());
        System.out.println("Jenis Kelamin   : " + get_JK());
        System.out.println("Fakultas        : " + get_Fakultas());
        System.out.println("Prodi           : " + get_Prodi());
        System.out.println("---------------------------------------------\n");
        
        System.out.printf("%-10s %-30s %-15s %-10s %-10s %-15s\n", "Kode", "Mata Kuliah", "Jumlah SKS", "Gedung", "Ruang", "Kapasitas");
    }
    
    //Method set-get
    public void set_Nama(String nama) { this.nama = nama; }
    public String get_Nama() { return nama; }
    public void set_NIM(long NIM) { this.NIM = NIM; }
    public long get_NIM() { return NIM; }
    public void set_Password(String password) { this.password = password; }
    public String get_Password() { return password; }
    public char get_JK() { return JK; }
    public String get_Fakultas() { return fakultas; }
    public void set_Prodi(String prodi) { this.prodi = prodi; }
    public String get_Prodi() { return prodi; }
}
