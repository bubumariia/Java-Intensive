package AlishevTutorial;

public class PracticeThis {
    public static void main(String[] args)  {
        Human human1 = new Human();
        human1.name = "Asel";
        human1.age = 25;
        human1.getInfo();

    }
}

class Human{
    String name;
    int age;

    public void setName(String myName){
        name = myName;
    }

    public void setAge(int myAge){
        age = myAge;
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
