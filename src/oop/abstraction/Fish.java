package oop.abstraction;
//it makes sub class from pet class public class Fish extends Pet{
public class Fish extends Pet{

    private int waterChangesInWeek;

    //if there is no default constructor we need. How to use custom constructor from parent class
    public Fish(String colour, String eat, String place, int averageAge, int waterChangesInWeek){
        super(colour, eat, place, averageAge);
        this.waterChangesInWeek = waterChangesInWeek;
    }
// Mandatory tasks:
    public void printPetInfo(){
        System.out.println("Colour: " + colour);
        System.out.println("Eat: " + eat);
        System.out.println("Place: " + place);
        System.out.println("Lifespan: " + averageAge);
        System.out.println("Water changes in a week: " + waterChangesInWeek);
    }
}
