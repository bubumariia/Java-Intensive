package Informatics;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++){
            double sqrt = Math.sqrt(i);
            if(sqrt == Math.floor(sqrt)){
                System.out.println(i);
            }
        }
    }
}
