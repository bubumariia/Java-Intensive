import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        if (reversed.equals(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");

        }
    }

}
