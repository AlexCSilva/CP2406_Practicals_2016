/**
 * Created by Smoo on 22/08/2016.
 */
public class Percentages {
    public static void main(String args[]) {
        double num1 = 10.0, num2 = 20.5;
        computePercent(num1, num2);
    }
    public static void computePercent(double x, double y) {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}