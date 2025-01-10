package year2011;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 21:13 and the day is: Fri

/*
    Write a program to input and sort the weight of ten people.
    Sort and display them in descending order using the
    selection sort technique.
 */

public class sB_q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] weights = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight "+ (i+1) + ": ");
            weights[i] = in.nextDouble();
        }

        for (int i = 0; i < 9; i++) {
            if(weights[i] < weights[i+1]) {
                double temp = weights[i];
                weights[i] = weights[i+1];
                weights[i+1] = temp;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(weights[i] + " ");
        }

        in.close();
    }
}
