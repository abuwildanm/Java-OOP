package Constructor_dan_Instance_Method;

import java.util.Scanner;

public class Perpustakaan {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte Pilihan = 0;
        int indeksBuku = 35;
        int indeksKategori = 7;
        
        Buku[] buku = new Buku[100];
        
        Buku.Kategori[0] = "Teknologi";
        Buku.Kategori[1] = "Filsafat";
        Buku.Kategori[2] = "Sejarah";
        Buku.Kategori[3] = "Agama";
        Buku.Kategori[4] = "Psikologi";
        Buku.Kategori[5] = "Politik";
        Buku.Kategori[6] = "Fiksi";
        
        //Buku Teknologi
        buku[0] = new Buku(101, "Perkembangan Komputer", "Andi");
        buku[1] = new Buku(102, "Pemrograman Dasar", "Budi");
        buku[2] = new Buku(103, "Pemrograman Lanjut", "Cecep");
        buku[3] = new Buku(104, "Sistem Digital", "Deni");
        buku[4] = new Buku(105, "Arsitektur dan Organisasi Komputer", "Eugene");
        
        //Buku Filsafat
        buku[5] = new Buku(201, "Pengantar Ilmu Filsafat", "Ferry");
        buku[6] = new Buku(202, "Mencari Arti Hidup", "Gundul");
        buku[7] = new Buku(203, "Kiat-kiat Menjadi Sukses", "Haris");
        buku[8] = new Buku(204, "Rahasia Berumur Panjang", "Intan");
        buku[9] = new Buku(205, "Tanda Tanya", "Joko");
        
        //Buku Sejarah
        buku[10] = new Buku(301, "Sejarah Lokal di Indonesia", "Taufik Abdullah");
        buku[11] = new Buku(302, "Bali pada Abad XIX", "Ide Anak Agung Gede");
        buku[12] = new Buku(303, "Pemuda Indonesia dalam Dimensi Sejarah Perjuangan Bangsa", "Ahmaddani");
        buku[13] = new Buku(304, "Recalling The Indies", "Joost Cote");
        buku[14] = new Buku(305, "The German Fighter Force in World War II", "Adolf Galland");
        
        //Buku Agama
        buku[15] = new Buku(401, "Meneladani Rasulullah dan Para Sahabat", "A. Fatih Syuhud");
        buku[16] = new Buku(402, "Pribadi Akhlakul Karimah", "A. Fatih Syuhud");
        buku[17] = new Buku(403, "Islamku Islam Anda Islam Kita", "Abdurrahman Wahid");
        buku[18] = new Buku(404, "Tuhan Tidak Perlu Dibela", "Abdurrahman Wahid");
        buku[19] = new Buku(405, "Terjemah Ta'limul Muta'allim", "Aliy As'ad");
        
        //Buku Psikologi
        buku[20] = new Buku(501, "Ada Apa Dengan Tubuhku?", "Lynda Madaras");
        buku[21] = new Buku(502, "Analisis Tulisan Tangan", "Karen K. Amend");
        buku[22] = new Buku(503, "Asas-Asas Penelitian Behavioral", "Fred N. Kerlinger");
        buku[23] = new Buku(504, "Bimbingan Konseling", "Fenti Hikmawati");
        buku[24] = new Buku(505, "Biopsikologi - Pembelajaran Perilaku", "Wowo Sunaryo Kuswana");
        
        //Buku Politik
        buku[25] = new Buku(601, "Pengantar Ilmu Politik", "F. Isjwara");
        buku[26] = new Buku(602, "Perkembangan Ilmu Politik di Indonesia", "Miriam Budiardjo");
        buku[27] = new Buku(603, "Pengantar Ilmu politik", "Iwa Kusuma Sumantri");
        buku[28] = new Buku(604, "Dasar-dasar Ilmu Politik", "Miriam Budiardjo");
        buku[29] = new Buku(605, "Sistem Politik Indonesia", "Sukana");
        
        //Buku Fiksi
        buku[30] = new Buku(701, "Asmaraloka", "Danarto");
        buku[31] = new Buku(702, "Nagabumi II", "Seno Gumira Ajidarma");
        buku[32] = new Buku(703, "Lampuki", "Arafat Nur");
        buku[33] = new Buku(704, "The Lord of The Rings", "J. R. R. Tolkien");
        buku[34] = new Buku(705, "The Lion, the Witch and the Wardrobe", "C. S. Lewis");
        
