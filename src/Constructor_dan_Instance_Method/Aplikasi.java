package Constructor_dan_Instance_Method;

import java.util.Scanner;

public class Aplikasi {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa(165150);
        Mahasiswa mhs3 = new Mahasiswa(200111);
        
        System.out.println("=== Sebelum Dirubah ===");
        mhs1.display();
        mhs2.display();
        mhs3.display();
        
        //Perubahan
        mhs2.setPass(456);
        mhs3.setPass(789);
        
        System.out.println("=== Setelah Dirubah ===");
        mhs1.display();
        mhs2.display();
        mhs3.display();
    }
    
}
