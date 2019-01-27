package Kuis_I;

public class Makanan {
    Hewan hewan;
    Tanaman tanaman;

    public Makanan(Hewan hewan, Tanaman tanaman) {
        this.hewan = hewan;
        this.tanaman = tanaman;
    }
    
    public Makanan(Hewan hewan1, Hewan hewan2) {
        this.hewan = hewan1;
        this.hewan = hewan2;
    }

    public Hewan getHewan() {
        return hewan;
    }

    public void setHewan(Hewan hewan) {
        this.hewan = hewan;
    }

    public Tanaman getTanaman() {
        return tanaman;
    }

    public void setTanaman(Tanaman tanaman) {
        this.tanaman = tanaman;
    }
    
    
}
