package Overload;

public class LingkaranMain {

    public static void main(String[] args) {
        lingkaran l = new lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        lingkaran l2 = new lingkaran(4, 10);
        l2.displayMessage();
        
        lingkaran Lstring = new lingkaran("6", "8");
        Lstring.displayMessage();
    }
    
}
