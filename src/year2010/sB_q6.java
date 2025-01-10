package year2010;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 20:11 and the day is: Fri

/*
    Shasha Travels Pvt. Ltd. gives the following discount to its customers:
    Ticket Amount	        Discount
    Above Rs. 70000	        18%
    Rs. 55001 to Rs. 70000	16%
    Rs. 35001 to Rs. 55000	12%
    Rs. 25001 to Rs. 35000	10%
    Less than Rs. 25001	    2%

    Write a program to input the name and ticket amount for the customer and calculate the discount
    amount and net amount to be paid. Display the output in the following format for each customer:

    Sl. No.     Name    Ticket Charges     Discount      Net Amount

    (Assume that there are 15 customers, first customer is given the serial no (SI. No.) 1, next
    customer 2 …….. and so on)
 */

public class sB_q6 {
    public static void main(String[] args) {
        int[] sNo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String[] names = new String[15];
        double[] charges = new double[15];
        double[] discounts = new double[15];
        double[] netCharges = new double[15];
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 15; i++) {
            System.out.print("Enter customer " + i + " name: ");
            names[i - 1] = in.nextLine();
            System.out.print("Enter customer " + i + " ticket charges: ");
            charges[i - 1] = in.nextDouble();
            in.nextLine();
        }

        for (int i = 1; i <= 15; i++) {
            if (charges[i - 1] > 70000) {
                discounts[i - 1] = charges[i - 1] * 0.18;
                netCharges[i - 1] = charges[i - 1] - discounts[i - 1];
            } else if (charges[i - 1] >= 55001 && charges[i - 1] <= 70000) {
                discounts[i - 1] = charges[i - 1] * 0.16;
                netCharges[i - 1] = charges[i - 1] - discounts[i - 1];
            } else if (charges[i - 1] >= 35001 && charges[i-1] <= 55000) {
                discounts[i - 1] = charges[i - 1] * 0.12;
                netCharges[i - 1] = charges[i - 1] - discounts[i - 1];
            } else if(charges[i - 1] >= 25001 && charges[i-1] <= 35000) {
                discounts[i - 1] = charges[i - 1] * 0.10;
                netCharges[i - 1] = charges[i - 1] - discounts[i - 1];
            } else {
                discounts[i - 1] = charges[i - 1] * 0.02;
                netCharges[i - 1] = charges[i - 1] - discounts[i - 1];
            }
        }

        for (int i = 1; i <= 15; i++) {
            System.out.println("Sl. No.     Name    Ticket Charges     Discount      Net Amount");
            System.out.println(sNo[i - 1] + "\t" + names[i - 1] + "\t" + charges[i - 1] + "\t" + discounts[i - 1] + "\t" + netCharges[i - 1]);
        }
        in.close();
    }
}
