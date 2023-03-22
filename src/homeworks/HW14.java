package homeworks;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter price");
        float productPrice = scanner.nextFloat();
        System.out.println("Please enter discount");
        float productDiscount = scanner.nextFloat();

        float answer2 = printFinalPrice(productPrice, productDiscount);

    }
    public static float printFinalPrice(float price, float discount){
        float answer = price - (price / 100 * discount);
        System.out.println("Discount " + "(" + price + ", " + discount + ")" + "-->" + Math.ceil(answer));
        return price;
    }

    
}
