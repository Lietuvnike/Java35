package basics;

public class PrintFormatting {
      public static void main(String[] args) {
        // s - string
        // d - integer sveikasis skai2ius
        // f - float/double
        // c - char
        // b - bolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("hello %s you age is %d\n", name, age);

        double height = 192.2342534d;
        System.out.printf("%s is %.2f cm tall", name, height);

        //Hello Bob your age is 34 and you height is 192.... .Good job Bob.
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$f. Good job %1$s", name, age, height);

    }
}
