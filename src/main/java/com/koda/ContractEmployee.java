package com.koda;

public class ContractEmployee extends Employee {
    
    public ContractEmployee(String _employeeID, String _name, String _position, String _department, int _salary) {
        super(_employeeID, _name, _position, _department, _salary);
    }

    @Override
    public void salaryIncrease(int salary) {
        if(salary <= 0) {
            System.out.println("Salary Increase = Rp. " + salary);
            System.out.println("Error: Kenaikan Gaji harus lebih dari 0!");
            return;
        } else if (salary >= 500000){
            System.out.println("Salary Increase = Rp. " + salary);
            System.out.println("Error: Kenaikan gaji maksimal Rp500000");
            return;
        } else {
            System.out.println("Salary Increase = Rp. " + salary);
            addSalary(salary);
            return;
        }
    }
}
