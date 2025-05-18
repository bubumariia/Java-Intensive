package www;

public class Main {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101); // it gets number from 0 to 100
        System.out.println(randomNum);

        // practice while
        int number = 5;
        while (number >= 1){
            System.out.println(number--); // it prints numbers from 5 to 1
        }

        // practice Array
        String[] names = {"Nurs", "Mariia", "Pipow"};
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]); // it prints all the names
        }
        // multidimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // it prints 7

    }


}
