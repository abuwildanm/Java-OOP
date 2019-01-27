package Kuis_I;

public class Program {

    public static void main(String[] args) {
        Hewan hewan[] = new Hewan[10];
        hewan[0] = new Hewan("Zebra", 50, 1.5);
        hewan[1] = new Hewan("Singa", 60, 1.6);
        hewan[2] = new Hewan("Kuda", 70, 1.7);
        
        Tanaman tanaman[] = new Tanaman[10];
        tanaman[0] = new Tanaman("Apel", "Buah", 5);
        tanaman[1] = new Tanaman("Mangga", "Buah", 6);
        tanaman[2] = new Tanaman("Tomat", "Sayur", 7);
        
        Makanan makanan[] = new Makanan[10];
        makanan[0] = new Makanan(hewan[0], tanaman[0]);
        makanan[1] = new Makanan(hewan[1], hewan[0]);
        makanan[2] = new Makanan(hewan[2], tanaman[2]);
        
        System.out.println("Makanan " + hewan[0].getNama() + " adalah " + tanaman[0].getNama());
        System.out.println("Makanan " + hewan[1].getNama() + " adalah " + hewan[0].getNama());
        System.out.println("Makanan " + hewan[2].getNama() + " adalah " + tanaman[2].getNama());
        
        for (int i = 0; i < hewan.length; i++) {
            if(hewan[i] == null) break;
            System.out.println("Hewan " + hewan[i].getNama() + " memiliki BMI " + hewan[i].BMI());
        }
        
        for (int i = 0; i < tanaman.length; i++) {
            if(tanaman[i] == null) break;
            System.out.println("Waktu panen berikutnya tanaman " + tanaman[i].getNama() + " adalah bulan ke- " + tanaman[i].WaktuPanen());
        }
        
        System.out.println("Jumlah Hewan   : " + Hewan.getJmlHewan());
        System.out.println("Jumlah Tanaman : " + Tanaman.getJmlTanaman());
    }
    
}
