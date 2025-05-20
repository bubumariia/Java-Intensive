package Informatics;

import java.util.Scanner;

public class SameTypeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }

        for (int j = 1; j < number; j++){
            if ((array[j] > 0 && array[j-1] >0 ) || (array[j] < 0 && array[j-1]< 0)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
