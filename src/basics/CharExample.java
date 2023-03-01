package basics;

import java.sql.SQLOutput;

public class CharExample {
    public static void main(String[] args) {
        //ASCII TABLE

        char ch = 'M';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //Convert from char to int
        System.out.println((int) ch);

        //Convert from int to char
        System.out.println((char) 122);
    }
}
