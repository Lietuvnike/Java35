import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Imput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        System.out.println("Nice to meet you " + name);
        System.out.println("You are " + age + "Years old ");


    }
}
