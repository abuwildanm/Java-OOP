package Variasi_Tanggal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class JavaDateDemo {

    public static void main(String[] args) {
        // membuat objek date
        Date date = new Date();
        
        // menampilkan tanggal dan waktu sekarang
        System.out.println(date.toString());
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
       
        Date tahunMasuk = new Date();
//        tahunMasuk = null;
        tahunMasuk.setYear(2000);
        
//        try {
//            tahunMasuk = dateFormat.parse("2000");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        int convert = Integer.parseInt(tahunMasuk.toString());
        int tahunSekarang = Integer.parseInt(dateFormat.format(date));
        
        System.out.println(tahunMasuk);
        System.out.println(tahunMasuk.getYear());
        System.out.println(tahunSekarang - tahunMasuk.getYear());
    }
    
}
