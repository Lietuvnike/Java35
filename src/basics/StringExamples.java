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

        //Subtring
        String introduction = "Hello there! My name is Bob and I'm 17";
        System.out.println(introduction.substring(6));
        System.out.println(introduction.substring(6,12));
        System.out.println(introduction.length());

        String bobsAge = introduction.substring(introduction.length()-2).trim();
        System.out.println("Bob is " + bobsAge + " years old");

        //If-else not wrking when it's string. That's why we need integer and we convert to it
        int bobsAgeAsInteger = Integer.parseInt(bobsAge);

        if (bobsAgeAsInteger >= 18){
            System.out.println("Adult ");
        } else {
            System.out.println("Child");
        }

        //Wrapper class
        int temp1 = 36;
        Integer temp2 = 36;

        String intStrValue = "1";
        String floatStrValue = "2.8";
        String doubleStrValue = "2.5342323";
        String booleanStrValue = "true";
        String longStrValue = "12341342342353";
        String charStrValue = "c";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);
        char charValue = charStrValue.charAt(0);






    }
}
