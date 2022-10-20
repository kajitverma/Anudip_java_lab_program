/*
Program : WAP to creat bill and give 10% discount if bill value is greater then 2000
@ author : Ajit kumar
@ Date : 20thOct

*/
// import packages
import java.util.*;

//declaring a class
class ShoppingBill
{
	
public static void main(String []args)
	{
	//declaring variables
		
		int quntity;
		int cost=540;// cost price of product
		int discount=10;// discount in %
		float bill = quntity * cost;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your quntity of product:");
		quntity= sc.nextInt();

	//condition apply for cheak to take discount
		
	if(quntity>=4)
		
		{
		System.out.println("eligible for 10% discount on our bill");
		}
		float bill = quntity*cost;
		{
			System.out.println("your total billamount is :"+bill);

			System.out.println("Total bill = "+bill);
			// discout amount on bill
			bill =  (bill * discount)/100;
			System.out.println("Congratulation, you are eligible for "+bill+"% discount");
	
		}
	//else ()
		{
			System.out.println("Not eligible for discount Amount :");
		}

	}// end of main
}//end of class