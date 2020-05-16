package org.personal.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*0,1
	2 - ABC	3- DEF
	4- GHI	5-JKL
	6-MNO	7- PQR
	8- STU	9- VWXYZ
	Each number represents the set of variables and When we input a number . 
	it should be replaced by all possible string values corresponding. eg : if we enter 27190000.
	It should output.
	APV	APW
	APX	APY
	APZ	
	/**
  	@Epic Ques #10
 	*/
public class StringCombination {
	static List<String> combinations = new ArrayList<String>();
	static Map<String, List<String>> mappings = new HashMap<String, List<String>>();
	static String process = "27190000";
	
	    
	    static void kick(int index, String input, String output){
		if(input.length() <= index){
			System.out.println(output);
			return;
		}
		List<String> combination = mappings.get(String.valueOf(input.charAt(index)));
		for (int i = 0; i < combination.size(); i++) {
			String initial = combination.get(i);
			output += initial;
			kick(index+1, input, output);
			output = output.substring(0, output.length()-1);
		}
		
	}

	static void init(){
		
		combinations = new ArrayList<String>();
		combinations.add("A");
		combinations.add("B");
		combinations.add("C");
		mappings.put("2", combinations);
		combinations = new ArrayList<String>();
		combinations.add("D");
		combinations.add("E");
		combinations.add("F");
		mappings.put("3", combinations);
		combinations = new ArrayList<String>();
		combinations.add("G");
		combinations.add("H");
		combinations.add("I");
		mappings.put("4", combinations);
		combinations = new ArrayList<String>();
		combinations.add("J");
		combinations.add("K");
		combinations.add("L");
		mappings.put("5", combinations);
		combinations = new ArrayList<String>();
		combinations.add("M");
		combinations.add("N");
		combinations.add("O");
		mappings.put("6", combinations);
		combinations = new ArrayList<String>();
		combinations.add("P");
		combinations.add("Q");
		combinations.add("R");
		mappings.put("7", combinations);
		combinations = new ArrayList<String>();
		combinations.add("S");
		combinations.add("T");
		combinations.add("U");
		mappings.put("8", combinations);
		combinations = new ArrayList<String>();
		combinations.add("V");
		combinations.add("W");
		combinations.add("X");
		combinations.add("Y");
		combinations.add("Z");
		mappings.put("9", combinations);
	}
	public static void main(String[] args) {
		init();
		process = process.replaceAll("1","");
		process = process.replaceAll("0","");
		kick(0, process, "");
	}

}
