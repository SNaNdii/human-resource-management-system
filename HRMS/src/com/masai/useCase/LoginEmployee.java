package com.masai.useCase;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.application.EmployeeLink;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImp;
import com.masai.exception.EmployeeException;

public class LoginEmployee {
//----------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	public static void loginEmployee() throws EmployeeException, SQLException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username=sc.next();
		System.out.println("Enter password : ");
		String pass = sc.next();
		
		EmployeeDao dao=new EmployeeDaoImp();
		Employee emp = dao.loginEmployee(username, pass);
		System.out.println("Welcome " + emp.getEmplName());
		EmployeeLink.linkingEmployeeMethod();
		
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
}
