package oop.abstraction;

public abstract class Pet {

    protected String colour;
    protected String eat;
    protected String place;
    protected int averageAge;

    //Constructor to replace four setter methods
    public Pet(String colour, String eat, String place, int averageAge){
        this.colour = colour;
        this.eat = eat;
        this.place = place;
        this.averageAge = averageAge;
    }

    //one abstract method:
    public abstract void printPetInfo();


}
