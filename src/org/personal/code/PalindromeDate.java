package org.personal.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Epic Ques #6 
 */
public class PalindromeDate {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the 1st year to which Palindrome date is desired");
		String year1 = br.readLine().toString();
		System.out.println("Please enter the 2nd Year to which Palindrome date is desired");
		String year2 = br.readLine().toString();
		printDates(Integer.parseInt(year1),Integer.parseInt(year2));
	}
	public static void printDates(int start, int end) 
	{
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int year = start; year <= end; year++) 
		{
			String yyyy = Integer.toString(year);
			String mm = Integer.toString(year%10)+Integer.toString((year/10)%10);
			String dd = Integer.toString((year/100)%10)+Integer.toString((year/1000)%10);
			int m = Integer.parseInt(mm);
			int d = Integer.parseInt(dd);
			if (m > 0 && m < 13) 
			{
				if (d > 0 && d <= ((m-1 != 2)? daysInMonth[m-1]: ((year%400!=0)||((year%100==0)&&(year%4!=0)))?28:29)) 
				{
					System.out.println("Palindrome Date:"+mm+dd+yyyy);
				}
			}
		}
	}	
	
}