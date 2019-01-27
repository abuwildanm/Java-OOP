package Encapsulation;

public class Nasabah {
    private String nama;
    private int PIN, saldo;
    
    public Nasabah() {
        this.nama = "";
        this.PIN = 0;
        this.saldo = 0;
    }

    public Nasabah(String nama, int PIN, int saldo) {
        this.nama = nama;
        this.PIN = PIN;
        this.saldo = saldo;
    }
    
    public int Tarik(int nominal) {
        saldo -= nominal;
        
        return saldo;
    }
    
    public int Transfer(int nominal) {
        saldo -= nominal;
        
        return saldo;
    }
    
    public int Setor(int nominal) {
        saldo += nominal;
        
        return saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
