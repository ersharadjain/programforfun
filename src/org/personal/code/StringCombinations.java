	
package org.personal.code;

import java.util.*;
/*
 * Given a password in number : Write an algorithm to print all possible combinations of that password.

Hint:
- Try from to go from all possible combinations of lower bound to the valid upper bounds
 */
public class StringCombinations
{
    // A set to hold the generated combination results.
    private static Set<String> combinations = new LinkedHashSet<String>();

    public static void generate(String word)
    {
        combinations.add(word);
        if (word.length() == 1)
        {
            return;
        }
        for (int i = 0; i < word.length(); i++)
        {
            generate(word.substring(0,i) + word.substring(i+1));
        }
    }

    public static void main(String args[])
    {
		// Request and read user input
    	System.out.println("Enter a String:");
		Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
		generate(inputLine);
	    System.out.println("*** Generated " + combinations .size() + " combinations ***");
	    System.out.println(combinations);
    }
}
