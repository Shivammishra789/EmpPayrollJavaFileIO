package com.javaio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	
	List<EmployeePayrollData> employeePayrollDataList;
	
	EmployeePayrollService(){
		employeePayrollDataList = new ArrayList<EmployeePayrollData>();
	};
	
	public void consoleInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee id");
		int id = sc.nextInt();

		System.out.println("Enter employee name");
		String name = sc.next();
		
		System.out.println("Enter employee salary");
		double salary = sc.nextDouble();

		sc.close();

		EmployeePayrollData employeePayroll = new EmployeePayrollData(id,name,salary);

		employeePayrollDataList.add(employeePayroll);
	}

	public void consoleOutput() {
		System.out.println(employeePayrollDataList);
	}
	
	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		// Taking input from console and showing output on console 
		employeePayrollService.consoleInput();
		employeePayrollService.consoleOutput();
	}
}

