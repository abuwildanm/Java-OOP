package Inheritance;

public class Manager1 extends Employee {
    private double bonus;
    
    public Manager1(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
