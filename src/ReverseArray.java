import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];


        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < number / 2; j++){
            int temp = array[j];
            array[j] = array[number -1 - j];
            array[number -1 - j] = temp;
        }
        for (int k = 0; k < number; k++){
            System.out.print(array[k] + " ");
        }
    }
}
