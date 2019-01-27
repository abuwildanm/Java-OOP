package Static_dan_Final;

public class Aritmatika {
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
        hitungPerkalian(a, b);
    }
    
    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : "+nilai);
//        hitungPenjumlahan(a, b);
    }
    
    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }
    
    public double hitungPembagian(String nil1, String nil2){
        double nilai = Double.parseDouble(nil1) / Double.parseDouble(nil2);
        System.out.println("nilai pembagian adalah : "+nilai);
        return nilai;
    }
}
