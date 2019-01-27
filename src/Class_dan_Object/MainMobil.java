package Class_dan_Object;

import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        //instan objek bernama m1
        System.out.println("Identitas Mobil ke 1");
        Mobil m1 = new Mobil();
        System.out.print("Merek mobil               : ");
        m1.setManufaktur(masuk.nextLine());
        System.out.print("Nomor plat mobil          : ");
        m1.setNoPlat(masuk.nextLine());
        System.out.print("Warna mobil               : ");
        m1.setWarna(masuk.nextLine());
        System.out.print("Kecepatan tempuh mobil    : ");
        m1.setKecepatan(masuk.nextInt());
        System.out.print("Waktu tempuh mobil        : ");
        m1.setWaktu(masuk.nextDouble());
        masuk.nextLine();
        System.out.println("====================================\n");
        
        //instan objek baru bernama m2
        System.out.println("Identitas Mobil ke 2");
        Mobil m2 = new Mobil();
        System.out.print("Merek mobil               : ");
        m2.setManufaktur(masuk.nextLine());
        System.out.print("Nomor plat mobil          : ");
        m2.setNoPlat(masuk.nextLine());
        System.out.print("Warna mobil               : ");
        m2.setWarna(masuk.nextLine());
        System.out.print("Kecepatan tempuh mobil    : ");
        m2.setKecepatan(masuk.nextInt());
        System.out.print("Waktu tempuh mobil        : ");
        m2.setWaktu(masuk.nextDouble());
        System.out.println("===================================\n");
        
        m1.displayMessage();
        System.out.println("===================================\n");
        m2.displayMessage();
        System.out.println("===================================\n");
        
        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau\n");
        m1.setWarna("Hijau");
        
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
    
}
