package barkingDogo;

public class barkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)) {
                System.out.println("The dog is barking");
                return true;
            }
        }

        System.out.println("All Dogo's are sleeping");
        return false;
    }
}