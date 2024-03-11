package ch_02;

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        input.close();

        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            sum += number % 10;

            number /= 10;
        }

        // Display the result
        System.out.println("The sum of the digits in " + originalNumber + " is: " + sum);
    }

}
