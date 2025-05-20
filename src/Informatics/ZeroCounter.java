package Informatics;

import java.util.Scanner;

public class ZeroCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++){
            int N = scanner.nextInt();
            if (N == 0){
               counter++;
            }

        }
        System.out.println(counter);
    }
}
