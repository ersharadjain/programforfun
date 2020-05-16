package org.personal.code;

/** In a company , there are three categories.A,B,C.
They want to give an increment.So if category C gets N% as increment. 
category B gets 2N% as increment and category A gets 3N% as increment.
But the increment should be atleast 1% and The total updated salary should not exceed $50,000.
Print the increment and the total updated salary for a particular employee.
Assume all the required variables.
Epic Ques #3
 */

import java.util.Scanner;
public class CompanyIncrement {
	private static String category;
	private static String salary;
	private static String increment;
	
	public static void main(String[] args)
	{
	System.out.println("Select the category of employee");
	Scanner scan = new Scanner(System.in);
	category = scan.nextLine();
	char cat = category.charAt(0);
	System.out.println("Input the base salary of employee");
	salary = scan.nextLine();
	int sal = Integer.parseInt(salary);
	int n =1;
	System.out.println("Input the increment");
	increment = scan.nextLine();
	int incr = Integer.parseInt(increment);

	if ((cat == 'A') && (incr >= n))
	{
	sal = sal + ((sal * incr) / 100);
	if (sal > 50000)
		System.out.println("Total update salary is more than 50,000");
	else
		System.out.println("Total Updated Salary is " + sal);
	}

	if ((cat == 'B') && (incr >= (2 * n)))
	{
	sal = sal + ((sal * incr) / 100);
	if (sal > 50000)
		System.out.println("Total update salary is more than 50,000");
	else
		System.out.println("Total Updated Salary is " + sal);
	}

	if ((cat == 'C') && (incr >= (3 * n)))
	{
	sal = sal + ((sal * incr) / 100);
	if (sal > 50000)
		System.out.println("Total update salary is more than 50,000");
	else
		System.out.println("Total Updated Salary is " + sal);
	}

	}
}
