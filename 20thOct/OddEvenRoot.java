/*
Program :To print perform arthmatic operation using switch case
		  1.Square
		  2.cube
		  3. even or odd
@author: Ajit kumar
@date: 20thOct
*/
//import Scanner class

import java.util.*;
//declaring a class

class OddEvenRoot
{
	// main mathod to square a number
   static void Square(float n1)
   {
	   float result= n1*n1;
	   System.out.println("the result is   :" +result);
   }// end of method
	   
	   // method to cube 
	    public static void cube(float n1)
   {
	   float result= n1*n1*n1;
	   System.out.println("the result is   :"+result   );
   }// end of method
   
    public static void odd(float n1)
   {
	   float result=((n1%2)==0);
	   System.out.println("the result is   :"+result );
   }// end of method
    
		   
		   // main method
		public static void main(String args[])
		{
			// declaringthe object
			Scanner sc = new Scanner(System.in);
			
			// declaring variables
			float num1;
			int choice;
			System.out.println("Enter the  number  :");
			num1= sc.nextFloat();
			 
		   
		   System.out.println("Enter the operation  :");

		   // menu 
		   System.out.println("1. Squre ");
		   System.out.println("2. Cube ");
		   System.out.println("3. Cheak Even or Odd");
		   System.out.println("4. Exit ");
		   System.out.println("Enter the choice :");
		   choice= sc.nextInt();
		   
		   //Switch case
		   switch(choice)
		   {
			   case 1:square(num1*num1);
					break;
			   case 2:cube(num1*num1*num1);
					break;
			   case 3:odd((num1%2)==0);
					break;
			   case 4:System.exit(0);
					break;
			   
			   default:System.out.println("wring input");
			   
		   }
		   
		   // End of condition block
	   }
	   // End of main mathod
   }
//End of class