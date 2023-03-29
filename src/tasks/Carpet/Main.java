package tasks.Carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor length");
        double length = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        //Create floor object
        Floor floor = new Floor(length, width);
        System.out.println("Floor m^2: " + floor.getArea());
        System.out.println("Please enter carper price per m^2");
        double carpetCost = scanner.nextDouble();

        //Create carpet object
        Carpet carpet = new Carpet(carpetCost);
        System.out.println("Carpet price per m^2: " + carpet.getCost());

        //Create calculator class object and
        //Pass floor and Carpet class object as input

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("In total Carpet will cost " + calculator.getTotalCost() + "Eur");


    }
}
