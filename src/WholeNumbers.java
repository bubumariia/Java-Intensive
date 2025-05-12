import java.util.Scanner;

public class WholeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            array[i] = element;
        }

        for (int j = 0; j < n; j++) {
            if (array[j] > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
