package co.develhope.introduction;

import java.time.LocalDate;
import java.time.Month;



public class DateTime {
    public static void main (String [] args){
        LocalDate localDate = LocalDate.of(2023, Month.JUNE, 15);
        System.out.println("Today's date is: " + localDate);

        int leftDaysInTheMonth = localDate.lengthOfMonth() - localDate.getDayOfMonth();
        System.out.println("The days left in the month are :" + leftDaysInTheMonth);

        int leftDaysInTheYear = localDate.lengthOfYear() - localDate.getDayOfYear();
        System.out.println("The days left in the year are: " + leftDaysInTheYear);
    }
}
