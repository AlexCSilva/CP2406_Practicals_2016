/**
 * Created by Smoo on 19-Sep-16.
 */
public class BookArray {
    public static void main(String args[]){
        Book someBook[] = new Book[10];
        int x;
        someBook[0] = new Fiction("Harry Potter and the Philosopher's Stone");
        someBook[1] = new NonFiction("Introduction to Java");
        someBook[2] = new Fiction("Star Wars: Darth Bane - Path of Destruction");
        someBook[3] = new NonFiction("Introduction to Python");
        someBook[4] = new Fiction("Doctor Who - Sight Seeing in Space");
        someBook[5] = new NonFiction("Advanced C++");
        someBook[6] = new Fiction("Lord of the Rings: Fellowship of the Ring");
        someBook[7] = new Fiction("Final Fantasy VIII Unofficial Novelisation");
        someBook[8] = new Fiction("The Sword of Truth");
        someBook[9] = new Fiction("The Adventures of Smoo and Potsinokio");
        for(x = 0; x < someBook.length; ++x)
            System.out.println("Book: " +
                    someBook[x].getTitle() + " costs $" +
                    someBook[x].getPrice());
    }

}
