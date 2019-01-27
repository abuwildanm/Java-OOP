package pa_basdat;

public class Petugas {
    private long id;
    private String nama, jabatan;
    private int jamKerja, gaji;

    public Petugas() {}
    
    public Petugas(long id, String nama, String jabatan, int jamKerja, int gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.jamKerja = jamKerja;
        this.gaji = gaji;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
