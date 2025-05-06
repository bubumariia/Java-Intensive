import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstRow = scanner.nextInt();
        int firstColumn = scanner.nextInt();
        int secondRow = scanner.nextInt();
        int secondColumn = scanner.nextInt();

        if (firstRow == secondRow || firstColumn == secondColumn){
            System.out.println("YES");
        }else{
            System.out.println("NO");

        }


    }
}
