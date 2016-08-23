/**
 * Created by Smoo on 22/08/2016.
 */
import java.util.Scanner;
public class Percentages2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter a double >> ");
        num1 = input.nextDouble();
        System.out.print("Enter an other double >> ");
        num2 = input.nextDouble();
        computePercent(num1, num2);
    }
    public static void computePercent(double x, double y) {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
