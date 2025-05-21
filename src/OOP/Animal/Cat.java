package OOP.Animal;

public class Cat extends Animal {
    public static String sound = "Meow meow";
    public static void main(String[] args) {
        Animal s  = new Animal();
        s.makeSound(sound);

    }
}
