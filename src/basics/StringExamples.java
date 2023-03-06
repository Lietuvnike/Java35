package basics;

public class StringExamples {
    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        String name = scanner.nextLine().toLowerCase().trim();
//
//        // name == Bob
//        if (name.equals("Bob")) {
//            System.out.println("Your name is Bob");
//        } else {
//            System.out.println("Your name is not bob");
//        }

        //cOMBINE STRING VALUE
        String text1 = "This is ";
        String text2 = "new text";
        // tex + text

        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("In this sentence there are " + result.length() + " characters");

        //indexOf
        System.out.println(result.indexOf(" is "));
        System.out.println(result.indexOf('x'));

        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));

        //Replace
        String greetings = "This is holiday time. \nHave a nice holiday";
        System.out.println(greetings.replaceAll("holiday", "Easter"));
        System.out.println(greetings.replaceFirst("holiday", "Easter"));

    }
}
