package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //Example1
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("ab");
        System.out.println("shows true or false: " + matcher.matches());
        System.out.println("shows if at least one matches: " + matcher.find());

        //Example2
        //Any 3 symbols that would be any lower case letter or number from 55 to 9
        System.out.println(Pattern.matches("[a-z5-9]{3}","5v9"));

        //2 Uppercase letters followed by 2 lower case letters and then by 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}","dUFjdgdfg923"));

        //7 any letter or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,7}","g5"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you car's plate number");
        String plateNumber = scanner.nextLine();

        // 2 Uppercase letters followed by one "-" symbol and then 2 to 4 numbers

        if (Pattern.matches("[A-Z]{2}-[0-9]{2,4}",plateNumber)) {
            System.out.println("Your plate number is valid");
        }else {
            System.out.println("Your plate number is not valid");
        }

    }
}
