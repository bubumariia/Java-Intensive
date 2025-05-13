import java.util.Scanner;
//Write a function to find the length of a string and print each character on a new line.
public class PrintEachChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
