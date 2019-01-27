package Exception;

public class Uji {

    public static void main(String[] args) {
        Hewan hewan = null;
        
        try {
            hewan.setNama("Gajah");
            System.out.println(hewan.getNama());
        } catch(NullPointerException e) {
            System.out.println("Objek anda masih null !");
        }
    } 
}

