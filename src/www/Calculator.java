package www;

public class Calculator {
    //  Non-static method → Needs an object to call
    public int add(int a, int b){
        return a+b;
    }

    // Static method → Should be called using the class name - like in Javascript
    public static int square(int x){
        return x * x;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int x, int y){
        return x / y;
    }

    public static void main(String[] args) {
        // non-static object call
        Calculator addResult = new Calculator();
        System.out.println(addResult.add(33,44));
        // static - no need for object
        System.out.println(square(5));

        System.out.println(subtract(20, 4));

        Calculator multiplyResult = new Calculator();
        System.out.println(multiplyResult.multiply(5,8));

        Calculator divideResult = new Calculator();
        System.out.println(divideResult.divide(30,2));

    }
}
