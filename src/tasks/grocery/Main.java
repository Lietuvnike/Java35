package tasks.grocery;

import java.util.Scanner;

public class Main {
    //we will declare scanner here, because we will use it in the different methods
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){

            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    //print all options
                    printInstructions();
                    break;
                case 1:
                    //print grocery list
                    groceryList.printGroceryList();
                    break;
                case 2:
                    //add item
                    //addItem();
                    break;
                case 3:
                    //modify item
                    break;
                case 4:
                    //remove item
                    break;
                case 5:
                    //search item
                    break;
                case 6:
                    //Delete all items
                    break;
                case 7:
                    quit = true;
            }

        }
    }

    private static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all item in the list");
        System.out.println("\t 7 - To quit the application");
    }



}
