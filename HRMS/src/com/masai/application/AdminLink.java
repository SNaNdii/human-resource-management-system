package com.masai.application;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.colors.ColorsFile;
import com.masai.useCase.AcceptLeave;
import com.masai.useCase.AddDepartmentUsecase;
import com.masai.useCase.AddEmployeeUserCase;
import com.masai.useCase.UpdateDepartmentUsecase;
import com.masai.useCase.ViewAllDepartmentUseCase;

public class AdminLink {
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	static boolean	ordering=true;
	
	public  static void linkingAdmin() throws SQLException {
		Scanner sc=new Scanner(System.in);
//		do {
			System.out.println(ColorsFile.BLACK_BOLD_BRIGHT +   "===================================");
			System.out.println( " ***Welcome  To   My   Admin   Panel***");
			System.out.println( "===================================" + ANSI_RESET);
			System.out.println();
			try {
				System.out.println(ColorsFile.RED_ITALIC  +  "               Please Choose Options               "  + ANSI_RESET);
				Thread.sleep(300);
				System.out.println(ColorsFile.CYAN_BOLD + "Press 1 --->  For Adding New Departments");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 2 --->. view all Department ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 3 ---> Update The Department ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 4 ---> For Adding New Employees ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 5 ---> Transfer Employee To Other Department");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 6 ---> Accept leaves Of Employess");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 7 ---> Reject Leaves Of Employees");
				Thread.sleep(300);
				System.out.println();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			do {
				try {
					System.out.println("Press 8 ---> For Home ");
					Thread.sleep(300);
					System.out.println("Press 9 ---> For Exit " + ANSI_RESET);
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			int choice = sc.nextInt();
			
			//---------------------------------------------Options  To Choose--------------------------------------
			switch (choice) {
					case 1: {
							System.out.println();
							AddDepartmentUsecase.register();
							break;
					}
					case 2: {
							System.out.println();
							ViewAllDepartmentUseCase.main(null);
							break;
					}
					case 3: {
							System.out.println();
							UpdateDepartmentUsecase.main(null);
							break;
					}
					case 4: {
						System.out.println();
						AddEmployeeUserCase.main(null);
						break;
					}
					
					case 6: {
						System.out.println();
						AcceptLeave.main(null);
						break;
					}
					
					case 8: {
						System.out.println();
						System.out.println("   Application  Closed");
						System.out.println("     Home  Page");
						System.out.println("-------------------------");
						Main.main(null);
						ordering=false;
						break;
					}
					case 9: {
						System.out.println();
						System.out.println("   Application  Closed");
						System.out.println("     Exit  to  Admin  Panel");
						System.out.println("-------------------------");
						AdminLink.linkingAdmin();
						ordering=false;
						break;
					}
					default:
							throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			
			}while(ordering);
	}
}
