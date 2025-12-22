import classes.MainPage;

public class PagesWorld {

    public static void main(String[] args) {
        MainPage page1 = new MainPage(); // пустой объект
        page1.setUrl("https://page1.example.com");
        page1.setTitle("Страница #1");
        page1.setSize(3000);

        MainPage page2 = new MainPage("https://page2.example.com"); // объект с URL
        page2.setTitle("Страница #2");
        page2.setSize(4500);

        MainPage page3 = new MainPage("https://page3.example.com", "Страница #3", 5000); // объект с полным набором параметров

        page1.isSizeLessThan(3500);
        page2.isSizeLessThan(4000);
        page3.isSizeLessThan(6000);
    }
}
