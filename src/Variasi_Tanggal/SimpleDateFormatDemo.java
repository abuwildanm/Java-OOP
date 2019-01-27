package Variasi_Tanggal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy ");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SS  ");
	SimpleDateFormat sdf3 = new SimpleDateFormat("E, dd-MMM-yyyy HH:mm:ss:SS");
	SimpleDateFormat sdf4 = new SimpleDateFormat("E, dd-MMM-yyyy HH:mm:ss:SS a");
	
        System.out.println(sdf.format(date));
	System.out.println(sdf2.format(date));
	System.out.println(sdf3.format(date));
	System.out.println(sdf4.format(date));
    }
    
}
