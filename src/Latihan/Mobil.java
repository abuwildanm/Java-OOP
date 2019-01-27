package Latihan;

public class Mobil {
    String plat, merk, warna;
    
    public Mobil(String plat, String merk, String warna) {
        this.plat = plat;
        this.merk = merk;
        this.warna = warna;
    }
    
    public void display() {
        System.out.println("No. Plat    : " + plat);
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("-----------------------------------\n");
    }
    
    //Method set-get
    public void setPlat (String plat) { this.plat = plat; }
    public void setMerk (String merk) { this.merk = merk; }
    public void setWarna (String wanna) { this.warna = warna; }
    public String getPlat() { return plat; }
    public String getMerk() { return merk; }
    public String getWarna() { return warna; }
}
