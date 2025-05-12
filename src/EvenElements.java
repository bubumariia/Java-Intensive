import java.util.Arrays;
import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            int element = scanner.nextInt();
            array[i] = element;
        }

        for (int j = 0; j < n; j++){
            if (array[j] % 2 == 0){
                System.out.println(array[j]);
            }
        }

    }
}
