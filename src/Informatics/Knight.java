package Informatics;

import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row1 = scanner.nextInt();
        int column1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int column2 = scanner.nextInt();

        if ((Math.abs(row1 - row2) == 2 && Math.abs(column1 - column2) == 1) ||
                (Math.abs(row1 - row2) == 1 && Math.abs(column1 - column2) == 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
