package homeworks;

import java.text.DecimalFormat;

public class HW14TeacherSample {
    public static void main(String[] args) {

        discount(100,45);
        discount(89, 20);
        discount(89.89F, 20);

    }

    //Discont method
    public static float discount (float price, float discount){
        //rounding: (if you want to see in sout(df.format(result))
        DecimalFormat df = new DecimalFormat("0.00");

        discount/= 100;
        float result = price - (price * discount);
        System.out.println("Special price: " + df.format(result));
        return result;
    }

}
