package Exception;

import java.util.Scanner;

public class StackOverflowError_Test {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int bilangan = 0, pangkat = 0;
        
        System.out.println("*** Program Penghitung Pangkat ***\n");
        
        try {
            System.out.print("Masukkan bilangan basisnya  : ");
            bilangan = masuk.nextInt();
            System.out.print("Masukkan pangkatnya         : ");
            pangkat = masuk.nextInt();

            System.out.println("Hasilnya : " + Pangkat(bilangan, pangkat));
        }
        catch (StackOverflowError e) { System.out.println("\nWARNING ! Ada Stack Overflow"); }
        finally { 
            System.out.println("---------------------------------");
            System.out.println("Hasilnya : " + Math.pow(bilangan, pangkat)); 
        }
    }
    
    public static int Pangkat(int bil, int pang) { return bil * Pangkat(bil, pang-1); }
}
