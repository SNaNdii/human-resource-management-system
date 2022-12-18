package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImp;

public class ChangePassword {
	
	public static void main(int id) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter New Password : ");
		String pass= sc.next();
		
		EmployeeDao dao=new EmployeeDaoImp();
		
		String rs = dao.changePassword(id, pass);
		
		System.out.println(rs);
		
	}

}
