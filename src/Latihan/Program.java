package Latihan;

import java.util.Scanner;

public class Program {
    
//    static int id, telpon;
//    static String nama, alamat, plat, merk, warna;
    static Pelanggan pelanggan;
    static Mobil mobil;

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte pilihan = 0;
        int indeksPelanggan = 2;
        int indeksMobil = 2;
        int indeksPeminjaman = 2;
        
        //Pelanggan
        Pelanggan plg[] = new Pelanggan[100];
        plg[0] = new Pelanggan(101, "Wildan", "Purwokerto", 6285869);
        plg[1] = new Pelanggan(102, "Paijo", "Malang", 6281234);
        
        //Mobil
        Mobil mbl[] = new Mobil[100];
        mbl[0] = new Mobil("R 4 JA", "Toyota", "Biru");
        mbl[1] = new Mobil("N 1131 RU", "Suzuki", "Merah");
        
        //Peminjaman
        Peminjaman pinjam[] = new Peminjaman[100];
        pinjam[0] = new Peminjaman(plg[0], mbl[0], "20/03/2017", "27/03/2017");
        pinjam[1] = new Peminjaman(plg[1], mbl[1], "20/03/2017", "29/03/2017");
        
        do {
        System.out.println("============= Menu Utama =============");
        System.out.println("1. Tambah data Pelanggan");
        System.out.println("2. Tambah data Mobil");
        System.out.println("3. Tambah data Transaksi Peminjaman");
        System.out.println("4. Tampil data Pelanggan");
        System.out.println("5. Tampil data Mobil");
        System.out.println("6. Tampil data Transaksi Peminjaman");
        System.out.println("0. Keluar");
        System.out.println("======================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : 
                System.out.println("=== Sistem Penambah Pelanggan ===");
                System.out.print("No. ID        : ");
                int id = masuk.nextInt();
                System.out.print("Nama          : ");
                masuk.nextLine();
                String nama = masuk.nextLine();
                System.out.print("Alamat        : ");
                String alamat = masuk.nextLine();
                System.out.print("No. Telpon    : ");
                int telpon = masuk.nextInt();
                System.out.println("=================================\n");
                
                plg[indeksPelanggan++] = new Pelanggan(id, nama, alamat, telpon);
                System.out.println("INPUT DATA BERHASIL !\n");
                
            break;
            
            case 2 : 
                System.out.println("=== Sistem Penambah Mobil ===");
                System.out.print("No. Plat    : ");
                masuk.nextLine();
                String plat = masuk.nextLine();
                System.out.print("Merk        : ");
                String merk = masuk.nextLine();
                System.out.print("Warna       : ");
                String warna = masuk.nextLine();
                System.out.println("=============================\n");
                
                mbl[indeksMobil++] = new Mobil(plat, merk, warna);
                System.out.println("INPUT DATA BERHASIL !\n");
                
            break;
            
            case 3 : 
                System.out.println("=== Sistem Penambah Transaksi ===");
                System.out.println("No. ID  : ");
                pelanggan.setID(masuk.nextInt());
//                System.out.println("Nama    : ");
//                pelanggan.setNama(masuk.nextLine());
//                System.out.println("Alamat  : ");
//                pelanggan.setAlamat(masuk.nextLine());
//                System.out.println("Telpon  : ");
//                pelanggan.setTelpon(masuk.nextInt());
                System.out.println("-----------------------------------");
                System.out.println("No. Plat    : ");
                mobil.setPlat(masuk.nextLine());
//                System.out.println("Merk        : ");
//                mobil.setMerk(masuk.nextLine());
//                System.out.println("Warna       : ");
//                mobil.setWarna(masuk.nextLine());
                System.out.println("-----------------------------------");
                System.out.println("Tanggal Pinjam  : ");
                String tglPinjam = masuk.nextLine();
                System.out.println("Tanggal Kembali : ");
                String tglKembali = masuk.nextLine();
                System.out.println("=================================\n");
                
                pinjam[indeksPeminjaman++] = new Peminjaman(pelanggan, mobil, tglPinjam, tglKembali);
                System.out.println("INPUT DATA BERHASIL !\n");
                
            break;
            
            case 4 : 
                for (int i = 0; i < plg.length; i++) {
                    if (plg[i] == null) break;
                    
                    plg[i].display();
                }
                
            break;
            
            case 5 : 
                for (int i = 0; i < mbl.length; i++) {
                    if (mbl[i] == null) break;
                    
                    mbl[i].display();
                }
                
            break;
            
            case 6 : 
                for (int i = 0; i < pinjam.length; i++) {
                    if (pinjam[i] == null) break;
                    
                    pinjam[i].display();
                }
                
            break;
            
            case 0 : System.out.println("PROGRAM DIHENTIKAN !"); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi"); break;
        }
        } while (pilihan != 0);
        
    }
    
}
