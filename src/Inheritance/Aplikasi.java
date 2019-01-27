package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplikasi {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        byte pilihan = 0;
        
        Pegawai pegawai1 = new Pegawai("101", "John", 2015, true, 2, 3000000);
        Pegawai pegawai2 = new Pegawai("102", "Thomas", 2010, false, 0, 3000000);
        Pegawai pegawai3 = new Pegawai("103", "Adelle", 2005, true, 5, 3000000);
        Pegawai pegawai[] = {pegawai1, pegawai2, pegawai3};
        ArrayList <Pegawai> pegawaiList = new ArrayList <Pegawai> ();
        for (Pegawai element : pegawai) pegawaiList.add(element);
        
        Manager manager1 = new Manager("201", "Wildan", 2009, false, 0, 4000000);
        Manager manager2 = new Manager("202", "Rezha", 2014, true, 2, 4000000);
        Manager manager[] = {manager1, manager2};
        ArrayList <Manager> managerList = new ArrayList <Manager> ();
        for (Manager element : manager) managerList.add(element);
        
        Sales sales1 = new Sales("301", "Imron", 2012, true, 4, 25000, 100, 50, 2000000);
        Sales sales2 = new Sales("302", "Adit", 2014, true, 1, 10000, 250, 220, 2000000);
        Sales sales[] = {sales1, sales2};
        ArrayList <Sales> salesList = new ArrayList <Sales> ();
        for (Sales element : sales) salesList.add(element);
        
        Freelancer freelancer1 = new Freelancer("401", "Lukman", 2011, false, 0, 10, 2500000);
        Freelancer freelancer2 = new Freelancer("402", "Raka", 2013, false, 0, 12, 2500000);
        Freelancer freelancer[] = {freelancer1, freelancer2};
        ArrayList <Freelancer> freelancerList = new ArrayList <Freelancer> ();
        for (Freelancer element : freelancer) freelancerList.add(element);
        
        do {
        System.out.println("======= Menu Utama =======");
        System.out.println("1. Pegawai  4. Freelancer");
        System.out.println("2. Manager  0. Berhenti");
        System.out.println("3. Sales");
        System.out.println("==========================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : 
                for (int i = 0; i < pegawaiList.size(); i++) {
                    System.out.println("------------- Pegawai " + (i+1) + " -------------");
                    System.out.println("No. Induk Pegawai : " + pegawaiList.get(i).getNoIndukPegawai());
                    System.out.println("Nama              : " + pegawaiList.get(i).getNama());
                    System.out.println("Tahun Masuk       : " + pegawaiList.get(i).getTahunMasuk());
                    System.out.println("Status            : " + pegawaiList.get(i).getKeluarga());
                    System.out.println("Jumlah Anak       : " + pegawaiList.get(i).getJumlahAnak());
                    System.out.println("-------------------------------------");
                    System.out.println("Gaji Pokok : Rp. " + pegawaiList.get(i).getGajiPokok());
                    System.out.println("Bonus      : Rp. " + pegawaiList.get(i).getBonus());
                    System.out.println("Tunjangan  : Rp. " + pegawaiList.get(i).getTunjangan());
                    System.out.println("Total Gaji : Rp. " + pegawaiList.get(i).getTotalGaji());
                    System.out.println("-------------------------------------\n");
                }
            break;
            
            case 2 : 
                for (int i = 0; i < managerList.size(); i++) {
                    System.out.println("-------------- Manager " + (i+1) + " --------------");
                    System.out.println("No. Induk Pegawai : " + managerList.get(i).getNoIndukPegawai());
                    System.out.println("Nama              : " + managerList.get(i).getNama());
                    System.out.println("Tahun Masuk       : " + managerList.get(i).getTahunMasuk());
                    System.out.println("Status            : " + managerList.get(i).getKeluarga());
                    System.out.println("Jumlah Anak       : " + managerList.get(i).getJumlahAnak());
                    System.out.println("---------------------------------------");
                    System.out.println("Gaji Pokok         : Rp. " + managerList.get(i).getGajiPokok());
                    System.out.println("Bonus              : Rp. " + managerList.get(i).getBonus());
                    System.out.println("Tunjangan          : Rp. " + managerList.get(i).getTunjangan());
                    System.out.println("Tunjangan Jabatan  : Rp. " + managerList.get(i).getTunjanganJabatan());
                    System.out.println("Total Gaji         : Rp. " + managerList.get(i).getTotalGaji());
                    System.out.println("---------------------------------------\n");
                }
            break;
            
            case 3 : 
                for (int i = 0; i < salesList.size(); i++) {
                    System.out.println("-------------- Sales " + (i+1) + " --------------");
                    System.out.println("No. Induk Pegawai : " + salesList.get(i).getNoIndukPegawai());
                    System.out.println("Nama              : " + salesList.get(i).getNama());
                    System.out.println("Tahun Masuk       : " + salesList.get(i).getTahunMasuk());
                    System.out.println("Status            : " + salesList.get(i).getKeluarga());
                    System.out.println("Jumlah Anak       : " + salesList.get(i).getJumlahAnak());
                    System.out.println("-------------------------------------");
                    System.out.println("Gaji Pokok     : Rp. " + salesList.get(i).getGajiPokok());
                    System.out.println("Bonus          : Rp. " + salesList.get(i).getBonus());
                    System.out.println("Tunjangan      : Rp. " + salesList.get(i).getTunjangan());
                    System.out.println("Bonus Tambahan : Rp. " + salesList.get(i).getBonusTambahan());
                    System.out.println("Total Gaji     : Rp. " + salesList.get(i).getTotalGaji());
                    System.out.println("-------------------------------------\n");
                }
            break;
            
            case 4 : 
                for (int i = 0; i < salesList.size(); i++) {
                    System.out.println("----------- Freelancer " + (i+1) + " ------------");
                    System.out.println("No. Induk Pegawai : " + freelancerList.get(i).getNoIndukPegawai());
                    System.out.println("Nama              : " + freelancerList.get(i).getNama());
                    System.out.println("Tahun Masuk       : " + freelancerList.get(i).getTahunMasuk());
                    System.out.println("Status            : " + freelancerList.get(i).getKeluarga());
                    System.out.println("Jumlah Anak       : " + freelancerList.get(i).getJumlahAnak());
                    System.out.println("-------------------------------------");
                    System.out.println("Gaji Pokok   : Rp. " + freelancerList.get(i).getGajiPokok());
                    System.out.println("Bonus        : Rp. " + freelancerList.get(i).getBonus());
                    System.out.println("Tunjangan    : Rp. " + freelancerList.get(i).getTunjangan());
                    System.out.println("Bonus Lembur : Rp. " + freelancerList.get(i).getBonusLembur());
                    System.out.println("Total Gaji   : Rp. " + freelancerList.get(i).getTotalGaji());
                    System.out.println("-------------------------------------\n");
                }
            break;
            
            case 0 : System.out.println("PROGRAM DIHENTIKAN !\n"); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    }
}
