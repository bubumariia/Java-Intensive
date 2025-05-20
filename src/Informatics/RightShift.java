package Informatics;

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int temp = array[number - 1];

        for (int i = number - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = temp;

        for (int i = 0; i < number; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
