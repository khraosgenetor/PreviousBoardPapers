package year2010;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 20:33 and the day is: Fri

/*
    Write a menu-driven program to accept a number from the user and check whether
    it is a Prime number or an Automorphic number.

    (a) Prime number: (A number is said to be prime, if it is only divisible by 1 and itself)

    Example: 3,5,7,11

    (b) Automorphic number: (Automorphic number is the number which is contained in
    the last digit(s) of its square.)

    Example: 25 is an Automorphic number as its square is 625 and 25 is present as the last two digits.
 */

public class sB_q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("(a) Check if number is Prime, ");
        System.out.println("(b) Check if number is Automorphic.");
        System.out.print("Enter your choice: ");
        char ch = in.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'A':
                System.out.print("Enter a number: ");
                int num = in.nextInt();
                if (isPrime(num)) {
                    System.out.println(num + " is a Prime number.");
                } else {
                    System.out.println(num + " is not a Prime number.");
                }
                break;
            case 'b':
            case 'B':
                System.out.print("Enter a number: ");
                num = in.nextInt();
                if (isAutomorphic(num)) {
                    System.out.println(num + " is an Automorphic number.");
                } else {
                    System.out.println(num + " is not an Automorphic number.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        in.close();
    }

    static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
