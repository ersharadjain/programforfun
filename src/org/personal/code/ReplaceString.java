package org.personal.code;

/**
 * @Epic Ques #7
 */
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String original ="I am Bluffmaster of a bluffland";
char array[] = original.toCharArray();
StringBuffer converted = new StringBuffer();
for(int i=0; i<array.length;i++)
{
	if(array[i]=='a')
	{
		converted.append("the");
	}
	else
	{
		converted.append(array[i]);
	}
}
System.out.println(converted);
}
}