/**
 * Created by Smoo on 23-Aug-16.
 */
public class Billing {
    final static double TAX = 0.08;
    public static void main(String args[])
    {
        double bill;
        bill = computeBill(35.59);
        System.out.println("The total for a photobook that costs $35.59 is $" +
                bill);
        bill = computeBill(20.00, 4);
        System.out.println("The total for four photobooks that cost $20.00 is $" +
                bill);
        bill = computeBill(25.99, 6, 20.00);
        System.out.println("The total for six photobooks that cost $25.99 with a $20 coupon is $" +
                bill);
    }
    public static double computeBill(double price)
    {
        double bill = price + price * TAX;
        return bill;
    }
    public static double computeBill(double price, int quantity)
    {
        double bill = price * quantity;
        bill = bill + bill * TAX;
        return bill;
    }
    public static double computeBill(double price, int quantity, double coupon)
    {
        double bill = price * quantity;
        bill = bill - coupon;
        bill = bill + bill * TAX;
        return bill;
    }
}
