package javaSpeedConverter;


public class Main {
    public static void main(String[] args) {

        // change toMilesPerHour Value and then run to calculate km/h --> mi/h
        long miles = SpeedConverter.toMilesPerhour(105);

        System.out.println(" Miles = " + miles);

        // match printConversion value === toMilesPerHour

        SpeedConverter.printConversion(105);
    }
}