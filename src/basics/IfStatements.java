package basics;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //IF
        //Print out "Good job" if grade ir over6
        if (grade > 6) {
            System.out.println("Good job");
        }

        //Print out "You can do better!" if grade is less or equal to 4

        if (grade <= 4) {
            System.out.println("You can do better!");
        }

        //If else
        //Print "You have passed the test" if grade is equal or greater than
        //but if it's not then print "You hae failed the test"

        if (grade >= 4) {
            System.out.println("You have passed the test");
        } else {
            System.out.println("You have failed the test");
        }

        //Same logic
        if (grade < 4) {
            System.out.println("You have failed the test");
        } else {
            System.out.println("You have passed the test");
        }

        //If.. Else If..Else
        //Print comment about grades:
        //1-3 --> vey bad
        //4-5 --> Okay
        // 6--> "Nice"
        // 7-10 --> "Very good"
        //If not in the range 1-0 --> "Invalid input"

        if (grade >= 1 && grade <= 3) {
            System.out.println("Very bad");
        } else if (grade == 4 || grade == 5) {
            System.out.println("Okay");
        } else if (grade == 6) {
            System.out.println("Nice");
        } else if (grade > 6 && grade < 11) {
            System.out.println("Very good");
        } else {
            System.out.println("Invalid input");
        }



    }

    }