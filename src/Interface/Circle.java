package Interface;

public class Circle implements Colorable, Comparable {
    private double radius;
    private String warna;
    private int kategori;
    
    public Circle() {}
    public Circle(String warna) { this.warna = warna; }

    public void setRadius(double radius) { this.radius = radius; }
    public double getKeliling() { return 2 * Math.PI * radius; }
    public double getLuas() { return Math.PI * radius * radius; }

    @Override
    public void howToColor() {
        if(this.warna == null) { System.out.println("tidak ada warna, warna lingkaran masih polos"); }
        else { System.out.println("lingkaran sudah diwarnai dengan warna " + this.warna); }
    }

    @Override
    public void compareTo(Object obj) {
        this.kategori = (int) obj;
        if(this.kategori == 0) { System.out.println("ukuran cat yang cocok untuk lingkaran dengan ukuran kategori " + this.kategori + " yaitu 2.5L" ); }
        else { System.out.println("ukuran cat yang cocok untuk lingkaran dengan ukuran kategori " + this.kategori + " yaitu 6.5L" ); }
    }
}
