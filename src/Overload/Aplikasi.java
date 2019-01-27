package Overload;

import java.util.Scanner;
import java.util.Arrays;

public class Aplikasi {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte pilihan = 0;
        String columnName, operator;
        Object value;
        String kategori[] = {"No. ID", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda"};
        
        Database db = new Database();

        do {
        System.out.println("=================== Menu Utama ===================");
        System.out.println("1. Tampilkan semua data");
        System.out.println("2. Tampilkan data berdasarkan ID");
        System.out.println("3. Tampilkan data berdasarkan Category and Value");
        System.out.println("4. Tampilkan data berdasarkan Interval");
        System.out.println("0. Keluar");
        System.out.println("==================================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : 
                System.out.println("------------------------------------------------------------------------");
                System.out.printf("%-10s %-10s %-15s %-15s %-10s %-10s \n", "No. ID", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
                db.get(); 
                System.out.println("------------------------------------------------------------------------\n");
            break;
                
            case 2 :
                System.out.print("Masukkan nomor ID anda : ");
                int id = masuk.nextInt();
                
                System.out.println("------------------------------------------------------------------------");
                System.out.printf("%-10s %-10s %-15s %-15s %-10s %-10s \n", "No. ID", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
                db.get(id); 
                System.out.println("------------------------------------------------------------------------\n");  
            break;
            
            case 3 :
                System.out.println("Daftar Kategori   : " + Arrays.toString(kategori));
                
                System.out.print("Ketikkan kategori : ");
                masuk.nextLine();
                columnName = masuk.nextLine();
                System.out.print("Masukkan nilainya : ");
                value = masuk.nextLine();
                
                System.out.println("------------------------------------------------------------------------");
                System.out.printf("%-10s %-10s %-15s %-15s %-10s %-10s \n", "No. ID", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
                db.get(columnName, value); 
                System.out.println("------------------------------------------------------------------------\n");
            break;
            
            case 4 : 
                System.out.println("Daftar Kategori                       : " + Arrays.toString(kategori));
                
                System.out.print("Ketikkan kategori                     : ");
                masuk.nextLine();
                columnName = masuk.nextLine();
                System.out.print("Masukkan operator (<, <=, >=, >, ==)  : ");
                operator = masuk.nextLine();
                System.out.print("Masukkan nilainya                     : ");
                value = masuk.nextLine();

                System.out.println("------------------------------------------------------------------------");
                System.out.printf("%-10s %-10s %-15s %-15s %-10s %-10s \n", "No. ID", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
                db.get(columnName, operator, value); 
                System.out.println("------------------------------------------------------------------------\n");
            break;
            
            case 0 : System.out.println("PROGRAM DIHENTIKAN !\n"); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    }
    
}
