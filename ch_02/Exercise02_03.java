package ch_02;

import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {

        System.out.println("Enter a value for feet: ");
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();

        double meters = feet * 0.305;
        System.out.printf("%.2f feet is %.2f", feet, meters);

        input.close();

    }

}