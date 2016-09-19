/**
 * Created by jc282222 on 19/09/16.
 */
public class NonFiction extends Book {
    public NonFiction(String bookTitle)
    {
        super(bookTitle);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 37.99;
    }
}
