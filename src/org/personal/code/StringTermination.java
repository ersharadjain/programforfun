/*
 * You have a stream of numbers of unknown length. When you hit a zero, the stream is terminated. 
 * Return the largest even number and the largest odd number.
 */

package org.personal.code;

import java.util.Scanner;
public class StringTermination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaninput = new Scanner(System.in);
		String input= null;
		while(true)
		{
			input = scaninput.nextLine();
			if(input.equalsIgnoreCase("0"))
				System.exit(0);
		}
	}
}
