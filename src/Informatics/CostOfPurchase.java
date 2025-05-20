package Informatics;

import java.util.Scanner;

public class CostOfPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println((a * n )+((b*n )/ 100) + " " + (b*n )% 100);
    }
}
