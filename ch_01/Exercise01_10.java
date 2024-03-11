package ch_01;

public class Exercise01_10 {
    public static void main(String[] args) {

        double numMiles = 14 / 1.6; //Km into MPH
        double speed = numMiles / (45.5 / 60);

        System.out.printf("%.3f", speed);

    }
}