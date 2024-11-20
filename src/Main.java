//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Implicit casting(Automatic Casting)
        int myInt  = 10;
        double myDouble = myInt;
        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);

         //Explicit casting
        double myDouble1 = 10.8f;
        int myInt1 = (int)myDouble1;
        System.out.println("myInt1 = " + myInt1);
        System.out.println("myDouble1 = " + myDouble1);
    }
}