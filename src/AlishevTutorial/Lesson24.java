package AlishevTutorial;

public class Lesson24 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.eat(); // was changed in dependent class which is extended
        dog.showName();
    }
}
