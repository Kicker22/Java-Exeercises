package teenNumberChecker;


public class teenChecker {
    // this program will determine at least on of the 3 numbers is a teen number >
    // 12 or < 20
    public static boolean hasTeen(int a, int b, int c) {
        if (a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20) {
            System.out.println("At least one number is a teen.");
            return true;
        } else {
            System.out.println("No teen number provided");
            return false;
        }
    }
}