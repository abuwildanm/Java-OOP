package Package.coba;

import Package.baru.Baru;

public class Coba {
    
    public int g;
    int h;
    private int i;

    public Coba(int g, int h, int i) {
        this.g = g;
        this.h = h;
        this.i = i;
    }

    public static void main(String[] args) {
        Coba obyek1 = new Coba(1,2,3);
        Coba2 obyek2 = new Coba2(4,5,6);
        Baru obyek3 = new Baru(7,8,9);
        yoi obyek4 = new yoi();
        
        System.out.println("nilai g : " + obyek1.g);
        System.out.println("nilai h : " + obyek1.h);
        System.out.println("nilai i : " + obyek1.i);
        
        System.out.println("nilai d : " + obyek2.d);
        System.out.println("nilai e : " + obyek2.e);
//        System.out.println("nilai f : " + obyek2.f);
        
        System.out.println("nilai a : " + obyek3.a);
//        System.out.println("nilai b : " + obyek3.b);
//        System.out.println("nilai c : " + obyek3.c);
    }   
}

class yoi { // di dalam satu file java hanya boleh ada satu class yang hak aksesnya public
    public int j;
}

// mutators = set method
// accessors = get method