/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
You can test for equality, but you may need to test to see how a number compares to a known value and display a message if the number is too low or too high.

Write a program that asks the user for their age and compare it to the legal driving age of sixteen. If the user is sixteen or older, then the program should display "You are old enough to legally drive." If the user is under sixteen, the program should display "You are not old enough to legally drive."

Example Output
What is your age? 15
You are not old enough to legally drive.
Or

What is your age? 35
You are old enough to legally drive.
Constraints
Use a single output statement.
Use a ternary operator to write this program. If your language doesn’t support a ternary operator, use a regular if/else statement, and still use a single output statement to display the message.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        int age = getAge();
        System.out.println(output(age));
    }

    private static Integer getAge(){
        System.out.print("What is your age? ");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static String output(int age){
        return age >= 16
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
    }
}
