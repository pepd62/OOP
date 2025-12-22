package classes;

public class TextStat {
    public String text;
    public int words;
    public int symbols;

    public void textStatInfo() {
        System.out.println("Текст содержит:" + words + " " + symbols);
    }
}
