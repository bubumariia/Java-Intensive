package Informatics;

import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int N = scanner.nextInt();
            sum += N;
        }
        System.out.println(sum);
    }
}
