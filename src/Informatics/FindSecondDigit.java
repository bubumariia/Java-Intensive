package Informatics;

import java.util.Scanner;

public class FindSecondDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number / 10) % 10);
    }
}
