package Exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        try {
            double x = ExcTest.division(9, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Horee");
        }

//        System.out.println(ExcTest.division(9, 0));
        
        String yy = "Wildan";
//        String sub = yy.substring(0, yy.length() – 3);
        String sub = yy.substring(0, yy.length() - 3);
        
        int angka[] = {9, 8, 7, 6};
        
        System.out.println(angka[3]);
        
        ExcTest coba = null;
        
        System.out.println(coba);
        
        System.out.println("Masukkan sesuatu : ");
        int sesuatu = masuk.nextInt();
    }
}

