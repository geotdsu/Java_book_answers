package ch_01;

public class Exercise01_11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        double birthRate = 1.0 / 7.0;
        double deathRate = 1.0 / 13.0;
        double immigrantRate = 1.0 / 45.0;
        int secondsPerYear = 365 * 24 * 60 * 60;

        double year1Population = currentPopulation + (birthRate - deathRate + immigrantRate) * secondsPerYear * 1;
        double year2Population = currentPopulation + (birthRate - deathRate + immigrantRate) * secondsPerYear * 2;
        double year3Population = currentPopulation + (birthRate - deathRate + immigrantRate) * secondsPerYear * 3;
        double year4Population = currentPopulation + (birthRate - deathRate + immigrantRate) * secondsPerYear * 4;
        double year5Population = currentPopulation + (birthRate - deathRate + immigrantRate) * secondsPerYear * 5;

        System.out.println("Year 1: " + Math.round(year1Population));
        System.out.println("Year 2: " + Math.round(year2Population));
        System.out.println("Year 3: " + Math.round(year3Population));
        System.out.println("Year 4: " + Math.round(year4Population));
        System.out.println("Year 5: " + Math.round(year5Population));
    }
}