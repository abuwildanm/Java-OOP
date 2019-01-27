package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pegawai {
    private String nama, noIndukPegawai;
    private Date tahunMasuk = new Date();
    private double gajiPokok;
    private boolean keluarga;
    private int jumlahAnak;
    
    public Pegawai(String noIndukPegawai, String nama, int tahunMasuk, boolean keluarga, int jumlahAnak, double gajiPokok) {
        this.noIndukPegawai = noIndukPegawai;
        this.nama = nama;
        this.tahunMasuk.setYear(tahunMasuk);
        this.keluarga = keluarga;
        this.jumlahAnak = jumlahAnak;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() { return nama; }
    public String getNoIndukPegawai() { return noIndukPegawai; }
    public int getTahunMasuk() { return tahunMasuk.getYear(); }
    public int getJumlahAnak() { return jumlahAnak; }
    public double getGajiPokok() { return gajiPokok; }
    public String getKeluarga() {
        if (keluarga) return "Berkeluarga";
        else return "Tidak Berkeluarga";
    }
    
    public double getBonus() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date tanggalSekarang = new Date();
        int tahunSekarang = Integer.parseInt(sdf.format(tanggalSekarang));
        int lamaKerja = tahunSekarang - tahunMasuk.getYear();
        
        if (lamaKerja > 5) return 0.1 * gajiPokok * lamaKerja;
        else if (lamaKerja <= 5 && lamaKerja >= 1) return 0.05 * gajiPokok * lamaKerja;
        else return 0;
    }
    
    public double getTunjangan() {
        if (keluarga) {
            if (jumlahAnak > 0) { 
                if (jumlahAnak > 2) return 0.05 * (gajiPokok * 2);
                else return 0.05 * (gajiPokok * jumlahAnak);
            }
            else return 0.05 * gajiPokok;
        }
        else return 0;
    }
    
    public double getTotalGaji() { return gajiPokok + getBonus() + getTunjangan(); }
}
