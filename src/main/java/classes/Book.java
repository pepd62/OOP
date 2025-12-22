package classes;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.setAuthor(author);
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        if (author == "folk"){
            this.author = "Krylov";
        } else {
            this.author = author;
        }
    }
    public int getPages() {
        return this.pages;
    }
    public void setAge(int pages) {
        this.pages = pages;
    }
        public void displayInfo() {
        System.out.println(this.title + " " + this.author + " " + this.pages);
    }
}
