package org.personal.code;

import java.util.ArrayList;

/*
 * Write, efficient code for extracting unique elements from a sorted list of array. 
 * e.g. (1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9) -> (1, 3, 5, 9).
 */
public class UniqueElements {
	private static int[] arr = {1,2,3,4,4,5,5,5,6,6,7,7,8,8,8,9,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> sortList = sortList();
		System.out.println(sortList);
	}
	
	public static ArrayList<Integer> sortList()
	{
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		sortList.add(arr[0]);
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
				sortList.add(arr[i]);
		}
		return sortList;
	}
}
