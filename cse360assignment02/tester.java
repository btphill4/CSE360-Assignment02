package cse360assignment02;
import cse360assignment02.*;

public class tester {

    public static void main(String[] args) {
        //initialize class
        AddingMachine test = new AddingMachine();

        //methods
        test.add(4);
        test.subtract(2);
        test.add(5);

        System.out.println(test.toString());

        test.clear();
        System.out.println(test.toString());
    }

}
