import classes.Book;

public class Kolobok {
    public static void main(String[] args) {
        Book kolobok = new Book();

        kolobok.title = "Колобок";
        kolobok.author = "a folk tale";
        kolobok.pages = 10;

        kolobok.displayInfo();
    }
}
