package org.personal.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Epic Ques #5
 */
public class FibonacciSeries {
	
	static int Fibonacci(int n)
	{
		if (n <= 2)
		     return 1;
		else
		     return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the input number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().toString());
		 for (int i = 1; i <=n ; i++)
		 {
		     int f =Fibonacci(i);
		     System.out.println("fib(" + i + ") = " + f);
		 }
	}
}
