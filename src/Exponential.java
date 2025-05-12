import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int exponential = 1;
        for (int i=1; i <= number; i++){
            exponential *= 2;
        }
        System.out.println(exponential);
    }
}
