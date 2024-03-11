package ch_01;

public class Exercise01_04 {
    public static void main(String[] args) {
        System.out.println("a   a^2  a^3");
        for (int a = 1; a <= 4; a++) {
            int aSquared = a * a;
            int aCubed = a * a * a;
            System.out.println(a + "   " + aSquared + "    " + aCubed);
        }
    }
}