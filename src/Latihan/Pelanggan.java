package Latihan;

public class Pelanggan {
    private int id, telpon;
    private String nama, alamat;
    
    public Pelanggan(int id, String nama, String alamat, int telpon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telpon = telpon;
    }
    
    public void display() {
        System.out.println("No. ID  : " + id);
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Telpon  : " + telpon);
        System.out.println("-----------------------------------\n");
    }
    
    //Method set-get
    public void setID (int id) { this.id = id; }
    public void setTelpon (int telpon) { this.telpon = telpon; }
    public void setNama (String nama) { this.nama = nama; }
    public void setAlamat (String alamat) { this.alamat = alamat; }
    public int getID() { return id; }
    public int getTelpon() { return telpon; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
}
