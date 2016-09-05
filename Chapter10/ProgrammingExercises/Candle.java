/**
 * Created by jc282222 on 5/09/16.
 */
public class Candle {
    private String colour;
    private int height;
    protected double cost;
    public String getColour()
    {
        return colour;
    }
    public int getHeight() { return height;}
    public double getCost() {return cost; }
    public void setColour(String c)
    {
        colour = c;
    }
    public void setHeight(int h) {
        final double PER_INCH = 2;
        height = h;
        cost = height * PER_INCH;
    }
}
