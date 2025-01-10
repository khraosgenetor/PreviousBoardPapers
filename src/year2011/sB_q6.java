package year2011;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 21:18 and the day is: Fri

/*
    Write a program to input a number and print whether the number is a special number or not.

    (A number is said to be a special number, if the sum of the factorial of the digits of the
     number is same as the original number).

    Example:
    145 is a special number, because 1! + 4! + 5! = 1 + 24 + 120 = 145.

    (Where ! stands for factorial of the number and the factorial value of a number is the
    product of all integers from 1 to that number, example 5! = 1 * 2 * 3 * 4 * 5 = 120)
 */

public class sB_q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a special number.");
        } else {
            System.out.println(originalNum + " is not a special number.");
        }

        in.close();
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}