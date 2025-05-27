package AlishevTutorial;

public class Constructors {
    public static void main(String[] args) {
    Individual human1 = new Individual("Mariia", 23);
    Individual.description = "Hello";
    Individual.getDescription();

    }
}
class Individual{
    private String name;
    private int age;
    public static String description;

    public Individual(){
        this.name = "Bob";
        this.age = 45;

        System.out.println(name + "," + age);
    }

    public Individual(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + "," + age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription(){
        System.out.println("I am static description " + description);
    }
}
