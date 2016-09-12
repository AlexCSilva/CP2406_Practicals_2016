/**
 * Created by jc282222 on 12/09/16.
 */
public class Poem {
    private String title;
    private int numberOfLines;
    public String getName() {
        return title;
    }
    public int getNumberOfLines() {
        return numberOfLines;
    }
    public Poem(String name, int numLines)
    {
        title = name;
        numberOfLines = numLines;
    }
}
