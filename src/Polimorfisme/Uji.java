package Polimorfisme;

public class Uji {

    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("Daniel", "135", 10, 800.00); 
        Employee hourlyEmployee = new HourlyEmployee("Karina", "234", 20, 16.75, 40); 
        Employee commissionEmployee = new CommissionEmployee("Keanu", "145", 30, 10000, .06); 
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 40, 5000, .04, 300); 

        System.out.println("Employees diproses secara polimorfisme:\n"); 
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings()); 
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings()); 
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings()); 
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings()); 
        
        Employee[] employees = new Employee[4]; 
        employees[0] = salariedEmployee; 
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee; 
        employees[3] = basePlusCommissionEmployee; 
        System.out.println("Employees diproses secara polimorfisme:\n"); 
        for (Employee currentEmployee : employees) { 
            System.out.println(currentEmployee); 
            if (currentEmployee instanceof BasePlusCommissionEmployee) { 
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee; 
                employee.setBaseSalary(1.10 * employee.getBaseSalary()); 
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary()); 
            } 
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings()); 
        } 
        for (int j = 0; j < employees.length; j++) { 
             System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName()); 
        }
    }   
}
