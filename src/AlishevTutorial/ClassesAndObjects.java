package AlishevTutorial;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Mariia";
        person1.age = 28;
        person1.sayHelllo();
        person1.speak();

        Person person2 = new Person();
        person2.name = "Nurs";
        person2.age = 34;
        person2.sayHelllo();
        person2.speak();


    }
}
class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is "+ name+ " and I am " + age + " years old");

    }
    void sayHelllo(){
        System.out.println("Hello "+ name);
    }
}