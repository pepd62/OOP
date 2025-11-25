package classes;

public class Book {
    // Состояние (поля класса)
    public String title;
    public String author;
    public int pages;

    // Поведение (методы класса)
    public void displayInfo() {
        System.out.println(title + " " + author + " " + pages);
    }
}
