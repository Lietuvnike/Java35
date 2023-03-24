package oop.abstraction;
//Abstract class:
abstract class Animal{
    //we will create subclass that's why we use protectd
    protected String name;
    //Regular method:
    public void sleep(){
        System.out.println("ZZZZ");
    }
    //Abstract method:
    public abstract void animalSound();
}
class Pig extends Animal {
    public void animalSound() {
        System.out.println("oink oink");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {
        /*new class object. Cannot create an object from abstract class
        Animal animal = new Animal();*/

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();

    }
}
