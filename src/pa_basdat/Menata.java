package pa_basdat;

public class Menata {
    private int idBuku;
    private long idPetugas;

    public Menata() {}

    public Menata(int idBuku, long idPetugas) {
        this.idBuku = idBuku;
        this.idPetugas = idPetugas;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public long getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(long idPetugas) {
        this.idPetugas = idPetugas;
    }
    
    
}
