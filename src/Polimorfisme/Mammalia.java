package Polimorfisme;

public class Mammalia extends Hewan {

    @Override
    void makan() {
        System.out.println("Hayoo apa");
    }

    @Override
    void bernafas() {
        System.out.println("Hayoo gimana");
    }
    
    void jalan() {
        System.out.println("Dum dum");
    }
}
