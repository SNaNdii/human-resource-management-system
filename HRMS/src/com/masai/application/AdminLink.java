package com.masai.application;

import java.sql.SQLException;
import java.util.Scanner;
import com.masai.useCase.AddDepartmentUsecase;

public class AdminLink {
	
	static boolean	ordering=true;
	
	public  static void linkingAdmin() throws SQLException {
		
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Hello Welcome Admin :-> Nandita Singh");
			System.out.println();
			System.out.println();
			
			System.out.println("Press 1. For Adding New Departments");
			System.out.println();
			System.out.println("Press 2. view all Department ");
			System.out.println();
			System.out.println("Press 3. Update The Department ");
			System.out.println();
			System.out.println("Press 4. For Adding New Employees ");
			System.out.println();
			System.out.println("Press 5. Transfer Employee To Other Department");
			System.out.println();
			System.out.println("Press 6. Accept leaves Of Employess");
			System.out.println();
			System.out.println("Press 7. Reject Leaves Of Employees");
			System.out.println();
			System.out.println("Press 8. For Exit ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println();
				AddDepartmentUsecase.register();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			}while(ordering);
	}
	
}
