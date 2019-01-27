package Static_dan_Final;

public class Jaket {
    private final static int hargaA = 100000;
    private final static int hargaB = 125000;
    private final static int hargaC = 175000;
    private static int hargaDiskonA = 95000;
    private static int hargaDiskonB = 120000;
    private static int hargaDiskonC = 160000;
    
    public static int TotalSementara(String tipe, int banyak) {
        if (tipe.equalsIgnoreCase("A")) {
            if (banyak > 100) return hargaDiskonA * banyak;
            else return hargaA * banyak;
        }
        
        else if (tipe.equalsIgnoreCase("B")) {
            if (banyak > 100) return hargaDiskonB * banyak;
            else return hargaB * banyak;
        }
        
        else if (tipe.equalsIgnoreCase("C")) {
            if (banyak > 100) return hargaDiskonC * banyak;
            else return hargaC * banyak;
        }
        
        else return 0;
    }

    public static void DaftarHarga() {
        System.out.println("--- DAFTAR HARGA JAKET ---");
        System.out.println("1. Tipe A : Rp. " + hargaA);
        System.out.println("2. Tipe B : Rp. " + hargaB);
        System.out.println("3. Tipe C : Rp. " + hargaC);
        System.out.println("--------------------------\n");
    }
    
    public static void DaftarDiskon() {
        System.out.println("--- DAFTAR HARGA JAKET ---");
        System.out.println("1. Tipe A : Rp. " + hargaDiskonA);
        System.out.println("2. Tipe B : Rp. " + hargaDiskonB);
        System.out.println("3. Tipe C : Rp. " + hargaDiskonC);
        System.out.println("--------------------------");
        System.out.println("*Harga di atas berlaku jika pembelian lebih dari 100 buah\n");
    }
}
