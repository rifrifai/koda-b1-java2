package com.koda;

public abstract class Salary {
	private int _currentSalary;

	public Salary(int currentSalary){
		_currentSalary = currentSalary;
	}

	public int getSalary() {
		return _currentSalary;
	}

	public abstract void salaryIncrease(int salary);
}
