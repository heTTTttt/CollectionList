import java.util.Arrays;

public class ListConstructor {
    private int occurrence;
    private String name;

    public ListConstructor(int occurrence, String[] name) {
        this.occurrence = occurrence;
        this.name = Arrays.toString(name);
    }
}
