package Polimorfisme;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee {
    private String name, noKTP;
    private int banyakBarang;
    private final int upahBarang = 1000;
    
    
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    
    public Employee(String name, String noKTP, int banyakBarang){
        this.name = name;
        this.noKTP = noKTP;
        this.banyakBarang = banyakBarang;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNoKTP(){
        return noKTP;
    }
    
    public int GajiBarang() {
        return banyakBarang * upahBarang;
    }

//    public String getTanggalLahir() {
//        return tanggalLahir;
//    }
//
//    public void setTanggalLahir(String tanggalLahir) {
//        this.tanggalLahir = tanggalLahir;
//    }
    
//    public int BonusUltah() {
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        
//        if (tanggalLahir.substring(3, 5).equals(sdf.format(date).substring(3, 5))) return 100000;
//        else return 0;
//    }
    
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP : "+getNoKTP());
    }
    
    public abstract double earnings();//pendapatan
}
