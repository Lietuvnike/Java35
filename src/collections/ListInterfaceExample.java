package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        //Declaring ArrayList object
        ArrayList<String> car = new ArrayList<>();

        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //Print out all the elements
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(0));

        //Add element at specific index. Shows in which place to add new element
        car.add(2, "Toyota");
        System.out.println(car);

        //Changing elements value
        car.set(3, "Ford");
        System.out.println(car);

        //Remove values
        car.remove(5);
        System.out.println(car);
        car.remove("Mercedes");
        System.out.println(car);

        //To know size or array
        System.out.println(car.size());

        //Deleting all elements
        car.clear();
        System.out.println(car);

    }
}
