package Encapsulation;

import java.util.Scanner;

public class Aplikasi {
    static Scanner masuk = new Scanner (System.in);
    static int k = 0, i = 0; 
    static boolean status = false; 
    static byte pilihan = 0;

    public static void main(String[] args) {
        Rekening rek[] = new Rekening[100];
        rek[0] = new Rekening("001123456789012", "Abu Wildan Mucholladin", 20000000, 123456);
        rek[1] = new Rekening("192234567890123", "Afghan Syahreza", 15000000, 234567);
        rek[2] = new Rekening("283345678901234", "Isyana Sarasvati", 10000000, 345678);
        
        tampilLogin(rek);
        
        do {
        System.out.println("============= Menu Utama =============");
        System.out.println("1. Cek rekening \t 4. Transfer");
        System.out.println("2. Cek saldo \t\t 5. Logout");
        System.out.println("3. Tarik Tunai \t\t 0. Berhenti");
        System.out.println("======================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : cekRekening(rek, k); break;   
            case 2 : cekSaldo(rek, k); break;
            case 3 : tarik(rek, k); break;
            case 4 : transfer(rek, k, i); break;
            case 5 : status = false; tampilLogin(rek); break;
            case 0 : System.out.println("PROGRAM DIHENTIKAN !\n"); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    }
    
    public static void tampilLogin(Rekening rek[]) {
        while (status == false) {
            System.out.print("Masukkan nomor rekening anda : ");
            String nomor = masuk.next();
            System.out.print("Masukkan PIN anda            : ");
            int pin = masuk.nextInt();
            System.out.println("");

            for (k = 0; k < rek.length; k++) {
                if (nomor.equals(rek[k].getNomor()) && pin == rek[k].getPin()){ 
                    status = true; break; }
                else if (!nomor.equals(rek[k].getNomor()) && pin == rek[k].getPin()) { 
                    System.out.println("Nomor rekening anda salah !\n"); break; }
                else if (nomor.equals(rek[k].getNomor()) && pin != rek[k].getPin()) { 
                    System.out.println("PIN anda salah !\n"); break; }
            }
        }
    }
    
    public static void cekRekening(Rekening rek[], int k) {
        System.out.println("Nama           : " + rek[k].getNama());
        System.out.println("No. Rekening   : " + rek[k].getNomor());
        System.out.println("Jenis Rekening : " + rek[k].getJenis());
        System.out.println("");
    }
    
    public static void cekSaldo(Rekening rek[], int k) {
        System.out.println("Sisa Saldo anda : Rp. " + rek[k].getSaldo());
        System.out.println("");
    }
    
    public static void tarik(Rekening rek[], int k) {
        System.out.print("Masukkan nominal uang : Rp. ");
        int nominal = masuk.nextInt();
        System.out.println("");
                
        if (nominal > rek[k].getSaldo()) 
            System.out.println("Maaf saldo anda tidak cukup !\n");        
        else if (nominal > rek[k].LimitTarik()) 
            System.out.println("Nominal uang melebihi limit penarikan !\n");
        else { 
            rek[k].Tarik(nominal);
            if (rek[k].getSaldo() >= 10000) 
                System.out.println("Penarikan uang BERHASIL !\n");
            else { 
                System.out.println("Transaksi GAGAL ! Saldo yang tersisa harus >= 10000\n"); 
                rek[k].Tambah(nominal); }
        }
    }
    
    public static void transfer(Rekening rek[], int k, int i) {
        System.out.print("Masukkan no. rekening tujuan anda : ");
        String nomor = masuk.next();
        System.out.print("Masukkan nominal uang             : Rp. ");
        int nominal = masuk.nextInt();
        System.out.println("");
                
        for (i = 0; i < rek.length; i++) 
            if (nomor.equals(rek[i].getNomor())) break;

        if (nominal > rek[k].getSaldo()) 
            System.out.println("Maaf saldo anda tidak cukup !\n");        
        else { 
            rek[k].Transfer(nominal);
            rek[k].BiayaTransfer();
            
            if (rek[k].getSaldo() >= 10000) { 
                rek[i].Tambah(nominal);
                System.out.println("Transfer uang BERHASIL !\n"); }
            
            else {
                System.out.println("Transaksi GAGAL ! Saldo yang tersisa harus >= 10000\n"); 
                rek[k].Tambah(nominal);
                rek[k].KembalianBiayaTransfer(); }
        }
    }   
}
