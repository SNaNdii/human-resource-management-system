package com.masai.useCase;

import java.util.Scanner;
import com.masai.bean.Department;
import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImp;


public class UpdateDepartmentUsecase {

		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Department Name : ");
				String dname=sc.next();
				
				System.out.println("Enter Department DId : ");
				int did=sc.nextInt();
				
				DepartmentDao dao=new DepartmentDaoImp();
				
				Department department = new Department();
				
				department.setDeptName(dname);
				department.setDeptNo(did);
				
				String result = dao.updateDepartment(department);
				
				System.out.println(result);
			}
	
}
