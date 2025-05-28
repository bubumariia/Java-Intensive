package AlishevTutorial;

public class Lesson23 {
    public static void main(String[] args) {
        String x = new String("Nurs");
        String y = "Bob";
        String z = x.toUpperCase(); // immutable
        System.out.println(z);


        StringBuilder sb = new StringBuilder("Hello"); // mutable
        System.out.println(sb.toString());
        sb.append(" World!");
        System.out.println(sb);



    }
}
