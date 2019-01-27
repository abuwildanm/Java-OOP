package Latihan_UTS;

public class MainOverloading {

    public static void main(String[] args) {
        Overloading hitung = new Overloading();
        hitung.HitungLuas(5.0, 8);
        hitung.HitungLuas(10, 12);
        
        int x = 3;
        if (x != 0) {
            System.out.println("\"Hello World Ma'ruf\r\b\b"); // \r nya ilangin aja
        } else {
            System.out.println("Ooopss");
        }

    }
    
}
