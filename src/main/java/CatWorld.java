import classes.Cat;
public class CatWorld {
    public static void main(String[] args) {
        // Создаем объект barsik по чертежу Cat
        Cat barsik = new Cat();
        // Задаем состояние объекта barsik
        barsik.name = "Барсик";
        barsik.age = 2;
        barsik.color = "Рыжий";
        // Вызываем поведение объекта barsik
        barsik.meow(); // Выведет: Мяу! Меня зовут Барсик
        barsik.eat();  // Выведет: Барсик кушает.
    }
}