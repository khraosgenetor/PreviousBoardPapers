package year2011;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 21:21 and the day is: Fri

/*
    Design a class to overload a function compare( ) as follows:

    void compare(int, int) — to compare two integers values and print the greater of the two integers.

    void compare(char, char) — to compare the numeric value of two characters and print with the higher
    numeric value.

    void compare(String, String) — to compare the length of the two strings and print the longer of the two.
 */

public class sB_q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        compare(10, 20);
        compare('a', 'b');
        compare("hello", "world");

        in.close();
    }

    static void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }

    static void compare(char a, char b) {
        if (a > b) {
            System.out.println(a + " has the higher numeric value");
        } else {
            System.out.println(b + " has the higher numeric value");
        }
    }

    static void compare(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println(a + " is longer");
        } else {
            System.out.println(b + " is longer");
        }
    }
}

