import static java.lang.String.format;

public class Twofer {
    public String twofer(String name) {
        return format("One for %s, one for me.", name == null ? "you" : name);
    }
}
