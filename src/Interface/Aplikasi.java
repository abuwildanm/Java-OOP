package Interface;

import java.util.Scanner;

public class Aplikasi {
    static Scanner masuk = new Scanner (System.in);
    static boolean status = false; 
    static byte pilihan = 0;
    static int i = 0;

    public static void main(String[] args) {
        System.out.println("*** Program Koperasi PT. NV. Meneer ***\n");
        
        Employee karyawan[] = new Employee[3];
        karyawan[0] = new Employee(1230, "Wildan", 9000000);
        karyawan[1] = new Employee(1231, "Adit", 6000000);
        karyawan[2] = new Employee(1232, "Imron", 3000000);
        
        tampilLogin(karyawan);
        
        do {
        System.out.println("============ Menu Utama ============");
        System.out.println("1. Cek Profil          4. Logout");
        System.out.println("2. Pembelian Barang    0. Selesai");
        System.out.println("3. Detail Belanja");
        System.out.println("====================================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masuk.nextByte();
        System.out.println("");
        
        switch (pilihan) {
            case 1 : cekProfil(karyawan, i); break;
            case 2 : pembelian(karyawan, i); break;
            case 3 : belanja(karyawan, i); break;
            case 4 : status = false; tampilLogin(karyawan); break;
            case 0 : System.out.println("TERIMA KASIH !"); break;
            default : System.out.println("INPUT SALAH ! Silahkan coba lagi\n"); break;
        }
        } while (pilihan != 0);
    }
    
    public static void tampilLogin(Employee karyawan[]) {
        while (status == false) {
            System.out.println("----- Menu Login -----");
            System.out.print("Nama           : ");
            String nama = masuk.next();
            System.out.print("No. Registrasi : ");
            int reg = masuk.nextInt();
            System.out.println("----------------------");
            System.out.println("");
            
            for (i = 0; i < karyawan.length; i++) {
                if (nama.equals(karyawan[i].getName()) && reg == karyawan[i].getRegistrationNumber()) {
                    status = true; break; }
                else if (!nama.equals(karyawan[i].getName()) && reg == karyawan[i].getRegistrationNumber()) {
                    System.out.println("WARNING ! Nama anda salah\n"); break; }
                else if (nama.equals(karyawan[i].getName()) && reg != karyawan[i].getRegistrationNumber()) {
                    System.out.println("WARNING ! Nomor anda salah\n"); break; }
            }
        }
    }
    
    public static void cekProfil(Employee karyawan[], int i) {
        System.out.println("------------------------------");
        System.out.println("            PROFIL");
        System.out.println("------------------------------");
        System.out.println("Nama Karyawan  : " + karyawan[i].getName());
        System.out.println("No. Registrasi : " + karyawan[i].getRegistrationNumber());
        System.out.println("Gaji           : Rp." + karyawan[i].getSalaryPerMonth());
        System.out.println("------------------------------\n");
    }
    
    public static void pembelian(Employee karyawan[], int i) {
        System.out.print("Jumlah Barang  : ");
        int jumlahBarang = masuk.nextInt();
        System.out.println("");
        
        karyawan[i].invoices = new Invoice[jumlahBarang];
        karyawan[i].getPayableAmount();
    }
    
    public static void belanja(Employee karyawan[], int i) {
        Object detail[][] = new Object[karyawan[i].invoices.length][4];
        
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s", "Produk", "Harga", "Banyak", "Total");
        System.out.println("");
        for (int j = 0; j < detail.length; j++) {
            detail[j][0] = karyawan[i].invoices[j].getProductName();
            detail[j][1] = karyawan[i].invoices[j].getPricePerItem();
            detail[j][2] = karyawan[i].invoices[j].getQuantity();
            detail[j][3] = karyawan[i].invoices[j].getPayableAmount();
                
            System.out.printf("%-10s %-10s %-10s %-10s", detail[j][0], detail[j][1], detail[j][2], detail[j][3]);
            System.out.println("");
        }
        System.out.println("-----------------------------------------\n");
        
        System.out.println("-----------------------------------------");
        System.out.println("Total gaji anda saat ini : Rp." + karyawan[i].getSalaryPerMonth());
        System.out.println("-----------------------------------------\n");
    }
}
