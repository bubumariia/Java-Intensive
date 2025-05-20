package Informatics;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        while (number != 0){
            int digit = number % 10;
            counter += digit;
            number = number / 10;

        }
        System.out.println(counter);


    }
}
