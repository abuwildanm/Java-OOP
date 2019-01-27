package Class_dan_Object;

import java.util.Scanner;

public class Perpustakaan {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        //Buku Teknologi
        //Buku 1
        Buku buku1 = new Buku();
        buku1.set_Judul("Perkembangan Komputer");
        buku1.set_Penulis("Andi");
        buku1.set_Kode(101);
        
        //Buku 2
        Buku buku2 = new Buku();
        buku2.set_Judul("Pemrograman Dasar");
        buku2.set_Penulis("Budi");
        buku2.set_Kode(102);
        
        //Buku 3
        Buku buku3 = new Buku();
        buku3.set_Judul("Pemrograman Lanjut");
        buku3.set_Penulis("Cecep");
        buku3.set_Kode(103);
        
        //Buku 4
        Buku buku4 = new Buku();
        buku4.set_Judul("Sistem Digital");
        buku4.set_Penulis("Deni");
        buku4.set_Kode(104);
        
        //Buku 5
        Buku buku5 = new Buku();
        buku5.set_Judul("Arsitektur dan Organisasi Komputer");
        buku5.set_Penulis("Eugene");
        buku5.set_Kode(105);
        
        //Buku Filsafat
        //Buku 6
        Buku buku6 = new Buku();
        buku6.set_Judul("Pengantar Ilmu Filsafat");
        buku6.set_Penulis("Ferry");
        buku6.set_Kode(201);
        
        //Buku 7
        Buku buku7 = new Buku();
        buku7.set_Judul("Mencari Arti Hidup");
        buku7.set_Penulis("Gundul");
        buku7.set_Kode(202);
        
        //Buku 8
        Buku buku8 = new Buku();
        buku8.set_Judul("Kiat-kiat Menjadi Sukses");
        buku8.set_Penulis("Haris");
        buku8.set_Kode(203);
        
        //Buku 9
        Buku buku9 = new Buku();
        buku9.set_Judul("Rahasia Berumur Panjang");
        buku9.set_Penulis("Intan");
        buku9.set_Kode(204);
        
        //Buku 10
        Buku buku10 = new Buku();
        buku10.set_Judul("Tanda Tanya");
        buku10.set_Penulis("Joko");
        buku10.set_Kode(205);
        
        //Buku Sejarah
        //Buku 11
        Buku buku11 = new Buku();
        buku11.set_Judul("Sejarah Lokal di Indonesia");
        buku11.set_Penulis("Taufik Abdullah");
        buku11.set_Kode(301);
        
        //Buku 12
        Buku buku12 = new Buku();
        buku12.set_Judul("Bali pada Abad XIX");
        buku12.set_Penulis("Ide Anak Agung Gede");
        buku12.set_Kode(302);
        
        //Buku 13
        Buku buku13 = new Buku();
        buku13.set_Judul("Pemuda Indonesia dalam Dimensi Sejarah Perjuangan Bangsa");
        buku13.set_Penulis("Ahmaddani");
        buku13.set_Kode(303);
        
        //Buku 14
        Buku buku14 = new Buku();
        buku14.set_Judul("Recalling The Indies");
        buku14.set_Penulis("Joost Cote");
        buku14.set_Kode(304);
        
        //Buku 15
        Buku buku15 = new Buku();
        buku15.set_Judul("The German Fighter Force in World War II");
        buku15.set_Penulis("Adolf Galland");
        buku15.set_Kode(305);
        
        //Buku Agama
        //Buku 16
        Buku buku16 = new Buku();
        buku16.set_Judul("Meneladani Rasulullah dan Para Sahabat");
        buku16.set_Penulis("A. Fatih Syuhud");
        buku16.set_Kode(401);
        
        //Buku 17
        Buku buku17 = new Buku();
        buku17.set_Judul("Pribadi Akhlakul Karimah");
        buku17.set_Penulis("A. Fatih Syuhud");
        buku17.set_Kode(402);
        
        //Buku 18
        Buku buku18 = new Buku();
        buku18.set_Judul("Islamku Islam Anda Islam Kita");
        buku18.set_Penulis("Abdurrahman Wahid");
        buku18.set_Kode(403);
        
        //Buku 19
        Buku buku19 = new Buku();
        buku19.set_Judul("Tuhan Tidak Perlu Dibela");
        buku19.set_Penulis("Abdurrahman Wahid");
        buku19.set_Kode(404);
        
        //Buku 20
        Buku buku20 = new Buku();
        buku20.set_Judul("Terjemah Ta'limul Muta'allim");
        buku20.set_Penulis("Aliy As'ad");
        buku20.set_Kode(405);
        
        //Buku Psikologi
        //Buku 21
        Buku buku21 = new Buku();
        buku21.set_Judul("Ada Apa Dengan Tubuhku?");
        buku21.set_Penulis("Lynda Madaras");
        buku21.set_Kode(501);
        
        //Buku 22
        Buku buku22 = new Buku();
        buku22.set_Judul("Analisis Tulisan Tangan");
        buku22.set_Penulis("Karen K. Amend");
        buku22.set_Kode(502);
        
        //Buku 23
        Buku buku23 = new Buku();
        buku23.set_Judul("Asas-Asas Penelitian Behavioral");
        buku23.set_Penulis("Fred N. Kerlinger");
        buku23.set_Kode(503);
        
        //Buku 24
        Buku buku24 = new Buku();
        buku24.set_Judul("Bimbingan Konseling");
        buku24.set_Penulis("Fenti Hikmawati");
        buku24.set_Kode(504);
        
