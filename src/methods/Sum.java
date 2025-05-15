package methods;

import javax.xml.transform.Source;

public class Sum {
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(23,33));
        System.out.println(sum(3.0 , 4.0));
    }
}
