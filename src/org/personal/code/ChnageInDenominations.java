package org.personal.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * Write algorithm to return change in denominations of 10$, 5$, 1$, 25 cents, 10 cents etc..
 * @Epic Ques #2
 */

public class ChnageInDenominations {

	public static void main(String[] args) throws IOException
	{
		int dollardenominations[] ={10,5,1};
		int centdenominations[]= {50,25,10,01};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount to be denominated");
		String amount = br.readLine().toString();
		StringTokenizer dollarcents =new StringTokenizer(amount,".");
		int dollar = Integer.parseInt((dollarcents.nextToken()));
		int cent = Integer.parseInt((dollarcents.nextToken()));
		System.out.println("Dollar: "+ dollar+"Cent: "+cent);
		for(int i=0;i<dollardenominations.length;i++)
		{
			if(dollar>dollardenominations[i])
			{
				int count = dollar/dollardenominations[i];
				dollar = dollar%dollardenominations[i];
				System.out.println("The no of dollar denominations for "+dollardenominations[i]+" is "+ count);
			}
		}
		for(int i=0;i<centdenominations.length;i++)
		{
			if(cent>centdenominations[i])
			{
				int count = cent/centdenominations[i];
				cent = cent%centdenominations[i];
				System.out.println("The no of cent denominations for "+centdenominations[i]+" is "+ count);
			}
		}
		System.out.println("The amount is: "+ amount);
		
	}
}
