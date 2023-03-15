package tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year: ");
        int year = scanner.nextInt();

        determineLeapYear(year);
        determineLeapYearString(year)

    }
    public static void determineLeapYear (int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }

    public static  String determineLeapYearString (int year){
        String answer;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            answer = "Leap year";
        } else {
            answer "Not a leap year";
        }

    }
}
