package equalSumChecker;

public class sumChecker {
    public static boolean hasEqualSum(int a, int b, int sum) {
       if(a + b == sum){
           System.out.println( a + " + " + b + " are equal to " + sum );
           return true;
       } 
       System.out.println(a + " + " + b + " is not equal to " + sum);
       return false;
    }
}