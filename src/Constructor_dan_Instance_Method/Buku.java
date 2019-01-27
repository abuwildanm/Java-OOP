package Constructor_dan_Instance_Method;

public class Buku {
    private String kategori, penulis, judul;
    private int kode, rak;
    static String Kategori[] = new String[100];
    
    public Buku() {
        kategori = "";
        penulis = "";
        judul = "";
        kode = 0;
    }
    
    public Buku(int kode, String judul, String penulis) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;  
    }
    
    public void set_Judul(String title) {
        judul = title;
    }
    
    public String get_Judul() {
        return judul;
    }
    
    public void set_Kode(int code) {
        kode = code;
    }
    
    public int get_Kode() {
        return kode;
    }
    
    public void set_Penulis(String writer) {
        penulis = writer;
    }
    
    public String get_Penulis() {
        return penulis;
    }
    
    public int get_NomorRak() {
        rak = kode / 100;
        return rak;
    }
    
    private String get_Kategori() {
        switch(rak) {
            case 1  : kategori = "Teknologi"; break;
            case 2  : kategori = "Filsafat"; break;
            case 3  : kategori = "Sejarah"; break;
            case 4  : kategori = "Agama"; break;
            case 5  : kategori = "Psikologi"; break;
            case 6  : kategori = "Politik"; break;
            case 7  : kategori = "Fiksi"; break;
            default : kategori = ""; break;
        }
        return kategori;
    }
      
    public void displayMessage() {
        System.out.println("No. Rak     : " + get_NomorRak());
        System.out.println("Kategori    : " + get_Kategori());
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Kode        : " + kode);
        System.out.println("-----------------------------------------------------\n");
    }
}
