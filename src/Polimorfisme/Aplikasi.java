package Polimorfisme;

import java.util.Scanner;

public class Aplikasi {
    static Scanner masuk = new Scanner(System.in);
    static byte pilihan = 0, status = 0;
    static boolean berhenti = false;
    static Induk anggota = null;

    public static void main(String[] args) {
        System.out.println("*** Java Heritage Hotel System ***\n");
        
        tampilLogin();
        
        do {
        System.out.println("================ Menu Pemesanan ================");
        System.out.println("1. Daftar Biaya Kamar       6. Pesan Fasilitas");
        System.out.println("2. Daftar Biaya Makanan     7. Cek Profil");
        System.out.println("3. Daftar Biaya Fasilitas   8. Ganti Anggota");
        System.out.println("4. Pesan Kamar              0. Selesai");
        System.out.println("5. Pesan Makanan");
        System.out.println("================================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : anggota.BiayaKamar(); break;
            case 2 : anggota.BiayaMakan(); break;
            case 3 : anggota.BiayaFasilitas(); break;
            case 4 : anggota.PesanKamar(); break;
            case 5 : anggota.PesanMakan(); break;
            case 6 : anggota.PesanFasilitas(); break;
            case 7 : cekProfil(); break;
            case 8 : berhenti = false; tampilLogin(); break;
            case 0 : anggota.TotalPesanan(); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    }
    
    public static void tampilLogin() {
        while (!berhenti) {
        System.out.println("=== Menu Anggota ===");
        System.out.println("1. Premium");
        System.out.println("2. Member");
        System.out.println("3. Non-Member");
        System.out.println("====================");
        System.out.print("Masukkan status anda : ");
        status = masuk.nextByte();
        System.out.println("");
        
        switch (status) {
            case 1 : 
                anggota = new Premium(12345, "Wildan", "085123456789", "Purwokerto");
                System.out.println("Anda masuk sebagai anggota PREMIUM !\n");
                berhenti = true;
                break;
            
            case 2 : 
                anggota = new Member(23456, "Imron", "085234567890", "Malang");
                System.out.println("Anda masuk sebagai anggota MEMBER !\n");
                berhenti = true;
                break;
            
            case 3 : 
                anggota = new NonMember(34567, "Adit", "085345678901", "Semarang");
                System.out.println("Anda masuk sebagai anggota NON-MEMBER !\n");
                berhenti = true;
                break;
                
            default : System.out.println("Status keanggotaan SALAH !\n"); break;
        }
        }
    }
    
    public static void cekProfil() {
        System.out.println("--------------------------");
        System.out.println("          PROFIL");
        System.out.println("--------------------------");
        System.out.println("No. KTP  : " + anggota.getNoKTP());
        System.out.println("Nama     : " + anggota.getNama());
        System.out.println("No. Telp : " + anggota.getNoTelp());
        System.out.println("Alamat   : " + anggota.getAlamat());
        System.out.println("--------------------------\n");
    }
}
