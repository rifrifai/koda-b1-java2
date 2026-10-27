package com.koda;

public class ContractEmployee extends Employee {
    
    public ContractEmployee(String _employeeID, String _name, String _position, String _department, int _salary) {
        super(_employeeID, _name, _position, _department, _salary);
    }

    @Override
    public void salaryIncrease(int salary) {
        try {
            if(salary <= 0) {
                throw new IllegalArgumentException("Kenaikan Gaji harus lebih dari 0!");
            }
            if(salary > 500000) {
                throw new IllegalArgumentException("Kenaikan gaji maksimal Rp500000");
            }

            System.out.println("Salary Increase : Rp. " + salary);
            addSalary(salary);
        } catch (IllegalArgumentException e) {
            System.out.println("Salary Increase : Rp. " + salary);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
