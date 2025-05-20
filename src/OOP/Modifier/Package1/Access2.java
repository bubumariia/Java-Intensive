package OOP.Modifier.Package1;

public class Access2 {


    public static void main(String[] args) {
        Access1 h = new Access1();
        Access1 min = new Access1();


        System.out.println(h.hours);
        System.out.println(min.minute);
    }
}

/*public	The code is accessible for all classes
private	The code is only accessible within the declared class
default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter	*/

