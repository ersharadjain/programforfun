package org.personal.code;

import java.util.Scanner;

/*
 * 
	Write a structured Java program program to calculate the parking fare for
	customers who park their cars in a parking lot when the following information is
	given:
	a) A character showing the type of vehicle: C for car, B for bus, T for truck
	B) An integer between 0 and 24 showing the hour the vehicle entered the lot
	c) An integer between 0 and 60 showing the minute the vehicle entered the lot
	d) An integer between 0 and 24 showing the hour the vehicle left the lot
	e) An integer between 0 and 60 showing the minute the vehicle left the lot

	This is a public lot. To encourage people to park for a short period of time, the
	management uses two different rates for each type of vehicle, as shown in the
	following table:

	Vehicle First Rate Second Rate
	CAR RM 0.00/hour first 3 hour RM 1.50/hour after 3 hour
	TRUCK RM 1.00/hour first 2 hour RM 2.30/hour after 2 hour
	BUS RM 2.00/hour for first hour RM 3.70/hour after first hour
 */
public class CalculateFare {

	private static String vehicleType;
	private static int hourIn ;
	private static int minuteIn;
	private static int hourLeft;
	private static int minuteLeft;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Enter the vehicle Type");
		vehicleType = scanInput.nextLine();
		System.out.println("Enter the Hour in");
		hourIn = Integer.parseInt(scanInput.nextLine());
		System.out.println("Enter the Minute in");
		minuteIn = Integer.parseInt(scanInput.nextLine());
		System.out.println("Enter the Hour out");
		hourLeft = Integer.parseInt(scanInput.nextLine());
		System.out.println("Enter the Minute out");
		minuteLeft = Integer.parseInt(scanInput.nextLine());
		calculateHours();
	}
	public static void calculateHours()
	{
		
		
	}

}
