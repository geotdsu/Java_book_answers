package ch_01;

public class Exercise01_09 {
    public static void main(String[] args) {

        double width = 4.5;
        double height = 7.9;

        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);
        System.out.printf("Area of the rectangle: %.2f", area);
    }
}