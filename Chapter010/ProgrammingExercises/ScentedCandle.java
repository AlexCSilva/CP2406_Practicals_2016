/**
 * Created by jc282222 on 5/09/16.
 */
public class ScentedCandle extends  Candle {
    private String scent;
    public String getScent()
    {
        return scent;
    }
    public void setScent(String scent)
    {
        this.scent = scent;
    }
    //@Override
    public void setHeight(int h)
    {
        final double PER_INCH = 3;
        super.setHeight(h);
        cost = h * PER_INCH;
    }
}
