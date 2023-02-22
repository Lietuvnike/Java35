package basics;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //padidinti 2 vienetais
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i + " ");
        }

        // While loop
        int i = 1;
        while (i <= 10) {
            System.out.println("This is while loop " + i);
            i++;
        }

        //Do while
        i = 1;
        do {
            System.out.println("This is do while loop " + i);
            i++;
        } while (i <= 10);


    }
}