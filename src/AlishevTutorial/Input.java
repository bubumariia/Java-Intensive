package AlishevTutorial;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name and age");
        String name = s.next();
       int number = s.nextInt();
        System.out.println("Your name is " +name + " and you're " + number + " years old");

    }
}
