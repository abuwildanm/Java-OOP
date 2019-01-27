package Inheritance;

public class Sales extends Pegawai {
    private double hargaBarang;
    private int stockBarang, barangTerjual;

    public Sales(String noIndukPegawai, String nama, int tahunMasuk, boolean keluarga, int jumlahAnak, double hargaBarang, int stockBarang, int barangTerjual, double gajiPokok) {
        super(noIndukPegawai, nama, tahunMasuk, keluarga, jumlahAnak, gajiPokok);
        this.hargaBarang = hargaBarang;
        this.stockBarang = stockBarang;
        this.barangTerjual = barangTerjual;
    }
    
    public double getBonusTambahan() {
        if (barangTerjual > (0.7 * stockBarang)) return 0.1 * (hargaBarang * barangTerjual);
        else return 0.03 * (hargaBarang * barangTerjual);
    }
    
    public double getTotalGaji() { return super.getTotalGaji() + getBonusTambahan(); }
}
