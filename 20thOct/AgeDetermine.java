/*
Program :WAP to take 3 input and find oldest and youngest 
@author: Ajit kumar
@date: 20thOct
*/
//import Scanner class

import java.util.Scanner;
//declaring a class

class AgeDetermine
{
	// main mathod
   public static void main(String[] args)
   {
	   //Enter age of three people  user input
	   Scanner in = new Scanner(System.in);
	   float a,b,c;
	   System.out.println("Enter 1st People (Ram)Age:");
	   a = in.nextFloat();
	   System.out.println("Enter 2nd People (Shyam)Age");
	   b = in.nextFloat();
	   System.out.println("Enter 3rd people (Mohan)Age");
	   c = in.nextFloat();
	   
	   
	   {
		   //condition apply for cheak pass & fail
		   if((a>b)&&(a>c))
		       {
				   System.out.println("oldest people is( :Ram)"+a);
			   }
			   else if(b>c)
			   {
				   System.out.println("oldest people is :(Shyam )"+b);
			   }
			   else
			   { 
				   System.out.println("oldest peopleis : (Mohan)");
			   }
	
		   // End of condition block
	   }
	   //condition apply for cheak pass & fail
		   if((a<b)&&(a<c))
		       {
				   System.out.println("Youngest people is :(Ram)"+a);
			   }
			   else if(b<c)
			   {
				   System.out.println("Youngest people is: (Shyam )"+b);
			   }
			   else
			   { 
				   System.out.println("Youngest people is : (Mohan)");
			   }
	   // End of main mathod
   }
}//End of class