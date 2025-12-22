package classes;

public class MainPage {

    private String url;
    private String title;
    private int size;

    public MainPage() {
    }

    public MainPage(String url) {
        this.url = url;
    }

    public MainPage(String url, String title, int size) {
        this.url = url;
        this.title = title;
        this.size = size;
    }

    public void isSizeLessThan(int maxSize) {
        boolean result = this.size < maxSize;
        if (result) {
            System.out.println("Размер страницы '" + title + "' меньше заданного числа!");
        } else {
            System.out.println("Размер страницы '" + title + "' больше или равен заданному числу.");
        }
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(int size) {
        if (size >= 1_000_000) {
            System.out.println("Слишком большой размер, значение не присвоено.");
        } else {
            this.size = size;
        }
    }
}