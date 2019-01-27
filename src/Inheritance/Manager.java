package Inheritance;

public class Manager extends Pegawai {

    public Manager(String noIndukPegawai, String nama, int tahunMasuk, boolean keluarga, int jumlahAnak, double gajiPokok) {
        super(noIndukPegawai, nama, tahunMasuk, keluarga, jumlahAnak, gajiPokok);
    }
    
    public double getTunjanganJabatan() { return 0.1 * super.getTotalGaji(); }
    public double getTotalGaji() { return super.getTotalGaji() + getTunjanganJabatan(); }
}
