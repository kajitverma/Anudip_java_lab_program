/*
 * Calculate Student attendence
 * @author : Ajit kumar verma
 * @Date   : 26 Oct 2022
 */

// create package
package com.question2.Attendence;
// importing Scanner  packege
import java.util.Scanner;

// creating class

public class Attendence 
{
	// declaring object of scanner class
	static Scanner sc = new Scanner(System.in);
	//declaring variables
	static float total, attendence, percentage;
	//method of input 
	public static void input()
	{
		//taking input
		System.out.println("Enter the total number of classes :");
		total = sc.nextFloat();
		System.out.println("Enter the total number of attended the class :");
		attendence = sc.nextFloat();
		
		//calling calculate method
		calculate(attendence,total);
		
	}
	//calculating attendence method
	public static void calculate(float attendenc, float total)
	{
		float percentage = (attendence/total)*100;
		//calling print method
		print(percentage);
	}
	//print method
	public static void print(float percentage)
	{
		//if else start
			if(percentage>=75)
			{
				System.out.println("student is allowes to sit in the examination  :");
			}
			else
			{
				System.out.println("student not allowes to sit i the examination  :");
			}
	}
}
