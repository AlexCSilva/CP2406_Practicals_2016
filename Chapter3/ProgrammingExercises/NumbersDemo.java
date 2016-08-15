/**
 * Created by jc282222 on 15/08/16.
 */
public class NumbersDemo {
    public static void main(String args[])
    {
        int num1 = 5, num2 = 69;
        displayNumberPlusFive(num1);
        displayTwiceTheNumber(num1);
        displayNumberSquared(num1);
        displayNumberPlusFive(num2);
        displayTwiceTheNumber(num2);
        displayNumberSquared(num2);
    }
    public static int displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n +FACTOR));
    }
    public static int displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n * FACTOR));
    }
    public static int displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}
