/**
 * Created by Smoo on 22/08/2016.
 */
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer >> ");
        num = input.nextInt();
        if(isEven(num))
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");
    }
    public static boolean isEven(int number) {
        boolean result;
        if(number % 2 == 1)
            result = false;
        else
        {
            result = true;
        }
        return result;
    }
}
