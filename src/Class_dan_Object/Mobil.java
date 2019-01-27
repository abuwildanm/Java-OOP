package Class_dan_Object;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = i;
        rubahKecepatan();
    }
    private void rubahKecepatan() {
        kecepatan = kecepatan * 1000 / 3600;
    }
    public void setWaktu(double jam){
        waktu = rubahSekon(jam);
    }
    private double rubahSekon(double jam) {
        waktu = jam * 3600;
        return waktu;
    }
    public double hitungJarak() {
        double jarak = kecepatan * waktu;
        return jarak;
    }
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("dengan waktu tempuh "+waktu+" detik");
        System.out.println("yang dapat menempuh jarak" + hitungJarak() / 1000);
    }
}
