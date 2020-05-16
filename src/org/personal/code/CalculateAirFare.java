package org.personal.code;

import java.util.Scanner;

/**
	 * In a Airline company , there are two categories one way and two way.
	They want to calculate the air fare. where for 1 way the tax1 is 8% of the total fare and tax2 is 2.5% of the total fare and 
	tax3 is 4.0 % of the total fare. 
	whereas for 2 way the tax1 is 7% of the total fare and tax2 is 2% of the total fare whereas tax3 is 3.5% of the total fare.
	Calculate the estimated total air fare based on the type of input from the user.
	 */
public class CalculateAirFare {

	private static String flightType;
	private static float totalFare;
	private static float number;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Please enter the flight Type");
		flightType = scanInput.nextLine();
		System.out.println("Please enter the Total Fare");
		totalFare = Integer.parseInt(scanInput.nextLine());
		System.out.println("Please enter the no of passengers travelling");
		number = Integer.parseInt(scanInput.nextLine());
		calculateFare();
	}
	
	public static void calculateFare()
	{
		if(flightType.equals("2Way"))
		{
			 float tax1 =8*totalFare/100;
			 float tax2 = (float) (((2.5)*totalFare)/100);
			 float tax3 = (float)(4.0*totalFare)/100;
			 totalFare = (tax1+tax2+tax3+totalFare)*number;	 
			 System.out.println(totalFare);
		}
		if(flightType.equals("1Way"))
		{
			 float tax1 =7*totalFare/100;
			 float tax2 = (float) (((2)*totalFare)/100);
			 float tax3 = (float)(3.5*totalFare)/100;
			 totalFare = (tax1+tax2+tax3+totalFare)*number;
			 System.out.println(totalFare);
		}
	}

}
