package Informatics;

import java.util.Scanner;

public class CompareNeighbourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int j = 1; j < number - 1; j++){
            if (array[j-1] < array[j] && array[j] > array[j+1]){
                counter++;

            }
        }
        System.out.println(counter);
    }
}
