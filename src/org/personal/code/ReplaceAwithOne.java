package org.personal.code;

import java.util.Scanner;
import java.util.StringTokenizer;
public class ReplaceAwithOne {

	/**For a given string replace all instances of ‘a’ with ‘one’. 
	 * Note that ‘a’ shd be replaced only when it is a single character n not as part of another word.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Input = new Scanner(System.in);	
	String Line =Input.nextLine();
	StringTokenizer lineTokens = new StringTokenizer(Line," ");
	StringBuffer newLine = new StringBuffer();
	while(lineTokens.hasMoreTokens())
	{
		String checkToken =lineTokens.nextToken().toString();
		if(checkToken.length()==1&&checkToken.equalsIgnoreCase("a"))
		{
			newLine.append("one ");
		}
		else
		{
			newLine.append(checkToken+" ");
		}
	}
	System.out.println(newLine.toString());
	}

}
