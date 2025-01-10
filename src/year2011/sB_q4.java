package year2011;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 21:07 and the day is: Fri

/*
    Define a class called 'Mobike' with the following specifications:

    Data Members	Purpose
    int bno	        To store the bike number
    int phno	    To store the phone number of the customer
    String name	    To store the name of the customer
    int days	    To store the number of days the bike is taken on rent
    int charge	    To calculate and store the rental charge

    Member Methods	Purpose
    void input()	To input and store the details of the customer
    void compute()	To compute the rental charge
    void display()	To display the details in the given format

    The rent for a mobike is charged on the following basis:
    Days	            Charge
    For first five days	₹500 per day
    For next five days	₹400 per day
    Rest of the days	₹200 per day

    Output:

    Bike No.    Phone No.   Name    No. of days     Charge
    xxxxxxx     xxxxxxxx    xxxx        xxx         xxxxxx
 */

public class sB_q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Mobike bike = new Mobike();
        bike.input();
        bike.compute();
        bike.display();

        in.close();
    }
}

class Mobike {
    int bno;
    int phno;
    String name;
    int days;
    int charge;

    void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter bike number: ");
        bno = in.nextInt();

        System.out.print("Enter phone number: ");
        phno = in.nextInt();

        System.out.print("Enter customer name: ");
        in.nextLine();  // Consume the leftover newline character
        name = in.nextLine();

        System.out.print("Enter number of days: ");
        days = in.nextInt();

        in.close();
    }

    void compute() {
        if (days <= 5) {
            charge = days * 500;
        } else if (days <= 10) {
            charge = (5 * 500) + ((days - 5) * 400);
        } else {
            charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
        }
    }

    void display() {
        System.out.println("Bike No.\tPhone No.\tName\t\tNo. of days\tCharge");
        System.out.println(bno + "\t\t" + phno + "\t\t" + name + "\t" + days + "\t\t" + charge);
    }
}

