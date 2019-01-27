package pa_basdat;

public class Mahasiswa {
    private long nim, idPetugas;
    private String nama, fakultas, prodi;

    public Mahasiswa() {}

    public Mahasiswa(long nim, String nama, String fakultas, String prodi, long idPetugas) {
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.idPetugas = idPetugas;
    }

    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public long getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(long idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
