package org.personal.code;

import java.util.Scanner;
public class Zeller {
    final static String[] DAYS_OF_WEEK = {
            "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday"
        };
  //int day = ((d + (((m + 1) * 26) / 10) + k + (k / 4) + (j / 4)) + (5 * j)) % 7;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the date in dd/mm/yyyy form: ");

        String[] atoms = input.nextLine().split("/");
        int d = Integer.parseInt(atoms[0]);
        int m = Integer.parseInt(atoms[1]);
        int y = Integer.parseInt(atoms[2]);

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        
        int day = ((d + (((m+1)*26)/10)+k+(k/4)+(j/4))+(5*j))%7;
        System.out.println("That date was a " + DAYS_OF_WEEK[day] + ".");
    }
}