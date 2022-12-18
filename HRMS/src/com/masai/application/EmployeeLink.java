package com.masai.application;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.useCase.AddEmployeeUserCase;

public class EmployeeLink {
	static boolean	ordering=true;
	public  static void linkingEmployeeMethod() throws SQLException {
			
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println();
				System.out.println("----Welcome Employee----");
				
				System.out.println();
				System.out.println("Press 1 . View Your Profile ");
				System.out.println();
				System.out.println("Press 2 . for Update Profile ");
				System.out.println();
				System.out.println("Press 3 . Change PassWord");
				System.out.println("");
				System.out.println("Press 4 . Apply For Leaves");
				System.out.println();
				System.out.println("Press 5 . Exit");
				System.out.println();
				
				int choice=sc.nextInt();
				
				
//-----------------------------choice for employee------------------------------------------------------
				switch (choice) {
					case 1: {
					}
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				
			}while(ordering);
		}
}
