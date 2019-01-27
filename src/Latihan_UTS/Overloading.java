package Latihan_UTS;

public class Overloading {
    public static void HitungLuas(int a, int b) {
        int nilai = a * b;
        System.out.println("maka hasil luas : " + nilai);
    }

    public void HitungLuas(double value, double value2) {
        double nilai = value * value2;
        System.out.println("maka hasil luas : " + nilai);
    }
}
