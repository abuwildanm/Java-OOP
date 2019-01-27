package Class_dan_Object;

public class Aplikasi_Hitung_Rumus {

    public static void main(String[] args) {
        Mahasiswa A = new Mahasiswa();
        A.set_NulisKata(100);
        A.set_Halaman(0.5);
        
        double waktu = A.nulisKata / A.halaman;
        
        System.out.println("Mahasiswa A dapat menulis 1 buku penuh selama " + waktu + " hari");
    }
    
}
