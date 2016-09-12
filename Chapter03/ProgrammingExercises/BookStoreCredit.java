/**
 * Created by Smoo on 11-Sep-16.
 */
import java.util.Scanner;
public class BookStoreCredit {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String name;
        double gpa;
        System.out.print("Enter your name >> ");
        name = input.nextLine();
        System.out.println("Enter your grade per average >>");
        gpa = input.nextFloat();
        computeDiscount(name, gpa);
    }
    public static void computeDiscount(String name, double gpa)
    {
        double discount;
        final double FACTOR = 10;
        discount = gpa * FACTOR;
        System.out.println(name + ", your  GPA is " + gpa +
                ", so your discount is $" + discount);
    }

}
