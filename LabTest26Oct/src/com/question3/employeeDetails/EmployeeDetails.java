
/*
 * Employe Details
 * @author : Ajit kumar verma
 * @Date   : 26 Oct 2022
 */
// create packege
package com.question3.employeeDetails;
//import Scanner 
import java.util.scanner;

public class EmployeeDetails 
{
	//creating scanner object
	Scanner sc = new Scanner(System.in);
	
	//declaring variables
	static int id,salary;
	static String name, dept;
	//get details method
	public static void GetDetails()
	{
		System.out.println("Enter the ID of Employee");
		id = sc.nextInt();
		System.out.println("Enter the Name of Employee");
		name = sc.next();
		System.out.println("Enter the Department of Employee");
		dept = sc.next();
		System.out.println("Enter the salary of Employee");
		salary= sc.nextInt();
		
	}//end of GetDetails
	//print Details
	public static void PrintDetails()
	{
	System.out.println("----------------------");
	System.out.println("----------------------");
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
	System.out.println("Department: "+dept);
	System.out.println("Salary : "+salary);
	}// end of print Details
}// end of class
