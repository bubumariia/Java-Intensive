package Informatics;

import java.util.Scanner;

public class NumberTypeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int zeroCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < n; i++) {
            int N = scanner.nextInt();
            if (N == 0) {
                zeroCounter++;
            } else if (N > 0) {
                positiveCounter++;
            }else {
                negativeCounter++;
            }
        }
        System.out.println(zeroCounter + " " + positiveCounter + " " + negativeCounter);
    }
}
