package org.personal.code;

import java.util.ArrayList;


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,2,3,4,5,6,7};
		reverseArr(a).toArray();
		//reverse(s);
	}

	public static ArrayList reverseArr(int []a)
	{
		ArrayList ab = new ArrayList<Integer>();
		for(int i=a.length-1;i>0;i--)
		{
			ab.add(a[i]);
			System.out.println(a[i]);
		}
		return ab;
	}

}
