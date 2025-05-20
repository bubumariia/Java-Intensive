package Informatics;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= a;
            sum += term;
        }

        System.out.println(sum);
    }
}
