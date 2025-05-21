package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student sName = new Student();
        sName.setName("Daisy");
        System.out.println(sName.getName());

        Student sAge = new Student();
        sAge.setAge(23);
        System.out.println(sAge.getAge());



    }
}
