package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array_List {

    public static void main(String[] args) {
//        ArrayList al = new ArrayList(); // ==> non-generic
        ArrayList <String> al = new ArrayList(); // ==> generic
        ArrayList <Integer> angka = new ArrayList();
        String namaOrang[] = {"Wildan, Adit, Imron"};
        
//        al.add("Wildan");
//        al.add("Adit");
//        al.add("Imron");
        
//        al.addAll(Arrays.asList("Wildan, Adit, Imron"));
        al.addAll(Arrays.asList(namaOrang));
        al.remove("Adit");
//        al.removeAll(al);
        
        angka.add(9);
        angka.add(8);
        angka.add(7);
        
        for (String nama : al) {
            System.out.println(nama);
        }
        System.out.println("");
        
        Iterator it = al.iterator();
        Iterator it1 = angka.iterator();
        
        while (it.hasNext()) { // ==> selama it mempunyai isi
            System.out.println(it.next());
        }
        
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
    
}
