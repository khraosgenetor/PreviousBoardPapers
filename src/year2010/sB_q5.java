package year2010;

import java.util.*;

// Made by Khraos on 10-01-2025
// System time is: 20:05 and the day is: Fri

/*
    Define a class Student as given below:

    Data members/instance variables:
    name, age, m1, m2, m3 (marks in 3 subjects), maximum, average

    Member methods:

        A parameterized constructor to initialize the data members.
        To accept the details of a student.
        To compute the average and the maximum out of three marks.
        To display the name, age, marks in three subjects, maximum and average.

    Write a main method to create an object of a class and call the above member methods.
 */

class Student {
    String name;
    int age;
    int m1, m2, m3, maximum;
    double average;

    Student(String n, int a, int m1, int m2, int m3, int max, double avg) {
        name = n;
        age = a;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        maximum = max;
        average = avg;
    }

    Student() {
        name = "";
        age = 0;
        m1 = 0;
        m2 = 0;
        m3 = 0;
        maximum = 0;
        average = 0.0;
    }

    void accept(Scanner in) {
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter age: ");
        age = in.nextInt();
        System.out.println("Enter marks in 3 subjects: ");
        m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();
    }

    void compute() {
        maximum = Math.max(Math.max(m1, m2), m3);
        average = (m1 + m2 + m3) / 3.0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks in 3 subjects: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }
}

public class sB_q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student std = new Student();
        std.accept(in);
        std.compute();
        std.display();
        in.close();
    }
}

