package org.personal.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Given a year print the calendar!!
 */
public class PrintCalendar 
{
	private static Map <Integer,Integer> daysinmonth =new HashMap <Integer,Integer>();
	private static String [] Days_In_Week = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the year for the desired calendar:");
		Scanner scanInput = new Scanner(System.in);
		int year = Integer.parseInt(scanInput.nextLine());
		boolean leapflag ;
		
		if(year%4==0||year%100==0&&year%400!=0)
			leapflag=true;
		else
			leapflag =false;
		init(leapflag);
		PrintYearDates(year);
		
	}
	public static void PrintYearDates(int year)
	{
		for(int month =1;month<=12;month++)
		for(int i =1;i<=daysinmonth.get(month);i++)
			{
				String date =i+"/"+month+"/"+year;
				System.out.println(date+" "+Days_In_Week[CalculateDay(date)]);
			}
	}
	public static int CalculateDay(String date)
	{
		String[] ddmmyyyy = date.split("/");
		int d = Integer.parseInt(ddmmyyyy[0]);
		int m = Integer.parseInt(ddmmyyyy[1]);
		int y = Integer.parseInt(ddmmyyyy[2]);
		
		if(m<3)
		{
			m+=12;
			y-=1;
		}
		int k =y%100;
		int j = y/100;
		
		int day = ((d + (((m+1)*26)/10)+k+(k/4)+(j/4))+(5*j))%7;
		return day;
	}
	public static void init(boolean leapflag)
	{
		daysinmonth.put(1, 31);
		if(leapflag)
			daysinmonth.put(2,29);
		else
			daysinmonth.put(2, 28);
		daysinmonth.put(3, 31);
		daysinmonth.put(4, 30);
		daysinmonth.put(5, 31);
		daysinmonth.put(6, 30);
		daysinmonth.put(7, 31);
		daysinmonth.put(8, 31);
		daysinmonth.put(9, 30);
		daysinmonth.put(10, 31);
		daysinmonth.put(11, 30);
		daysinmonth.put(12, 31);
	}
}
