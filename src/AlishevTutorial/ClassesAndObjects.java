package AlishevTutorial;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Mariia";
        person1.age = 28;
        System.out.println(person1.name);

        Person person2 = new Person();
        person2.name = "Nurs";
        person2.age = 34;
        System.out.println(person2.name);
    }
}
class Person{
    String name;
    int age;
}