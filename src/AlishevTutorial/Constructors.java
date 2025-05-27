package AlishevTutorial;

public class Constructors {
    public static void main(String[] args) {
    Individual human1 = new Individual("Mariia", 23);
    Individual human2 = new Individual("Bob", 34);

    human1.printNumberOfPeople();
    human2.printNumberOfPeople();

    }
}
class Individual{
    private String name;
    private int age;
    private static int countPeople;


    public Individual(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
        System.out.println(name + "," + age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople(){
        System.out.println(countPeople);
    }


}
