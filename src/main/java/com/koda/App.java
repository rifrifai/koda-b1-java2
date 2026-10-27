package com.koda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Salary gaji1 = new Salary(5000000);
        // Salary gaji2 = new Salary(7000000);
        Employee permanentEmp = new PermantentEmployee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);
        Employee contractEmp = new ContractEmployee("EMP002", "Rio Dijenoro", "Frontend Developer", "IT", 5000000);
        permanentEmp.ShowInfo();
        permanentEmp.salaryIncrease(1000000);
        contractEmp.ShowInfo();
        contractEmp.salaryIncrease(500000);
    }
}
