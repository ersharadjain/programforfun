package org.personal.code;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a program which asks user to input numbers and 
 * find the smallest even number and largest odd number from those numbers..stop taking input when the user enters '0'
 */
public class EvenOddNumber {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		System.out.println("Enter inputs....to stop press '0'");
		Scanner scanInput = new Scanner(System.in);
		do{
			input = Integer.parseInt(scanInput.nextLine());
			list.add(input);
		}while(input!=0);
		int[] intArray = new int[list.size()];
		for(int i=0;i<list.size();i++)
			intArray[i]= list.get(i);
		intArray = sort(intArray);
		maxMin(intArray);
	}
	public static void maxMin(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
			if(intArray[i]%2==0)
				{
					System.out.println("minimum even integer ="+intArray[i]);
					break;
				}
		for(int i =intArray.length-1;i>=0;i--)
			if(intArray[i]!=2)
			{
				System.out.println("maximum odd integer ="+intArray[i]);
				break;
			}
	}
	public static int [] sort(int [] intArray)
	{
		for(int j=1;j<intArray.length;j++)
			for(int k =0;k<intArray.length-j;k++)
				if(intArray[k]>intArray[k+1])
					{
						int temp =intArray[k];
						intArray[k]=intArray[k+1];
						intArray[k+1]= temp;
					}
		return intArray;
	}
}