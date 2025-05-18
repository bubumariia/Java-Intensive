package www;

public class Main {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101); // it gets number from 0 to 100
        System.out.println(randomNum);

        // practice while
        int number = 5;
        while (number >= 1){
            System.out.println(number--);
        }

    }
}
