/**
 * Created by jc282222 on 12/09/16.
 */
public class DemoCandle
{
    public static void main(String args[])
    {
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();
        candle1.setColour("Blue");
        candle1.setHeight(5);
        candle2.setHeight(8);
        candle2.setColour("Cyan");
        candle2.setScent("Snozberries");
        System.out.println(candle1.getColour() + " is " +
            candle1.getHeight() + " inches and costs $" + candle1.getCost());
        System.out.println(candle2.getColour() + " is " +
            candle2.getHeight() + " inches and has the scent of " + candle2.getScent() +
            " and costs $" + candle2.getCost());
    }
}
