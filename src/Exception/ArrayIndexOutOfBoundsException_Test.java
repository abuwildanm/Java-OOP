package Exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException_Test {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int hasil = 0;
        
        System.out.println("*** Program Penjumlahan Angka ***\n");

        System.out.print("Masukkan banyaknya angka : ");
        int banyak = masuk.nextInt();
        
        int angka[] = new int[banyak];
        
        System.out.println("--------------------------------");
        for (int i = 0; ; i++) {
            try {
                System.out.print("Masukkan angka ke-" + (i+1) + " : ");
                angka[i] = masuk.nextInt();
                hasil += angka[i]; 
            }
            catch (ArrayIndexOutOfBoundsException e) { 
                System.out.println("\nKelebihan 1 angka !"); 
                System.out.println("Angka ke-" + (i+1) + " tidak akan dihitung");
                break;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Hasilnya : " + hasil);
    }
}
