package leapYearCalc;

public class lyc {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                System.out.println(year + " is a leap year");
            return true;
        }

        return false;
    }
}
