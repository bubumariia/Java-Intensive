package Informatics;

import java.util.Scanner;

public class CheckingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswer = scanner.nextInt();
        int studentsAnswer = scanner.nextInt();

        if ((correctAnswer == 1 && studentsAnswer == 1) || (correctAnswer != 1 && studentsAnswer != 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
