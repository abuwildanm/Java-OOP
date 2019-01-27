package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        Integer[] angka = {1,2,3,4,5,6,7,8}; // ini boleh ada boleh tidak
        ArrayList <Integer> angkaList = new ArrayList <Integer> ();
        
        for (Integer element : angka) {
            angkaList.add(element); //nambah elemen array
        }
        
        System.out.println("Isi dari ArrayList angkaList : " + angkaList);
        System.out.println("Banyak elemen dari angkaList : " + angkaList.size());
        
        angkaList.remove(1); // dia removenya ke index, bukan isinya
        
        System.out.println("Isi dari ArrayList angkaList : " + angkaList);
        System.out.println("Banyak elemen dari angkaList : " + angkaList.size());
        
        System.out.print("Masukkan nilai elemen baru : ");
//        angkaList.add(masuk.nextInt());
        System.out.println("Isi dari ArrayList angkaList : " + angkaList);
        System.out.println("Banyak elemen dari angkaList : " + angkaList.size());
        
        for (int i = 0; i < angkaList.size(); i++) {
            System.out.println(angkaList.get(i));
        }
        
        angkaList.remove(angkaList.indexOf(4)); // hapus pada indeks ke- berapa
        
        System.out.println("Isi dari ArrayList angkaList : " + angkaList);
        System.out.println("Banyak elemen dari angkaList : " + angkaList.size());
        
        angkaList.set(5, 30); // ganti nilai pada indeks ke- berapa dengan nilai apa
        
        System.out.println("Isi dari ArrayList angkaList : " + angkaList);
        System.out.println("Banyak elemen dari angkaList : " + angkaList.size());
        System.out.println("");
        
        Rekening rek1 = new Rekening("001123456789012", "Abu Wildan Mucholladin", 20000000, 123456);
        Rekening rek2 = new Rekening("192234567890123", "Afghan Syahreza", 15000000, 234567);
        Rekening rek3 = new Rekening("283345678901234", "Isyana Sarasvati", 10000000, 345678);
        Rekening rek[] = {rek1, rek2, rek3};
        
        ArrayList <Rekening> rekList = new ArrayList <Rekening> ();
        
        for (Rekening element : rek) rekList.add(element);
        
        for (int i = 0; i < rekList.size(); i++) {
            System.out.println(rekList.get(i).getNama());
        }
        System.out.println("");
        
        rekList.add(new Rekening("001123456789013", "Thomas Alfonso", 20000000, 123456));
        
        for (int i = 0; i < rekList.size(); i++) {
            System.out.println(rekList.get(i).getNama());
        }
    }
    
}
