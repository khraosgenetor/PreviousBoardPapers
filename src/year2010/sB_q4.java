package year2010;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 19:56 and the day is: Fri

/*
    Write a program to perform binary search on a list of integers given below,
    to search for an element input by the user. If it is found display the
    element along with its position, otherwise display the message
    "Search element not found".

    5, 7, 9, 11, 15, 20, 30, 45, 89, 97
 */

public class sB_q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int element = in.nextInt();
        in.nextLine();

        int[] array = {5, 7, 9, 11, 15, 20, 30, 45, 89, 97};
        int lb = 0, ub = array.length - 1;

        boolean found = false;

        while (lb <= ub) {
            int mid = (ub + lb) / 2;
            if (element == array[mid]) {
                System.out.println("Found at index: "+mid);
                found = true;
                break;
            } else if (element < array[mid]) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }

        if(!found) System.err.println(element + " not found.");

        in.close();
    }
}
