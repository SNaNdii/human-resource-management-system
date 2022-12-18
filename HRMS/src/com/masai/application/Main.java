package com.masai.application;

import java.sql.SQLException;

import java.util.Scanner;

public class Main {
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";

	
	public static void main(String[] args) throws SQLException{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(ANSI_YELLOW  +  "             Welcome To Human Resource Management            "  + ANSI_RESET);
		System.out.println(ANSI_YELLOW  +  "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀"  + ANSI_RESET);
		System.out.println();
		System.out.println(ANSI_YELLOW  +  "-------Please Choose Options--------"  + ANSI_RESET);
		System.out.println(ANSI_RED  + "************************************************"  + ANSI_RESET);
		
		System.out.println("Press 1 --->  for Login As Admin");
		System.out.println();
		System.out.println("Press 2 ---> for login As Employee");
		System.out.println();
		System.out.println("Press 3 ---> for Exit");
		
		System.out.println();
		System.out.println();
		
		int choice =sc.nextInt();
		
		switch (choice) {
		
		case 1: {
				System.out.println("Enter Admin Username : ");
				String username=sc.next();
				
				System.out.println("Enter Admin Password : ");
				String pass = sc.next();
				
				if(username.equals("admin") && pass.equals("123")) {
					AdminLink.linkingAdmin();
				}
					else  {
					System.out.println("Wrong Username And PassWord");
					}
				break;
			}
	//		case 2:{
	//			loginEmployee.loginEmployee();
	//			break;
				
	//		}
			case 3:{
				System.out.println("   Application  Closed");
				System.out.println("     Thank  You");
				System.out.println("-------------------------");
				break;
			}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
