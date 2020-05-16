package org.personal.code;

import java.util.Hashtable;
import java.util.*;
/**
 * @Epic Ques #1 
 */

public class CalculateDays {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Integer> daysinmonth = new Hashtable<Integer, Integer>();
		daysinmonth.put(1, 31);
		daysinmonth.put(2,28);
		daysinmonth.put(3,31);
		daysinmonth.put(4,30);
		daysinmonth.put(5,31);
		daysinmonth.put(6,30);
		daysinmonth.put(7,31);
		daysinmonth.put(8,31);
		daysinmonth.put(9,30);
		daysinmonth.put(10,31);
		daysinmonth.put(11,30);
		daysinmonth.put(12,31);
		System.out.println("Enter current date in mm/dd format");
		Scanner scanInput = new Scanner(System.in);
		String currentDate =scanInput.nextLine();
		try{
		StringTokenizer monthDate =new StringTokenizer(currentDate,"/");
		String Month= monthDate.nextToken();
		String Date =monthDate.nextToken();
		int totalnofdays =0;
		
		for(int i=1;i<Integer.parseInt(Month);i++)
		{
			totalnofdays =totalnofdays + daysinmonth.get(i);
		}
		totalnofdays = totalnofdays + Integer.parseInt(Date);
		System.out.println("Total no of days:"+totalnofdays);
		}
		catch(Exception ex)
		{
		ex.printStackTrace();	
		}
	}

}
