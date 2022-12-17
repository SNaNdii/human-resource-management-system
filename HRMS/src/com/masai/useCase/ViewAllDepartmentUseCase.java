package com.masai.useCase;

import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Department;
import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImp;
import com.masai.exception.DepartmentException;

public class ViewAllDepartmentUseCase {
		
		public static void main(String[] args) throws SQLException {
				
				DepartmentDao dao = new DepartmentDaoImp();
				try {
					
						List<Department> dep=dao.allDepartment();
						
						dep.forEach(e->{
							System.out.println("Employee name is : "+ e.getDeptName());
							System.out.println("Employe ID is : "+e.getDeptNo());
							
							
							System.out.println("=====================================");
						});
				} catch (DepartmentException e) {
					
					System.out.println(e.getMessage());
				}
			}	
}

