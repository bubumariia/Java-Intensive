package Informatics;

import java.util.Scanner;

public class GeometricProgressionOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 1;
        int term = 1;

        for (int i = 1; i <= n; i++) {
            term *= 2;
            sum += term;
        }

        System.out.println(sum);
    }
}
