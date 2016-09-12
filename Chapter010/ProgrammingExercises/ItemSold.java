/**
 * Created by jc282222 on 12/09/16.
 */
public class ItemSold {
    private int invoice;
    private String description;
    private double price;
    public int getInvoice()
    {
        return invoice;
    }
    public double getPrice()
    {
        return price;
    }
    public String getDescription()
    {
        return description;
    }
    public void setInvoice(int num)
    {
        invoice = num;
    }
    public void setDescription(String desc)
    {
        description = desc;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
}
