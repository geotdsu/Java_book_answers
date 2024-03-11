package ch_02;

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {

        System.out.println("Enter the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("Thea area is " + area);
        System.out.println("Thea volume is " + volume);


        input.close();

    }

}