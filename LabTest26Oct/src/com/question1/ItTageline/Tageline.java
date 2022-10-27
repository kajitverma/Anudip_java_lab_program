
/*
 * Tagline of it company 
 * @author : Ajit kumar verma
 * @Date   : 26 Oct 2022
 */
package com.question1.ItTageline;
//importing package
import java.util.Scanner;

//creating class
public class Tageline
{
	//main method start
	static void PrintTagline(String ItCompayname)
	{
		//switch case
		switch(ItCompanyName)
		{
		case "INFOSYS'S": System.out.println("The tagline of infosys : Navigat Your next");
		break;
		case "TCS": System.out.println("The tagline of tcs : Building on Belief");
		break;

		case "CAPGEMINI": System.out.println("The tagline of capgmini : Get the future yor want");
		break;

		case "WIPRO": System.out.println("The tagline of wiprois : Spirit of Wipro");
		break;

		case "AMAZON": System.out.println("The tagline of amazon : Earth's most customer centric company");
		break;

		}//end of switch case
	}//end of main method
	
	// main method
	public static void main(String []args)
	{
		//create scanner object
		Scanner sc = new Scanner(System.in);
		//taking ItCompanyName
		System.out.println("Enter the ItCompanyName  : ");
		String ItCompanyName = sc.next().toUpperCase();
		PrintTagline(ItCompanyName);
		
		
	}//end of main
}//end of class
