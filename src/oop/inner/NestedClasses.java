package oop.inner;

class OuterClass{
    int num = 10;
    class InnerClass{
        int num = 5;
    }
}

public class NestedClasses {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println("Outer class calue: " + outerClass.num);
        //object of innerClass:
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("Inner class value: " + innerClass.num);

    }

}
