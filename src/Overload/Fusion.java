package Overload;

public class Fusion {
    private int angka1, angka2;
    private String kata1, kata2;
    
    public void gabung(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        
        System.out.println("Hasilnya : " + (this.angka1 + this.angka2));
        System.out.println("");
    }
    
    public void gabung(String kata1, String kata2) {
        this.kata1 = kata1;
        this.kata2 = kata2;
        
        System.out.println("Hasilnya : " + (this.kata1 + this.kata2));
        System.out.println("");
    }
    
    public void gabung(int angka, String kata) {
        angka1 = angka;
        kata1 = kata;
        
        System.out.println("Hasilnya : " + (angka1 + kata1));
        System.out.println("");
    }
}
