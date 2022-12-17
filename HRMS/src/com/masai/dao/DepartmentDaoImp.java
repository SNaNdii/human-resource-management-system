package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Department;
import com.utility.DbUtil;

public class DepartmentDaoImp implements DepartmentDao {

	@Override
	public String registerDepartment(Department department) {
		String message = "Not inserted data...";
		
		try(Connection conn= DbUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Department(DeptName, DeptNo) value(?,?)");
			ps.setString(1, department.getDeptName());
			ps.setInt(2, department.getDeptNo() );
			int X =  ps.executeUpdate();
			if(X>0)
				message="Department Added  Sucessfully !";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}

}
