import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber =  scanner.nextInt();

        if(firstNumber > secondNumber){
            System.out.println(1);
        }else if(firstNumber == secondNumber){
            System.out.println(0);
        }else{
            System.out.println(2);
        }
    }
}
