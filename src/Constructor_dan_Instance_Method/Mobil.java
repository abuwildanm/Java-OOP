package Constructor_dan_Instance_Method;

public class Mobil {
    
    public Mobil() {
        this(1,2);
        
        System.out.println("Mobil dibuat");
        
    }
    
    public Mobil(int a, int b) {
        System.out.println(a+b);
        new Mobil();
    }
}
