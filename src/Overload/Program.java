package Overload;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int angka1, angka2;
        String kata1, kata2;
        byte pilihan = 0;
        
        Fusion fusion = new Fusion();
        
        do {
        System.out.println("========= Menu Utama Fusion =========");
        System.out.println("1. Fusion 2 Bilangan");
        System.out.println("2. Fusion 2 Kata/Kalimat");
        System.out.println("3. Fusion Bilangan dan Kata/Kalimat");
        System.out.println("0. Berhenti");
        System.out.println("=====================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch(pilihan) {
            case 1 : 
                System.out.print("Masukkan angka pertama  : ");
                angka1 = masuk.nextInt();
                System.out.print("Masukkan angka kedua    : ");
                angka2 = masuk.nextInt();
                System.out.println("");
                fusion.gabung(angka1, angka2);
            break;
            
            case 2 :
                System.out.print("Masukkan kata/kalimat pertama : ");
                masuk.nextLine();
                kata1 = masuk.nextLine();
                System.out.print("Masukkan kata/kalimat kedua   : ");
                kata2 = masuk.nextLine();
                System.out.println("");
                fusion.gabung(kata1, kata2);
            break;
            
            case 3 : 
                System.out.print("Masukkan angka        : ");
                angka1 = masuk.nextInt();
                masuk.nextLine();
                System.out.print("Masukkan kata/kalimat : ");
                kata1 = masuk.nextLine();
                System.out.println("");
                fusion.gabung(angka1, kata1);
            break;
            
            case 0 : System.out.println("PROGRAM DIHENTIKAN !"); break;
            default : System.out.println("Input Anda Salah !"); break;
        }
        } while(pilihan != 0);
        
    }
    
}
