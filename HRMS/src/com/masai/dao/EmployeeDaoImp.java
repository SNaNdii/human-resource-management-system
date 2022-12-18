package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;
import com.utility.DbUtil;

public class EmployeeDaoImp implements EmployeeDao {

	//---------------------------------LOGIN   EMPLOYEE----------------------------------------------------	
	@Override
	public Employee loginEmployee(String Username, String password) throws EmployeeException, SQLException {
		
		Employee employee=null;
		try(Connection conn= DbUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from Employee where EmplUserName=? AND EmplPassword=?");
			ps.setString(1, Username);
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int eid= rs.getInt("Eid");
				String EmplName= rs.getString("EmplName");
				String EmplUserNam =rs.getString("EmplUserName");
				String pass=rs.getString("EmplPassword");
				int edid = rs.getInt("Edid");
				
				employee= new Employee(eid, EmplName, EmplUserNam, pass, edid);
			}
			else 
				throw new EmployeeException("Invalid EmplUserName or EmplPassword...");
		
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return employee;
		
	}
	
	
//---------------------------------REGISTER   EMPLOYEE----------------------------------------------------	
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


	//---------------------------------VIEW   EMPLOYEE   PROFILE----------------------------------------------------	
	@Override
	public Employee getEmployeeById(int Eid) throws EmployeeException, SQLException {
		Employee employee= null;
		Connection conn= DbUtil.provideConnection();
		PreparedStatement ps= conn.prepareStatement("select * from employee where Eid=?");
		ps.setInt(1, Eid);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			int eid= rs.getInt("Eid");
			String EmplName= rs.getString("EmplName");
			String EmplUserName=rs.getString("EmplUserName");
			String pass=rs.getString("EmplPassword");
			int edid = rs.getInt("Edid");
			
			employee= new Employee(eid, EmplName, EmplUserName, pass, edid);
		}
		else 
			throw new EmployeeException("Employee Does not exist with Eid "+Eid);
		
		
		return employee;
	}

	//---------------------------------UPDATE   EMPLOYEE   PROFILE----------------------------------------------------	
	@Override
	public String updateEmployee(String username,String password, int Eid) {
		String message="Employee Not found !...";
		
		try(Connection conn= DbUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update Employee set EmplUserName=?, EmplPassword=? where Eid=?");
		
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setInt(3, Eid);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Employee update";
			}
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

//---------------------------------CHANGE   PASSWORD---------------------------------------------------	
	@Override
	public String changePassword(int Eid, String Password) {
		String message="Oops!... Your Password Cannot Be Change";
		
		Employee employee =new Employee();
			
			try(Connection conn= DbUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update employee set EmplPassword=? where Eid=?");
			    ps.setString(1, Password);
				ps.setInt(2,Eid);
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Password update";
				}
				
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
		}

}
