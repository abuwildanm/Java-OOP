package Class_dan_Object;

import java.util.Scanner;

public class Aplikasi {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        AC ac1 = new AC();
        ac1.set_Status("AC Nyala");
        ac1.set_Suhu(20);
        ac1.status = "AC Nyala";
        ac1.suhu = 20;
        
        byte pilihan = 0;
        
        System.out.println("====== Menu Utama AC ======");
        System.out.println("1. Nyala / mati");
        System.out.println("2. Menambah suhu");
        System.out.println("3. Mengurangi suhu");
        System.out.println("==========================");
        System.out.println("Masukkan pilihan anda : ");
        
        
        while(pilihan != 1) {
            pilihan = masuk.nextByte();
            
            switch(pilihan) {
                case 1 : 
                    ac1.set_Status("AC Mati");
                    System.out.println("AC Mati");
                    break;

                case 2 :
                    ac1.suhu++;
                    System.out.println("Suhu sekarang : " + ac1.suhu);
                    break;

                case 3 :
                    ac1.suhu--;
                    System.out.println("Suhu sekarang : " + ac1.suhu);
                    break;
            }
        }
        
        
    }
    
}
