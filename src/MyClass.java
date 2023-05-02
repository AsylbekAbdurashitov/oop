public class MyClass {
    /***MyClass деген класс тузунуз

     Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

     Параметри эки башка болгон эки конструктор тузунуз

     MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

     Эки объектке эки башка конструктор иштесин.

     Объекттердин маанилерин консольго чыгарыныз.*/
    String name;
    String surname;
    int age;
    String[] PeaksoftLesson = new String[4];
    String tamak;

    public MyClass(String name, String surname, int age, String[] Peaksoftlesson, String tamak) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.PeaksoftLesson = Peaksoftlesson;
        this.tamak = tamak;
    }

    public MyClass(){

    }
}