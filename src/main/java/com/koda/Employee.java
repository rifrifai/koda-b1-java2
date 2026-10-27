package com.koda;

public abstract class Employee {
    private String _employeeID;
    private String _name;
    private String _position;
    private String _department;
    private int _salary;

    public Employee(String employeeID, String name, String position, String department, int salary) {
        _employeeID = employeeID;
        _name = name;
        _position = position;
        _department = department;
        _salary = salary;
    }

    protected abstract void salaryIncrease(int salary);

    protected void addSalary(int amount) {
        _salary += amount;
        System.out.println("Current Salary  : Rp. " + _salary);
    }

    public void ShowInfo() {
        System.out.println("=======================");
        System.out.println("     KODA ENTERPRISE    ");
        System.out.println("=======================");
        System.out.println("Employee ID : " + _employeeID);
        System.out.println("Name        : " + _name);
        System.out.println("Position    : " + _position);
        System.out.println("Department  : " + _department);
        System.out.println("Salary      : Rp. " + _salary);

        // _salary.salaryIncrease(150000);
    }
}
