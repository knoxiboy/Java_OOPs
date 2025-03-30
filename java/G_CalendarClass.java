package CodeWithHarry.java;

import java.util.*;

public class G_CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        //isLeapYear()
        System.out.println(cal.isLeapYear(2018));
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));

        //timezone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        //rolling
        System.out.println("Date before rolling : " + cal.getTime());
        cal.roll(Calendar.MONTH, true);
        cal.roll(Calendar.DATE, false);
        cal.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + cal.getTime());

        //hashcode
        System.out.println("Calendar : " + cal.getTime());
        System.out.println("The hashcode for this calendar is : "+ cal.hashCode());
    }
}
