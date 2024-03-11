package ch_01;

public class Exercise01_12 {
    public static void main(String[] args) {
        double hour = 1;
        double minutes = 40;
        double seconds = 35;
        double miles = 24;

        double time_in_minutes = hour + (minutes / 60) + (seconds / 3600);
        double km = miles * 1.6; // miles to km
        double average_speed = km / time_in_minutes;

        System.out.println(average_speed);

    }

}