        //Buku 25
        Buku buku25 = new Buku();
        buku25.set_Judul("Biopsikologi - Pembelajaran Perilaku");
        buku25.set_Penulis("Wowo Sunaryo Kuswana");
        buku25.set_Kode(505);
        
        //Buku Politik
        //Buku 26
        Buku buku26 = new Buku();
        buku26.set_Judul("Pengantar Ilmu Politik");
        buku26.set_Penulis("F. Isjwara");
        buku26.set_Kode(601);
        
        //Buku 27
        Buku buku27 = new Buku();
        buku27.set_Judul("Perkembangan Ilmu Politik di Indonesia");
        buku27.set_Penulis("Miriam Budiardjo");
        buku27.set_Kode(602);
        
        //Buku 28
        Buku buku28 = new Buku();
        buku28.set_Judul("Pengantar Ilmu politik");
        buku28.set_Penulis("Iwa Kusuma Sumantri");
        buku28.set_Kode(603);
        
        //Buku 29
        Buku buku29 = new Buku();
        buku29.set_Judul("Dasar-dasar Ilmu Politik");
        buku29.set_Penulis("Miriam Budiardjo");
        buku29.set_Kode(604);
        
        //Buku 30
        Buku buku30 = new Buku();
        buku30.set_Judul("Sistem Politik Indonesia");
        buku30.set_Penulis("Sukana");
        buku30.set_Kode(605);
        
        //Buku Fiksi
        //Buku 31
        Buku buku31 = new Buku();
        buku31.set_Judul("Asmaraloka");
        buku31.set_Penulis("Danarto");
        buku31.set_Kode(701);
        
        //Buku 32
        Buku buku32 = new Buku();
        buku32.set_Judul("Nagabumi II");
        buku32.set_Penulis("Seno Gumira Ajidarma");
        buku32.set_Kode(702);
        
        //Buku 33
        Buku buku33 = new Buku();
        buku33.set_Judul("Lampuki");
        buku33.set_Penulis("Arafat Nur");
        buku33.set_Kode(703);
        
        //Buku 34
        Buku buku34 = new Buku();
        buku34.set_Judul("The Lord of The Rings");
        buku34.set_Penulis("J. R. R. Tolkien");
        buku34.set_Kode(704);
        
        //Buku 35
        Buku buku35 = new Buku();
        buku35.set_Judul("The Lion, the Witch and the Wardrobe");
        buku35.set_Penulis("C. S. Lewis");
        buku35.set_Kode(705);
        
        System.out.println("=============== Menu Utama ================");
        System.out.println("1. Teknologi    4. Agama        7. Fiksi");
        System.out.println("2. Filsafat     5. Psikologi    8. All");
        System.out.println("3. Sejarah      6. Politik      0. Keluar");
        System.out.println("===========================================");
        System.out.print("Masukkan pilihan anda : ");
        byte pilihan = masuk.nextByte();
        System.out.println("");
        
        while (pilihan != 0) {
            switch(pilihan) {
                case 1 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku1.displayMessage(); buku2.displayMessage(); buku3.displayMessage();
                    buku4.displayMessage(); buku5.displayMessage(); break;

                case 2 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku6.displayMessage(); buku7.displayMessage(); buku8.displayMessage();
                    buku9.displayMessage(); buku10.displayMessage(); break;

                case 3 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku11.displayMessage(); buku12.displayMessage(); buku13.displayMessage();
                    buku14.displayMessage(); buku15.displayMessage(); break;

                case 4 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku16.displayMessage(); buku17.displayMessage(); buku18.displayMessage();
                    buku19.displayMessage(); buku20.displayMessage(); break;

                case 5 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku21.displayMessage(); buku22.displayMessage(); buku23.displayMessage();
                    buku24.displayMessage(); buku25.displayMessage(); break;

                case 6 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku26.displayMessage(); buku27.displayMessage(); buku28.displayMessage();
                    buku29.displayMessage(); buku30.displayMessage(); break;

                case 7 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku31.displayMessage(); buku32.displayMessage(); buku33.displayMessage();
                    buku34.displayMessage(); buku35.displayMessage(); break;

                case 8 :
                    System.out.println("=========== SISTEM DATA BUKU PERPUSTAKAAN ===========\n");
                    buku1.displayMessage(); buku2.displayMessage(); buku3.displayMessage();
                    buku4.displayMessage(); buku5.displayMessage(); buku6.displayMessage();
                    buku7.displayMessage(); buku8.displayMessage(); buku9.displayMessage();
                    buku10.displayMessage(); buku11.displayMessage(); buku12.displayMessage();
                    buku13.displayMessage(); buku14.displayMessage(); buku15.displayMessage();
                    buku16.displayMessage(); buku17.displayMessage(); buku18.displayMessage();
                    buku19.displayMessage(); buku20.displayMessage(); buku21.displayMessage();
                    buku22.displayMessage(); buku23.displayMessage(); buku24.displayMessage();
                    buku25.displayMessage(); buku26.displayMessage(); buku27.displayMessage();
                    buku28.displayMessage(); buku29.displayMessage(); buku30.displayMessage();
                    buku31.displayMessage(); buku32.displayMessage(); buku33.displayMessage();
                    buku34.displayMessage(); buku35.displayMessage(); break;
            }
            
            System.out.println("=============== Menu Utama ================");
            System.out.println("1. Teknologi    4. Agama        7. Fiksi");
            System.out.println("2. Filsafat     5. Psikologi    8. All");
            System.out.println("3. Sejarah      6. Politik      0. Keluar");
            System.out.println("===========================================");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = masuk.nextByte();
            System.out.println("");
        }
    } 
}
