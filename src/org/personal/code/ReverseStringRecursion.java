package org.personal.code;


public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Sharad";
		ReverseString(s,"");
		//reverse(s);
	}

	public static void reverseString(String s)
	{
		
			for(int i=s.length();i>1;i--)
		{
			if(s.length()==1)
				break;
			System.out.println(s.substring(i-1));
			s= s.substring(0,i-1 );
			System.out.println(s);
			reverseString(s);
		}
		
	}
	public static String ReverseString(String inputToken,String output)
	{
		if(inputToken.length()<=0)
			System.out.println(output);
		else
		{
			output = output + inputToken.substring(inputToken.length()-1);
			inputToken = inputToken.substring(0,inputToken.length()-1);
			ReverseString(inputToken,output);
		}
			return output ;
			
	}
	
	public static void reverse(String s){

		if (s.length() == 1){
		System.out.print(s);
		}
		else{
		reverse (s.substring(1, s.length()));
		System.out.print(s.substring(0,1));
		}
		}
}
