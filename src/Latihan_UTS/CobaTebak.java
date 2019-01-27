package Latihan_UTS;

public class CobaTebak {
    public Integer cobaOutput;
    private int angka1;
    private static double angka2;
    private static int count = 0;
    
    public CobaTebak() {
        System.out.println("Hayoooo");
    }
    
    public CobaTebak(int angka1, double angka2) {
        new CobaTebak();
        this.angka1 = angka1;
        this.angka2 = angka2;
        count++;
    }
    
    public int getAngka1() {
        return angka1;
    }
    
    public double getAngka2() {
        return angka2;
    }

    public static int getCount() {
        return count;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public static void setAngka2(double angka2) {
        CobaTebak.angka2 = angka2;
    }

//    public static void setAngka(int angka1, double angka2) {
//        this.angka1 = angka1;
//        CobaTebak.angka2 = angka2;
//        getCount(); // ==> cuma percobaan aja
//    }
}
