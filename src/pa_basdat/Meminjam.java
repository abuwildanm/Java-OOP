package pa_basdat;

import java.sql.Date;

public class Meminjam {
    private long nim;
    private int idBuku;
    private long idPetugas;
    private Date pinjam, kembali;

    public Meminjam() {}

    public Meminjam(long nim, int idBuku, long idPetugas, Date pinjam, Date kembali) {
        this.nim = nim;
        this.idBuku = idBuku;
        this.idPetugas = idPetugas;
        this.pinjam = pinjam;
        this.kembali = kembali;
    }

    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
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

    public Date getPinjam() {
        return pinjam;
    }

    public void setPinjam(Date pinjam) {
        this.pinjam = pinjam;
    }

    public Date getKembali() {
        return kembali;
    }

    public void setKembali(Date kembali) {
        this.kembali = kembali;
    }
    
    
}
