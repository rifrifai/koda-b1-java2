package com.koda;

public class PermantentEmployee extends Employee {
    
    public PermantentEmployee(String _employeeID, String _name, String _position, String _department, int _salary){
        super(_employeeID, _name, _position, _department, _salary);
    }



    @Override
    public void salaryIncrease(int salary) {
        if(salary <= 0) {
            System.out.println("Salary Increase = Rp. " + salary);
            System.out.println("Error: Kenaikan Gaji harus lebih dari 0!");
        } else {
            System.out.println("Salary Increase = Rp. " + salary);
            addSalary(salary);
        }
    }
}
