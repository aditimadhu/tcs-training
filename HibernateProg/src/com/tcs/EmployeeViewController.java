package com.tcs;

import java.util.List;
import java.util.Scanner;

public class EmployeeViewController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menuOption = 0;
		
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		do {
			System.out.println("Enter the options below:-");
			System.out.println("1: Store 2: Retrieve by id 3: Retrieve all 4: Update salary by id 5: Delete by id 6: Exit");
			menuOption = scan.nextInt();
			switch(menuOption) {
			case 1:
				User e = new User();
				System.out.println("Enter name");
				e.setName(scan.next());
				System.out.println("Enter salary");
				e.setSalary(scan.nextDouble());
				int generatedKey = dao.store(e);
				System.out.println("Generated Key: "+generatedKey);
				break;
			case 2: 
				System.out.println("Enter id to search");
				User employee = dao.fetchEmployee(scan.nextInt());
				if(employee != null) {
					System.out.println("Employee found id: "+employee.getId()+", name: "+employee.getName()+", salary: "+employee.getSalary());
				} else {
					System.err.println("Sorry employee not found");
				}
				break;
			case 3: 
				List<User> employees = dao.fetchEmployees();
				for(User emp : employees) {
					System.out.println("Id = "+emp.getId()+", Name = "+emp.getName()+", Salary = "+emp.getSalary());
				}
				System.out.println("--------------------------------");
				break;
			}
		} while(menuOption != 6);
		System.out.println("Program Exits!");
		scan.close();
	}
}
