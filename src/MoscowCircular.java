import java.util.Scanner;

public class MoscowCircular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int distance = ((v * t) % 109 + 109) % 109;

        System.out.println(distance);
    }
}
