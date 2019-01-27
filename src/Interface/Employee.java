package Interface;

import java.util.Scanner;

public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    protected Invoice[] invoices;
    
    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }
    
    @Override
    public int getPayableAmount() {
        Scanner masuk = new Scanner(System.in);
        int potongan = 0;
        String barang[] = new String[invoices.length];
        int harga[] = new int[invoices.length];
        int banyak[] = new int[invoices.length];
        Payable payable[] = new Payable[invoices.length];
        
        for (int i = 0; i < invoices.length; i++) {
            if (i > 0) masuk.nextLine();
            System.out.println("---------- List " + (i+1) + " ----------");
            System.out.print("Nama Produk   : ");
            barang[i] = masuk.nextLine();
            System.out.print("Harga Produk  : ");
            harga[i] = masuk.nextInt();
            System.out.print("Banyak Produk : ");
            banyak[i] = masuk.nextInt();
            System.out.println("----------------------------");
            
            payable[i] = new Invoice(barang[i], harga[i], banyak[i]);
            invoices[i] = (Invoice) payable[i];
        }
        System.out.println("");
        
        for (int i = 0; i < payable.length; i++) { potongan += payable[i].getPayableAmount(); }
        
        return salaryPerMonth -= potongan;
    }

    public Integer getRegistrationNumber() { return registrationNumber; }
    public String getName() { return name; }
    public Integer getSalaryPerMonth() { return salaryPerMonth; }
}
