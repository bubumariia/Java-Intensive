import java.util.Scanner;

public class MoscowCircular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println((v * t ) % 109);
    }
}
