package Percobaan;

/* === Sekolah Koding ===
Mapel yang dibahas adalah :
1. Kelas sebagai objek
2. Metode void
3. Parameter pada metode
4. Metode Return
5. Metode Get dan Set*/

public class orang {
    int tinggi = 150;
    String warna = "putih";

    public static void main(String[] args) {
        //namaKelas nama = new namaKelas();
//        orang udin = new orang();
        orang andi = new orang();
        
//        udin.berjalan("prok prok", 20);
        
//        String warnaKulit = udin.kulit();
        
//        System.out.println(warnaKulit);
        
        andi.setWarna("biru");
        System.out.println(andi.warna);
    }
    
    void berjalan(String suara, int angka) {
        System.out.println("berjalan " + suara + " " + angka);
    }
    
    String kulit() {
        warna = "hitam";
        
        return warna;
    }
    
    void setWarna(String warnaParameter) {
        warna = warnaParameter;
    }
}
