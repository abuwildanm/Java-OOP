package Inheritance;

public class Freelancer extends Pegawai {
    private int jamKerja;

    public Freelancer(String noIndukPegawai, String nama, int tahunMasuk, boolean keluarga, int jumlahAnak, int jamKerja, double gajiPokok) {
        super(noIndukPegawai, nama, tahunMasuk, keluarga, jumlahAnak, gajiPokok);
        this.jamKerja = jamKerja;
    }
    
    public double getBonusLembur() {
        if (jamKerja > 10) return 0.05 * getGajiPokok() * (jamKerja - 10);
        else return 0;
    }
    
    public double getTotalGaji() { return super.getTotalGaji() + getBonusLembur(); }
}
