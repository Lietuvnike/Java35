package homeworks;

import basics.Switch;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
 /*      Alex is an owner of grocery store. Among many products he sells,
         he's mostly famous for his hand-made jam, that is being
         sold in jars of 1kg or 7kg. Alex sells only full jars
         (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

         Will is asked by his wife Jane to buy some amount of Alex's jam.
         Will forgot to take his bag, thus he can take home no more than six jars of jam
         (three jars in each of his two hands). Jane is very serious about the
         shopping list - if she asked for specific amount of jam, she expects exactly this
         amount, no more, no less.

         Write an application that will check if Will is able to take home the
         amount of jam specified by Jane. Amount of jam should be read from user
         (positive int value). You can assume that there's always enough jam in Alex's shop.
         Your application should print true or false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of jam specified by Jane to buy ");
        int amount = scanner.nextInt();

        switch (amount){
            case 6:
                System.out.println("true ");
                break;
            case 12:
                System.out.println("true ");
                break;
            case 18:
                System.out.println("true ");
                break;
            case 24:
                System.out.println("true ");
                break;
            case 30:
                System.out.println("true ");
                break;
            case 36:
                System.out.println("true ");
                break;
            case 42:
                System.out.println("true ");
                break;
            default:
                System.out.println("False");
                break;

        }



    }
}
