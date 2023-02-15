package basics;

import java.security.KeyStore;

public class Operators {
    public static void main(String[] args) {

        //Basic arithmetic operators -, +, /, %
        int x = 100;
        x = x + 76;
        System.out.println(x);

        //Assignment operator = , -=, +=, *=, /=
        int a = 10;
        a = 20;
        a += 20;
        System.out.println(a);

        //Incrementation operators & Decrementation operators ++, --
        int i = 10;
        i++;
        ++i;
        System.out.println(i);

        //Post-incrementation
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1);

        //Pre-incrementation
        int num2 = 10;
        System.out.println(++num2);
        System.out.println(num2);

        //4 ways to increase by one
        num1 = num1 + 1;
        num1 += 1;
        num1++;


        //Relational operators

        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println("Equality " + (p==k));

        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than > and greator or equal to >=
        System.out.println("Greator than " + (p>k));
        System.out.println("Greator than or equal to" + (p>=k));

        //Less than < and less than or equal to <=
        System.out.println("Less than " + (p<k));
        System.out.println("Less than or eqal to " + (p<=k));

        //Logical operators
        //Logical and &&

        boolean sun = true;
        boolean dry = false;

        System.out.println("I will go outside" + (sun && dry));
        System.out.println((p>k) && (p>=k));

        int bobAge = 8;
        int johnAge = 11;
        int annasAge = 10;

        //Is John older then bob and younger then Anna
        System.out.println("Is John older then bob and younger then Anna " + ((johnAge > bobAge) && (johnAge < annasAge)) );

        //Logical or - ||

        boolean sale = true;
        boolean rich = false;

        System.out.println("I will buy iPhone " + (sale || rich));

        //negation
        boolean example = true;
        System.out.println(!example);



    }
}
