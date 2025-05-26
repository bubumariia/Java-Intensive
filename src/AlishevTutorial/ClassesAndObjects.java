package AlishevTutorial;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Nurs");
        person1.setAge(34);
        person1.speak();

        Person person2 = new Person();
        person2.setName("Mariia");
        person2.setAge(28);
        person2.speak();



    }
}
class Person{
    private String name;
    private int age;

    public void setName(String username){

        if(username.isEmpty()){
            System.out.println("Enter your name");
        }else{
            name = username;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (age < 0){
            System.out.println("Enter an age ");
        }else{
            age = userAge;
        }

    }
    public int getAge(){
        return age;
    }


    void speak(){
        System.out.println("My name is "+ name+ " and I am " + age + " years old");

    }
    void sayHelllo(){
        System.out.println("Hello "+ name);
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void setName(String username, int userage){
        name = username;
        age = userage;
    }


}