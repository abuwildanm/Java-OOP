package Class_dan_Object;

public class Buku_Test {
    int lembar;
    
    void set_Lembar(int isi) {
        lembar = isi;
    }
    
    int get_Lembar() {
        return lembar;
    }
    
    int Halaman() {
        int halaman = lembar * 2;
        return halaman;
    }
}
