package Exception;

import java.util.Scanner;

public class FaktorialTest {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penghitung Nilai Faktorial ***\n");
        
        System.out.print("Masukkan bilangannya : ");
        int bilangan = masuk.nextInt();
        
        try { System.out.println("Hasilnya : " + Faktorial(bilangan)); } 
        catch (FaktorialException e) { System.err.println(e.getMessage()); }
    }
    
    public static int Faktorial(int n) throws FaktorialException {
        int hasil = n;
        
        if (n < 0) throw new FaktorialException("Bilangan tidak boleh < 0");
        else if (n == 0 || n == 1) return 1;
        else { for (int i = 1; i < n; i++) { hasil *= n-i; } }
        
        return hasil;
    }
}
