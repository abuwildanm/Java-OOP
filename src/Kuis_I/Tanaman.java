package Kuis_I;

public class Tanaman {
    private String nama, jenis;
    private int umur;
    private static int jmlTanaman = 0;
    private int panenAwal;

    public Tanaman(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        jmlTanaman++;
    }
    
    public int WaktuPanen() {
        int selisih;
        
        if (jenis.equals("Buah")) {
            panenAwal = 5;
            selisih = umur - panenAwal;
            
            if (umur == panenAwal) return panenAwal += 3;
            else if (umur > panenAwal) return umur += (3 - selisih);
            else return panenAwal;
        }
        
        else if (jenis.equals("Sayur")) {
            panenAwal = 2;
            selisih = umur - panenAwal;
            
            if (umur == panenAwal) return panenAwal += 4;
            else if (umur > panenAwal) return umur += (4 - selisih);
            else return panenAwal;
        }
        
        else return 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public static int getJmlTanaman() {
        return jmlTanaman;
    }

    public static void setJmlTanaman(int jmlTanaman) {
        Tanaman.jmlTanaman = jmlTanaman;
    }
    
    
}
