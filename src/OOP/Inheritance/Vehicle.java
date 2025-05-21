package OOP.Inheritance;

public class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Biip Biip");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }

}
