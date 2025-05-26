package AlishevTutorial;

public class PracticeThis {
    public static void main(String[] args)  {
        Human human1 = new Human();
        human1.name = "Asel";
        human1.age = 25;
        human1.getInfo();

        Human human2 = new Human();
        human2.setName("Tom");
        human2.setAge(23);
        human2.getInfo();

    }
}

class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name + ", " + age);

    }
}
