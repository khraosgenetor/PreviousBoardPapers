package year2010;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 20:45 and the day is: Fri

/*
    Write a program to store 6 elements in an array P and 4 elements in an array Q.
    Now, produce a third array R, containing all the elements of array P and Q.
    Display the resultant array.
 */

public class sB_q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] P = new int[6], Q = new int[4], R = new int[10];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter element " + (i+1) + " of Array P: ");
            P[i] = in.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter element " + (i+1) + " of Array Q: ");
            Q[i] = in.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            R[i] = P[i];
        }

        for (int i = 6; i < 10; i++) {
            R[i] = Q[i-6];
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(R[i] + " ");
        }
        in.close();
    }
}
