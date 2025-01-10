package year2011;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 21:23 and the day is: Fri
/*
    Write a menu-driven program to perform the following tasks by using Switch case statement:
    (a) To print the series:
    0, 3, 8, 15, 24, ............ to n terms. (value of 'n' is to be an input by the user)
    (b) To find the sum of the series:
    S = (1/2) + (3/4) + (5/6) + (7/8) + ........... + (19/20)
 */
public class sB_q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Print series: 0, 3, 8, 15, 24, ............ to n terms");
        System.out.println("2. Find sum of series: (1/2) + (3/4) + (5/6) + (7/8) + ........... + (19/20)");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of terms (n): ");
                int n = in.nextInt();
                System.out.print("Series: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(i * (i + 1) + " ");
                }
                System.out.println();
                break;
            case 2:
                double sum = 0;
                for (int i = 1; i <= 19; i += 2) {
                    sum += (double) i / (i + 1);
                }
                System.out.println("Sum of the series: " + sum);
                break;
            default:
                System.out.println("Invalid choice");
        }
        in.close();
    }
}