package Polimorfisme;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }
    
    public SalariedEmployee(String name, String noKTP, int banyakBarang, double salary) {
        super(name, noKTP, banyakBarang);
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    public double earnings() {
        return getWeeklySalary() + super.GajiBarang();
    }
    
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}
