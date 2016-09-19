/**
 * Created by jc282222 on 19/09/16.
 */
public abstract class Book {
    String bookTitle = new String();
    double price;
    public Book(String bt)
    {
        bookTitle = bt;
    }
    public String getTitle()
    {
        return bookTitle;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
