package com.masai.dao;

import java.sql.SQLException;
import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDao {
	
		public Employee loginEmployee(String Username , String password) throws EmployeeException,SQLException;
		public String registerEmployee(Employee employee);
		public Employee getEmployeeById(int Eid) throws EmployeeException, SQLException;
		public String updateEmployee( String username,String password, int Eid);
		public String changePassword(int Eid, String Password);
}
