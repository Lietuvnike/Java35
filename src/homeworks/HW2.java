package homeworks;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");
        float speedMph = scanner.nextFloat();
        float num2 = 1.60934f;
        float speedKmh = num2 * speedMph;
        System.out.println(speedMph + "mp/h in km/h would be equal to " + speedKmh);

    }
}
