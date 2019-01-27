package pa_basdat;

public class Rak {
    private int id, kapasitas;
    private String kategori;

    public Rak() {}

    public Rak(int id, String kategori, int kapasitas) {
        this.id = id;
        this.kategori = kategori;
        this.kapasitas = kapasitas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
