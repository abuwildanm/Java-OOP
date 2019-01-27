package Static_dan_Final;

import java.util.Scanner;

public class MainPerhitungan {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte pilihan = 0;
        Perhitungan hitung = new Perhitungan();
        
        do {
        System.out.println("===================== Menu Utama =====================");
        System.out.println("1. Operasi penjumlahan \t 4. Operasi pembagian");
        System.out.println("2. Operasi pengurangan \t 5. Operasi penyederhanaan");
        System.out.println("3. Operasi perkalian \t 0. Berhenti");
        System.out.println("======================================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : Perhitungan.Penjumlahan(); break;
            case 2 : Perhitungan.Pengurangan(); break;
            case 3 : hitung.Perkalian(); break;
            case 4 : hitung.Pembagian(); break;
            case 5 : hitung.Sederhana(); break;
            case 0 : System.out.println("PROGRAM DIHENTIKAN !\n"); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    }
}
