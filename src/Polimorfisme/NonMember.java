package Polimorfisme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NonMember extends Induk {
    Scanner masuk = new Scanner(System.in);

    public NonMember(int noKTP, String nama, String noTelp, String alamat) {
        super(noKTP, nama, noTelp, alamat);
    }

    @Override
    public int PesanKamar() {
        ArrayList <String> kalimatList = new ArrayList();
        
        System.out.print("Jumlah kamar yang ingin dipesan : ");
        byte jumlah = masuk.nextByte();
        System.out.println("");
        
        if (jumlah > 3) System.out.println("WARNING ! Pesanan maksimal 3 kamar\n");
        
        while (jumlah <= 3) {
        String kamar[] = new String[jumlah];
        String kalimat[] = {};
        
        System.out.println("-------------------------------");
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
        }
        System.out.println("-------------------------------");
        System.out.println("Total biaya kamar : Rp." + totalKamar);
        System.out.println("-------------------------------\n"); break;
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
        
        totalLunch = lunch * 25000;
        totalDinner = dinner * 30000;
        
        totalMakan = totalBreakfast + totalLunch + totalDinner;
        
        System.out.println("------------------------------");
        System.out.println("Total biaya makan : Rp." + totalMakan);
        System.out.println("------------------------------\n");
    }

    @Override
    public void PesanFasilitas() {
        System.out.println("-----------------------------------");
        System.out.print("Kolam Renang : ");
        int kolam = masuk.nextInt();
        System.out.print("Sauna        : ");
        int sauna = masuk.nextInt();
        System.out.print("Spa          : ");
        int spa = masuk.nextInt();
        
        totalFasilitas = (kolam * 25000) + (sauna * 150000) + (spa * 150000);
        
        System.out.println("-----------------------------------");
        System.out.println("Total biaya fasilitas : Rp." + totalFasilitas);
        System.out.println("-----------------------------------\n");
    }

    @Override
    public void TotalPesanan() {
        System.out.println("-----------------------------------");
        System.out.println("Total biaya kamar     : Rp." + totalKamar);
        System.out.println("Total biaya makan     : Rp." + totalMakan);
        System.out.println("Total biaya fasilitas : Rp." + totalFasilitas);
        System.out.println("-----------------------------------");
        System.out.println("Total biaya pesanan   : Rp." + (totalKamar + totalMakan + totalFasilitas));
        System.out.println("-----------------------------------\n");
    }
}
