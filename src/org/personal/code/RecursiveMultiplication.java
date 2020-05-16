package org.personal.code;


public class RecursiveMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 =22;
		int input2 = 33;
		System.out.println(multiply(input1,input2));
	}
	
	public static int multiply(int input1, int input2)
	{
		int output=0;
		if(input2>0)
		{	
			output = input1+multiply(input1,input2-1);
		}
		return output;
	}
}
