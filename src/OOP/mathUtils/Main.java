package OOP.mathUtils;

public class Main {
    public static void main(String[] args) {
        MathUtils addResult = new MathUtils();
        System.out.println(addResult.add(23,67));

        MathUtils subtractResult = new MathUtils();
        System.out.println(subtractResult.subtract(56,12));

        MathUtils multiplyResult = new MathUtils();
        System.out.println(multiplyResult.multiply(12,4));

        MathUtils divideResult = new MathUtils();
        System.out.println(divideResult.divide(12,4));

         MathUtils squareResult = new MathUtils();
        System.out.println(squareResult.square(6));
    }
}
