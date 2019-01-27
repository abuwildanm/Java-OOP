package Static_dan_Final;

import java.util.Scanner;

public class Perhitungan {
    static Scanner masuk = new Scanner(System.in);
    private static int banyak;
    private static double angka[], hasil;
    
    public static double[] Masukan() {
        System.out.println("------------------------------");
        System.out.print("Masukkan banyaknya angka : ");
        banyak = masuk.nextInt();
        angka = new double[banyak];
        
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke - " + (i+1) + " : ");
            angka[i] = masuk.nextInt();
        }
        return angka;
    }
    
    public static void Penjumlahan() {
        Masukan(); hasil = 0;
        for (int i = 0; i < angka.length; i++) {
            hasil = hasil + angka[i];
//            try { hasil = hasil + angka[i]; } 
//            catch (ArrayIndexOutOfBoundsException e) { break; }
        }
        System.out.println("Hasil penjumlahan : " + hasil);
        System.out.println("------------------------------\n");
    }
    
    public static void Pengurangan() {
        Masukan(); hasil = angka[0];
        for (int i = 1; i < angka.length; i++) {
            hasil = hasil - angka[i];
//            try { hasil = hasil - angka[i]; } 
//            catch (ArrayIndexOutOfBoundsException e) { break; }
        }
        System.out.println("Hasil pengurangan : " + hasil);
        System.out.println("------------------------------\n");
    }
    
    public void Perkalian() {
        Masukan(); hasil = 1;
        for (int i = 0; i < angka.length; i++) {
            hasil = hasil * angka[i];
//            try { hasil = hasil * angka[i]; } 
//            catch (ArrayIndexOutOfBoundsException e) { break; }
        }
        System.out.println("Hasil perkalian : " + hasil);
        System.out.println("------------------------------\n");
    }
    
    public void Pembagian() {
        Masukan(); hasil = angka[0];
        for (int i = 1; i < angka.length; i++) {
            hasil = hasil / angka[i];
//            try { hasil = hasil / angka[i]; } 
//            catch (ArrayIndexOutOfBoundsException e) { break; }
        }
        System.out.println("Hasil pembagian : " + hasil);
        System.out.println("------------------------------\n");
    }
    
    public void Sederhana() {
        System.out.print("Masukkan pembilangnya : ");
        int pembilang = masuk.nextInt();
        System.out.print("Masukkan penyebutnya  : ");
        int penyebut = masuk.nextInt();
        System.out.println("");
        
        int temp, A, B;
        
        if (penyebut == 0) { System.out.println("Penyebut tidak boleh 0 (nol) !\n"); return; }
        
        System.out.println("\n----------------------------------");
        System.out.println("Sebelum disederhanakan : " + pembilang + "/" + penyebut);

        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        while (B != 0) {
            temp= A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
        
        System.out.println("Sesudah disederhanakan : " + pembilang + "/" + penyebut);
        System.out.println("----------------------------------\n");
    }
}
