package Static_dan_Final;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte pilihan = 0;
        String tipe; 
        int banyak, total = 0;
        ArrayList <Integer> belanja = new ArrayList <Integer> ();
        
        do {
        System.out.println("===== Menu Pembelian Jaket =====");
        System.out.println("1. Daftar harga     3. Beli");
        System.out.println("2. Diskon           0. Selesai");
        System.out.println("================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : Jaket.DaftarHarga(); break;
            case 2 : Jaket.DaftarDiskon(); break;
            case 3 : 
                System.out.print("Tipe jaket   : ");
                tipe = masuk.next();
                System.out.print("Banyak jaket : ");
                banyak = masuk.nextInt();
                System.out.println("");
                
                belanja.add(Jaket.TotalSementara(tipe, banyak));
                System.out.println("----------------------");
                System.out.println("Total : Rp. " + Jaket.TotalSementara(tipe, banyak));
                System.out.println("----------------------\n");
            break;
            case 0 : 
                for (Integer element : belanja) total += element;
                System.out.println("Total akhir belanja anda : Rp. " + total + "\n");
                System.out.println("TERIMA KASIH SUDAH BERBELANJA DI TOKO KAMI !\n");
            break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    } 
}
