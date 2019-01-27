package Encapsulation;

public class Rekening {
    private String nomor, nama, jenis;
    private int saldo, pin;

    public Rekening(String nomor, String nama, int saldo, int pin) {
        this.saldo = saldo;
        this.nomor = nomor;
        this.nama = nama;
        this.pin = pin;
    }

    public String getJenis() {
        if (nomor.substring(0, 3).equals("001")) return "Gold";
        else if (nomor.substring(0, 3).equals("192")) return "Silver";
        else if (nomor.substring(0, 3).equals("283")) return "Bronze";
        else return "";
    }
    
    public int Tarik(int nominal) { saldo -= nominal; return saldo; }
    
    public int LimitTarik() {
        if (getJenis().equals("Gold")) return 10000000;
        if (getJenis().equals("Silver")) return 7000000;
        if (getJenis().equals("Bronze")) return 5000000;
        else return 0;
    }
    
    public int Transfer(int nominal) { saldo -= nominal; return saldo; }
    
    public int BiayaTransfer() {
        if (getJenis().equals("Gold")) return saldo -= 0;
        if (getJenis().equals("Silver")) return saldo -= 6500;
        if (getJenis().equals("Bronze")) return saldo -= 7500;
        else return 0;
    }
    
    public int KembalianBiayaTransfer() {
        if (getJenis().equals("Gold")) return saldo += 0;
        if (getJenis().equals("Silver")) return saldo += 6500;
        if (getJenis().equals("Bronze")) return saldo += 7500;
        else return 0;
    }
    
    public int Tambah(int nominal) { saldo += nominal; return saldo; }
    
    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) { this.saldo = saldo; }
    public String getNomor() { return nomor; }
    public void setNomor(String nomor) { this.nomor = nomor; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getPin() { return pin; }
    public void setPin(int pin) { this.pin = pin; }
}
