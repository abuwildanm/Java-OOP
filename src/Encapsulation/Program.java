package Encapsulation;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte pilihan = 0;
        int nominal, rekening;
        
        Nasabah nasabah1 = new Nasabah("Wildan", 12345, 999999999);
        
        System.out.println("Hello, " + nasabah1.getNama() + "\n");
        
        System.out.print("Masukkan PIN anda : ");
        int pin = masuk.nextInt();
        System.out.println("");
        
        do {
        if (pin == nasabah1.getPIN()) {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Tarik");
            System.out.println("2. Transfer");
            System.out.println("3. Setor");
            System.out.println("0. Berhenti");
            System.out.println("==================");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = masuk.nextByte();
            System.out.println("");
            
            switch (pilihan) {
                case 1 : 
                    System.out.print("Masukkan nominal uang : ");
                    nominal = masuk.nextInt();

                    nasabah1.Tarik(nominal);
                    System.out.println("Penarikan BERHASIL !\n");
                    
                    System.out.println("Sisa saldo anda     : " + nasabah1.getSaldo() + "\n");
                break;
                
                case 2 : 
                    System.out.print("Masukkan nominal uang     : ");
                    nominal = masuk.nextInt();
                    System.out.print("Masukkan rekening tujuan  : ");
                    rekening = masuk.nextInt();
                    
                    nasabah1.Transfer(nominal);
                    System.out.println("Transfer BERHASIL !\n");
                    
                    System.out.println("Sisa saldo anda     : " + nasabah1.getSaldo() + "\n");
                break;
                
                case 3 : 
                    System.out.print("Masukkan nominal uang : ");
                    nominal = masuk.nextInt();
                    
                    nasabah1.Setor(nominal);
                    System.out.println("Penyetoran BERHASIL !\n");
                    
                    System.out.println("Sisa saldo anda     : " + nasabah1.getSaldo() + "\n");
                break;
                
                case 0 : System.out.println("PROGRAM DIHENTIKAN !"); break;
                default : System.out.println("Input Salah !"); break;
            }
        }
        
        else System.out.println("PIN anda salah !");
        
        } while (pilihan != 0);
    }
    
}
