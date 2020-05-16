package org.personal.code;


public class TruncateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Sharadjain";
		System.out.println(Truncate(s,""));
		//reverse(s);
	}
	
	public static String Truncate(String input, String output)
	{
		
		for(int i =0;i<=input.length(); i=i+5)
		{
			output = output +input.substring(0,5);
			input =input.substring(5,input.length());
			output+=" ";
		}
		return output;
	}

}
