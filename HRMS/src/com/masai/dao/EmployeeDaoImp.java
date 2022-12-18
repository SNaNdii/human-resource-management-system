package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Employee;
import com.utility.DbUtil;

public class EmployeeDaoImp implements EmployeeDao 

	{

	@Override
	public String registerEmployee(Employee employee) {
		
		String message = "Cannot add, It seems ERROR...";
		Connection conn = DbUtil.provideConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into Employee(EmplName,EmplUsername, EmplPassword, Edid) values(?,?,?,?");
			ps.setString(1, employee.getEmplName());
			ps.setString(2, employee.getEmplUserName());
			ps.setString(3, employee.getEmplPassword());
			ps.setInt(4, employee.getEdid());
			message = "New  Employee Added !";
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
		
	}

}
