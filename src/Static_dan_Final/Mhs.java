package Static_dan_Final;

import java.util.Scanner;

public class Mhs {
    String nama;
    int NIM;
    final char JK;
    static final String fakultas = "Fakultas Ilmu Komputer";
    static int jmlObjek = 0;
    
    public Mhs() {
        Scanner masuk = new Scanner(System.in);
        
        JK = masuk.next().charAt(0);
        
        jmlObjek++;
    }
    
    static int getJmlObjek() {
        return jmlObjek;
    }
    
    static void setJmlObjek(int jml) {
        jmlObjek = jml;
    }
    
    protected void finalize() {
        jmlObjek--;
    }
}
