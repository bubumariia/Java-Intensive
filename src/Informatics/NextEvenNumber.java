package Informatics;

import java.util.Scanner;

public class NextEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
         // first variant
//        number += 1;
//        while(number % 2 != 0 ){
//              number++;
//        }
//        System.out.println(number);

        // second variant
        int nextEven = number + 2 - (number % 2);
        System.out.println(nextEven);
    }
}
