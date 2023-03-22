package oop.Inheritance;

/*We will create in one file other classes. In on class we can use only one "public"
 */

class Parent{
    public void printParent(){
        System.out.println("This is parent class");
    }
}
//child class (inherent). In this place child class see everything from parent class
class Child extends Parent{
    public void printChild(){
        System.out.println("This is child class");
    }
}

public class InheritanceIntro {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printParent();
        child.printChild();
    }
}
