package Latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Peminjaman {
    Pelanggan pelanggan;
    Mobil mobil;
    String tglPinjam, tglKembali;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public Peminjaman(Pelanggan pelanggan) {
        
    }
    
    public Peminjaman(Pelanggan pelanggan, Mobil mobil, String tglPinjam, String tglKembali) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }
    
    public Pelanggan getDataPelanggan() { return pelanggan; }
    public Mobil getDataMobil() { return mobil; }
    
    public long HitungWaktu(String tglPinjam, String tglKembali) {
        Date date2 = null;

        try {
            date2 = dateFormat.parse(tglPinjam);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date date3 = null;

        try {
            date3 = dateFormat.parse(tglKembali);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        long selisih = Math.abs(date3.getTime() - date2.getTime());
        long selisihHari = selisih / (24 * 60 * 60 * 1000);
        
        return selisihHari;
    }
    
    public int Denda(String tglPinjam, String tglKembali) {
        int denda = 0;
        long telat = HitungWaktu(tglPinjam, tglKembali) - 7;
        
        if (HitungWaktu(tglPinjam, tglKembali) > 7)
            denda += (50000 * telat);
        
        return denda;
    }
    
    public void display() {
        System.out.println("No. ID  : " + pelanggan.getID());
        System.out.println("Nama    : " + pelanggan.getNama());
        System.out.println("Alamat  : " + pelanggan.getAlamat());
        System.out.println("Telpon  : " + pelanggan.getTelpon());
        System.out.println("-----------------------------------");
        System.out.println("No. Plat    : " + mobil.getPlat());
        System.out.println("Merk        : " + mobil.getMerk());
        System.out.println("Warna       : " + mobil.getWarna());
        System.out.println("-----------------------------------");
        System.out.println("Denda       : " + Denda(tglPinjam, tglKembali));
        System.out.println("-----------------------------------\n");
    }
}
