package Polimorfisme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Member extends Induk {
    Scanner masuk = new Scanner(System.in);
    double totalKamarDiskon = 0;

    public Member(int noKTP, String nama, String noTelp, String alamat) {
        super(noKTP, nama, noTelp, alamat);
    }

    @Override
    public int PesanKamar() {
        double diskon = 0;
        ArrayList <String> kalimatList = new ArrayList();
        
        System.out.print("Jumlah kamar yang ingin dipesan : ");
        byte jumlah = masuk.nextByte();
        System.out.println("");
        
        if (jumlah > 5) System.out.println("WARNING ! Pesanan maksimal 5 kamar\n");
        
        while (jumlah <= 5) {
        String kamar[] = new String[jumlah];
        String kalimat[] = {};
        
        System.out.println("-------------------------------------------------");
        System.out.println("Ketikkan pesanan anda");
        masuk.nextLine();
        for (int i = 0; i < kamar.length; i++) {
            System.out.print("Pesanan ke- " + (i+1) + " : ");
            kamar[i] = masuk.nextLine();
            kalimat = kamar[i].split(" ");
            
            kalimatList.addAll(Arrays.asList(kalimat));
        }
        
        for (int i = 0; i < kalimatList.size(); i++) {
            if (kalimatList.get(i).equalsIgnoreCase("Single")) {
                voucher += 1;
                if (kalimatList.get(i+1).equalsIgnoreCase("Weekdays")) totalKamar += 200000;
                else totalKamar += 250000;
            }
            else if (kalimatList.get(i).equalsIgnoreCase("Double")) {
                voucher += 2;
                if (kalimatList.get(i+1).equalsIgnoreCase("Weekdays")) totalKamar += 375000;
                else totalKamar += 450000;
            }
            else if (kalimatList.get(i).equalsIgnoreCase("Suite")) {
                voucher += 6;
                if (kalimatList.get(i+1).equalsIgnoreCase("Weekdays")) totalKamar += 750000;
                else totalKamar += 800000;
            }
            else totalKamar += 0;
            
            try {
                if (kalimatList.get(i+1).equalsIgnoreCase("Weekdays")) diskon = totalKamar * 0.05;
            } catch (IndexOutOfBoundsException e) { break; }
            
            totalKamarDiskon = totalKamar - diskon;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total biaya kamar                : Rp." + totalKamar);
        System.out.println("Diskon member                    : Rp." + diskon);
        System.out.println("Total biaya kamar setelah diskon : Rp." + totalKamarDiskon);
        System.out.println("-------------------------------------------------\n"); break; 
        } return voucher;
    }

    @Override
    public void PesanMakan() {
        int totalBreakfast, totalLunch, totalDinner;
        System.out.println("------------------------------");
        System.out.print("Breakfast : ");
        int breakfast = masuk.nextInt();
        System.out.print("Lunch     : ");
        int lunch = masuk.nextInt();
        System.out.print("Dinner    : ");
        int dinner = masuk.nextInt();
        
        if (breakfast <= voucher) totalBreakfast = 0;
        else totalBreakfast = (breakfast - voucher) * 25000;
        
        if (lunch <= voucher) totalLunch = 0;
        else totalLunch = (lunch - voucher) * 25000;
        
        totalDinner = dinner * 30000;
        
        totalMakan = totalBreakfast + totalLunch + totalDinner;
        
        System.out.println("------------------------------");
        System.out.println("Total biaya makan : Rp." + totalMakan);
        System.out.println("------------------------------\n");
    }

    @Override
    public void PesanFasilitas() {
        System.out.println("----------------------------------");
        System.out.print("Kolam Renang : ");
        int kolam = masuk.nextInt();
        System.out.print("Sauna        : ");
        int sauna = masuk.nextInt();
        System.out.print("Spa          : ");
        int spa = masuk.nextInt();
        
        totalFasilitas = (sauna * 150000) + (spa * 150000);
        
        System.out.println("----------------------------------");
        System.out.println("Total biaya fasilitas : Rp." + totalFasilitas);
        System.out.println("----------------------------------\n");
    }

    @Override
    public void TotalPesanan() {
        System.out.println("-------------------------------------");
        System.out.println("Total biaya kamar     : Rp." + totalKamarDiskon);
        System.out.println("Total biaya makan     : Rp." + totalMakan);
        System.out.println("Total biaya fasilitas : Rp." + totalFasilitas);
        System.out.println("-------------------------------------");
        System.out.println("Total biaya pesanan   : Rp." + (totalKamarDiskon + totalMakan + totalFasilitas));
        System.out.println("-------------------------------------\n");
    }
}
