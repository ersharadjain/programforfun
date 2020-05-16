package org.personal.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	/**
	 * 
	Take string as an input from the user.After taking. consider A ,a ,e,E,i,I,o,O,u,U, -- if these letters appear in the string..
	then replace them with A^ ,a^,e^,E^,i^,I^,o^,O^,u^,U^. 
	leave the first three eligible letters from the starting of the string.---
	example --- greateribblizing.
	converts to greateri^bbli^zi^ng.
	 * @Epic Ques #8
	 */
public class ReplaceVowels {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char vowels[]= {'A','a','E','e','I','i','O','o','U','u'};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Line to be parsed:");
		String Input=br.readLine();
		int count=0;
		StringBuffer newInput= new StringBuffer();
		char []inputArray= Input.toCharArray();
		for(int i=0;i<inputArray.length;i++)
		{
			newInput.append(inputArray[i]);	
			for(int j=0; j<vowels.length;j++)
			{
				if(inputArray[i]==vowels[j])
				{
					count++;
					if(count>3)
					{
						newInput.append("^");
					}
				}	
			}
						
		}
		System.out.println(newInput.toString());	
	}
}
