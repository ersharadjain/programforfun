package org.personal.code;


public class PrintStars {

	/*
	 * Write a software to print triangle made of *s. 
	 * Given the height and width of Triangles in terms of number of stars. like to output

*
* *
* * *

given you have to use 3 stars or the height is 3 stars.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String star ="*";
		for(int i=0;i<4;i++)
		{
			for(int j =0;j<=i;j++)
				System.out.print(star);
			System.out.println();
		}
		for(int i=5;i>=0;i--)
		{
			for(int j =0;j<i;j++)
				System.out.print(star);
			System.out.println();
		}
	}

}
