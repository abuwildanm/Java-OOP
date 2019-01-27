package Variasi_Tanggal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kalender {

    public static void main(String[] args) {
        Calendar kalender = Calendar.getInstance();
        Date date = new Date();
        GregorianCalendar kalender1 = new GregorianCalendar(2017, 5-1, 4);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(kalender.get(Calendar.MONTH));
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(date).substring(0, 2));
        System.out.println(sdf.format(date).substring(3, 5));
        System.out.println(sdf.format(date).substring(6, 10));
        
        date = kalender1.getTime();
        
        System.out.println(date);
    }
    
}
