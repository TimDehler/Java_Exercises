package de.tim;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTime {

    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        dateTime.presentMonthsDays();
        dateTime.presentDayName();
        dateTime.currentDayOfYear();
        dateTime.currentMonth();
    }

    public void presentMonthsDays() {
        Calendar cal = Calendar.getInstance();
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }

    public void presentDayName() {
        Calendar cal = Calendar.getInstance();
        switch (cal.getFirstDayOfWeek()) {
            case 1 -> System.out.println("The current day is Monday");
            case 2 -> System.out.println("The current day is Tuesday");
            case 3 -> System.out.println("The current day is Wednesday");
            case 4 -> System.out.println("The current day is Thursday");
            case 5 -> System.out.println("The current day is Friday");
            case 6 -> System.out.println("The current day is Saturday");
            case 7 -> System.out.println("The current day is Sunday");
        }
    }

    public void currentDayOfYear() {
        Calendar cal = Calendar.getInstance();
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfYear());

        System.out.println(date.getDayOfWeek().getValue());
        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH));
    }

    public void currentMonth() {
        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth().getValue());
        System.out.println(date.getMonth());
    }

/*    public void dateCalculator(){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.roll();
    }*/
}
