package oop;

public class Animal {

    //Fields
    private String type;
    private int avgLifespan;
    private double weight;

    /*Constructor: (special about this method it has no return, void. Name exactly as class name. Can hold any values
    you need. Constructor always will be public and will have the same name. We can create as many constructor as we
    wish, but inputs should be different.
    */
    public Animal(String type, int avgLifespan, double weight){
        this.type = type;
        this.avgLifespan = avgLifespan;
        this.weight = weight;
    }

    public Animal(String type, int avgLifespan){
        this.type = type;
        this. avgLifespan = avgLifespan;
    }

    public Animal(){

    }


    //Public method give access to main
    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Average life span: " + avgLifespan);
        System.out.println("Weight: " + weight);
    }

}
