package decimalComparator;

public class decimalComp {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        
            if ((a - b <= 0.0009 && a - b >= -0.0009)){
                System.out.println(a + " & " + b + " are equal by three decimal places ");
                    return true;
            }
            System.out.println(a + " & " + b + " are not equal by three decimal places");
            return false;
        }

}
