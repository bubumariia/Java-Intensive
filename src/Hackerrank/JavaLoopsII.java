package Hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;
        int temp = 0;

        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
