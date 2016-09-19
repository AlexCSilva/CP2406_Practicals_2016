/**
 * Created by jc282222 on 19/09/16.
 */
public class Fiction extends Book {
    public Fiction(String bookTitle)
    {
        super(bookTitle);
        setPrice();
    }
    public void setPrice() {
        super.price = 24.99;
    }
}
