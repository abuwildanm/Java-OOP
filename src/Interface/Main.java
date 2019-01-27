package Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Circle lingkaran;
        
        System.out.print("Apakah lingkaran anda memiliki warna? (Y/N) : ");
        String konfirmasi = masuk.next();
        
        if (konfirmasi.equals("Y")) {
            System.out.print("Apakah warna lingkaran anda? : ");
            String warna = masuk.next();
            
            lingkaran = new Circle(warna);
        }
        else { lingkaran = new Circle(); }
        
        System.out.print("Kategori berapa banguh kotak anda? : ");
        Integer kategori = masuk.nextInt();
        
        lingkaran.howToColor();
        lingkaran.compareTo(kategori);
        
        System.out.print("\nBerapakah jari-jari lingkaran anda? : ");
        lingkaran.setRadius(masuk.nextInt());
        
        System.out.println("\nKeliling lingkaran : " + lingkaran.getKeliling());
        System.out.println("Luas lingkaran : " + lingkaran.getLuas());
        
//        Rectangle kotak;
//
//        System.out.print("Apakah bangun kotak anda memiliki warna? (Y/N) : ");
//        String konfirmasi = masuk.next();
//        
//        if (konfirmasi.equals("Y")) {
//            System.out.print("Apakah warna bangun kotak anda? : ");
//            String warna = masuk.next();
//            
//            kotak = new Rectangle(warna);
//        }
//        else { kotak = new Rectangle(); }
//        
//        System.out.print("Kategori berapa banguh kotak anda? : ");
//        Integer kategori = masuk.nextInt();
//        
//        kotak.howToColor();
//        kotak.compareTo(kategori);
    }  
}
