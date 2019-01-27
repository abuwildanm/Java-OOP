package pa_basdat;

import java.sql.Date;

public class Buku {
    private int idBuku, idRak;
    private String kategori, judul, penulis, penerbit;
    private Date tahun;

    public Buku() {}

    public Buku(int idBuku, String kategori, String judul, String penulis, String penerbit, Date tahun, int idRak) {
        this.idBuku = idBuku;
        this.kategori = kategori;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.idRak = idRak;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdRak() {
        return idRak;
    }

    public void setIdRak(int idRak) {
        this.idRak = idRak;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Date getTahun() {
        return tahun;
    }

    public void setTahun(Date tahun) {
        this.tahun = tahun;
    }
    
    
}
