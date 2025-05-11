import java.util.Scanner;

public class SignumFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if( number > 0){
            System.out.println(1);
        }else if (number == 0){
            System.out.println(0);
        } else  {
            System.out.println(-1);
        }
    }
}
