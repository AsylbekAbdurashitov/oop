import java.awt.geom.Area;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Asylbek", "Abdurashitov",
                26, new String[]{"English", "Java Practic", "Soft Skill", "Java Session"},
                "Kebab");
        System.out.println(myClass.name + "\n" + myClass.surname +
                "\n" + myClass.age + "\n" + Arrays.toString(myClass.PeaksoftLesson) + "\n" + myClass.tamak);
        System.out.println("///////////////////////////////////////////////////////////////////////////");
        MyClass myClass2 = new MyClass();
        myClass2.name = "Baktulan";
myClass2.surname="Nazirbek uulu";
myClass2.age=23;
myClass2.PeaksoftLesson=new String[]{"English", "Java Practic", "Soft Skill", "Java Session"};
myClass2.tamak="Shashlyk";
        System.out.println(myClass2.name+"\n"+myClass2.surname+"\n"+myClass2.age+
                "\n"+Arrays.toString(myClass2.PeaksoftLesson)+"\n"+myClass2.tamak);
    }
}