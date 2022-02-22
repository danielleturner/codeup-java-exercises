package practice_projects;

public class BooleanDemo {

    public static void main(String[] args) {

        boolean b; //----> initializing boolean

        b = false; // ---> Here be is given the value of false
        System.out.println("b is " + b); // ---> the value of b is false so it output false instead of b.
        b = true;
        System.out.println("b is " + b);

        // A boolean value can control the if statement
        if(b) System.out.println("This is executed");

        // the outcome of relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
