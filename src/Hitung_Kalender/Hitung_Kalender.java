package Hitung_Kalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hitung_Kalender {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tanggal pinjam: ");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date2=null;

        try {
            date2 = dateFormat.parse(scanner.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Masukkan tanggal kembali: ");
        Date date3=null;

        try {
            date3 = dateFormat.parse(scanner.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        long selisih = Math.abs(date3.getTime() - date2.getTime());
        long selisihHari = selisih / (24 * 60 * 60 * 1000);

        System.out.println("Selisihhari:"+ selisihHari);
    }
}

