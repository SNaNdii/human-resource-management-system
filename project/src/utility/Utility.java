package utility;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class Utility {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/db1";
		
		try {
			Collection conn= DriverManager.getConnection(url, "root", "Nandi@278961");
			if(conn != null) {
				System.out.println("connected...");
			}
			else {
				System.out.println("not connected...");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
}

}
