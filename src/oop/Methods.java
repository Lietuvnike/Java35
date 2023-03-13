package oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String usersName = scanner.nextLine();

        System.out.println("Please enter your age");
        int usersAge = scanner.nextInt();

        //kad veiktu metodas reikia printName
        printName(usersName, usersAge);
        String answer2 = greetings(usersName);
        System.out.println(answer2);
    }
    //void method
    // name = userName; age = usersAge

    public static void printName(String name, int age){
        System.out.println("Helo your name is " + name);
        System.out.println("You are " + age + " years old");
    }

    public static String greetings(String name){
        String result = "Hi " + name;
        return result;
    }

}
