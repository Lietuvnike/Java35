package basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeExamples {
    public static void main(String[] args) {
        //LocalTime:
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("No is: " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());
        //ride of mili seconds use - .withNano(0)
        // Time showed 23/3/17 use - localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond()

        LocalTime localTime1 = LocalTime.now().withNano(0);
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until " + localTime1);
        System.out.println("Now is " + localTime.getHour() + " full hours");
        //If you want to add extra minutes on top of the local time - localTime1.plusMinutes(15)

        //LocalDate:
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        System.out.println("Year is:" + localDate.getYear());
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
        System.out.println("Day of the year: " + localDate.getDayOfYear());

        LocalDate startOfCovid = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("First case of Covid was on " + startOfCovid);

    }
}
