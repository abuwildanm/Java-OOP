package Kuis_I;

public class Hewan {
    private String nama;
    private double berat, panjang, bmi;
    private static int jmlHewan = 0;

    public Hewan(String nama, double berat, double panjang) {
        this.nama = nama;
        this.berat = berat;
        this.panjang = panjang;
        jmlHewan++;
    }
    
    public double BMI() {
        bmi = berat / (panjang * panjang);
        return bmi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public static int getJmlHewan() {
        return jmlHewan;
    }

    public static void setJmlHewan(int jmlHewan) {
        Hewan.jmlHewan = jmlHewan;
    }
    
    
}
