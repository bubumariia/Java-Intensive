import java.util.Scanner;

public class NextAndPreviousNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        System.out.println("The next number for the number " + inputNumber + " is " + (inputNumber+1) + ".");
        System.out.println("The previous number for the number " + inputNumber + " is " + (inputNumber-1) + ".");
    }
}




