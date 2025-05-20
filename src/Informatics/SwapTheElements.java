package Informatics;

import java.util.Scanner;

public class SwapTheElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < number-1; j+=2){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
        }
        for (int k = 0; k < number; k++){
            System.out.print(array[k] + " ");
        }
    }
}
