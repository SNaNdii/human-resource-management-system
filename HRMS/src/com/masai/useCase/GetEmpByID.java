package com.masai.useCase;

import java.sql.SQLException;
import java.util.Scanner;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImp;

public class GetEmpByID {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao= new EmployeeDaoImp();
		Employee employee = new Employee();
		System.out.println(employee);
		
	}
}
