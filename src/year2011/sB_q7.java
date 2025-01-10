package year2011;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 21:19 and the day is: Fri

/*
    Write a program to accept a word and convert it into lower case, if it is in upper case.
    Display the new word by replacing only the vowels with the letter following it.

    Sample Input: computer
    Sample Output: cpmpvtfr
 */

public class sB_q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();

        word = word.toLowerCase();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                result += (char) (ch + 1);
            } else {
                result += ch;
            }
        }

        System.out.println(result);

        in.close();
    }
}

