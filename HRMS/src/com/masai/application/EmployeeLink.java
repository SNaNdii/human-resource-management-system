package com.masai.application;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.useCase.AddEmployeeUserCase;
import com.masai.useCase.GetEmpByID;

public class EmployeeLink {
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	
	static boolean	ordering=true;
	
	public  static void linkingEmployeeMethod() throws SQLException {
			
			Scanner sc = new Scanner(System.in);
			
				System.out.println();
				System.out.println(ANSI_RED + "----Thought  of  the  day----" + ANSI_RESET );
				System.out.println(ANSI_YELLOW + "SUCCESS  IS  NOT  ALWAYS  ABOUOT  GREATNESS,  IT'S  ABOUT  CONSISTENCY");
				System.out.println("*****************************************************************************************************************" + ANSI_RESET);
				System.out.println();
				System.out.println("Press 1 . View Your Profile ");
				System.out.println();
				System.out.println("Press 2 . for Update Profile ");
				System.out.println();
				System.out.println("Press 3 . Change PassWord");
				System.out.println("");
				System.out.println("Press 4 . Apply For Leaves");
				System.out.println();
				do {
				System.out.println("Press 5 . Exit");
				System.out.println();
				
				int choice=sc.nextInt();
				
				
//-----------------------------choice for employee------------------------------------------------------
				switch (choice) {
					case 1: {
						System.out.println();
						GetEmpByID.main(null);
					break;
					}
					
					case 5: {
						System.out.println();
						System.out.println("Have  A  Nice  Day !");
						ordering=false;
						break;
					}
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				
			}while(ordering);
		}
}