        do {
        System.out.println("====== Menu Utama ======");
        System.out.println("1. Cari Buku");
        System.out.println("2. Tambah Buku");
        System.out.println("3. Tambah Kategori Buku");
        System.out.println("4. Tampilkan semua");
        System.out.println("0. Keluar");
        System.out.println("========================");
        System.out.print("Masukkan pilihan anda : ");
        Pilihan = masuk.nextByte();
        masuk.nextLine();
        System.out.println("");
        
        switch (Pilihan) {
            case 1 :
                System.out.println("===== Menu Pencarian Buku =====");
                System.out.println("1. Berdasarkan Kategori");
                System.out.println("2. Berdasarkan Judul");
                System.out.println("3. Berdasarkan Penulis");
                System.out.println("===============================");
                System.out.print("Masukkan pilihan anda : ");
                byte pilihan = masuk.nextByte();
                System.out.println("");
                
                if (pilihan == 1) {
                    System.out.println("======= Menu Kategori =======");
                    tampilKategori();
                    System.out.println("=============================");
                    System.out.print("Masukkan pilihan anda : ");
                    byte kategori = masuk.nextByte();
                    System.out.println("");
                    
                    if(!cariKategori(buku, kategori))
                        System.out.println("DATA TIDAK DITEMUKAN !\n");
                }
                
                else if (pilihan == 2) {
                    System.out.print("Masukkan judul : ");
                    masuk.nextLine();
                    String judul = masuk.nextLine();
                    System.out.println("");
                    
                    if(!cariJudul(buku, judul))
                        System.out.println("DATA TIDAK DITEMUKAN !\n");
                }
                
                else if (pilihan == 3) {            
                    System.out.print("Masukkan penulis : ");
                    masuk.nextLine();
                    String penulis = masuk.nextLine();
                    System.out.println("");
                    
                    if(!cariPenulis(buku, penulis))
                        System.out.println("DATA TIDAK DITEMUKAN !\n");
                }
                
                else
                    System.out.println("DATA TIDAK DITEMUKAN !\n");
            
            break;    
                
            case 2 : 
                System.out.println("=== Sistem Penambah Buku ===");
                System.out.print("Judul   : ");
                String judul = masuk.nextLine();
                System.out.print("Penulis : ");
                String penulis = masuk.nextLine();
                System.out.print("Kode    : ");
                int kode = masuk.nextInt();
                System.out.println("============================\n");
                
                for (int i = 0; i < buku.length; i++) {
                    if (buku[i] == null) break;
                    
                    if (judul.equalsIgnoreCase(buku[i].get_Judul()))
                        System.out.println("Judul buku sudah ada !");
                }
                
                buku[indeksBuku++] = new Buku(kode, judul, penulis);
                System.out.println("INPUT DATA BERHASIL !\n");
                                
            break;
            
            case 3 : 
                System.out.println("=== Sistem Penambah Ketegori ===");
                System.out.print("Masukkan nama kategori   : ");
                String kategori = masuk.nextLine();
                System.out.println("================================\n");
                
                Buku.Kategori[indeksKategori++] = kategori;
                System.out.println("INPUT DATA BERHASIL !\n");
                
            break;
                
            case 4 : 
                for (int i = 0; i < buku.length; i++) {
                    if (buku[i] == null) break;
                    
                    buku[i].displayMessage();
                }
                
            break;
            
            case 0 : System.out.println("PROGRAM DIHENTIKAN ! "); break;
            
            default : System.out.println("DATA TIDAK DITEMUKAN !\n"); break;
        }
        } while(Pilihan != 0);
    }
    
    public static void tampilKategori() {
        for (int i = 0; i < Buku.Kategori.length; i++) {
            if (Buku.Kategori[i] == null) break;     
            System.out.println((i+1) + ". " + Buku.Kategori[i]);
        }
    }
    
    public static boolean cariKategori(Buku buku[], int kategori) {
        boolean status = false;
        
        for (int i = 0; i < buku.length; i++) {
            if (buku[i] == null) break;
            
            if (kategori == buku[i].get_NomorRak()) {
                buku[i].displayMessage();
                status = true;
            }
        }
        
        return status;
    }
    
    public static boolean cariJudul(Buku buku[], String judul) {
        boolean status = false;
        
        for (int i = 0; i < buku.length; i++) {
            if (buku[i] == null) break;
            
            if(judul.equalsIgnoreCase(buku[i].get_Judul())) {
                buku[i].displayMessage();
                status = true;
            }
        }
        
        return status;
    }
    
    public static boolean cariPenulis(Buku buku[], String penulis) {
        boolean status = false;
        
        for (int i = 0; i < buku.length; i++) {
            if (buku[i] == null) break;
            
            if(penulis.equalsIgnoreCase(buku[i].get_Penulis())) {
                buku[i].displayMessage();
                status = true;
            }
        }
        
        return status;
    }
}
