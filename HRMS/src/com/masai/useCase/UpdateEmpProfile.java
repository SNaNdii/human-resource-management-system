package com.masai.useCase;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImp;

public class UpdateEmpProfile {
	
	public static void main(int eid) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New Username  : ");
		String EmplUserName=sc.next();
		System.out.println("Enter New Password  : ");
		String pass=sc.next();
		
		EmployeeDao dao=new EmployeeDaoImp();
		
		
		String result = dao.updateEmployee(EmplUserName,pass, eid);
		System.out.println(result);
		
//		DepartmentDao dao=new DepartmentDaoImp();
//		Department department = new Department();
//		department.setDeptName(dname);
//		department.setDeptNo(did);
//		String result = dao.updateDepartment(department);
//		System.out.println(result);
		
	}

}
