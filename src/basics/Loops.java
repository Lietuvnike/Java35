package basics;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("Hello world!");
        }

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //padidinti 2 vienetais
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");
        }

    }
}
