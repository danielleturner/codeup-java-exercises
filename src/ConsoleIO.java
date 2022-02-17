import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args){ // shorthand for this method is psvm



        //  Another method we can use is System.out.printf[f stands for format]. This allows us to define a string with placeholders and then pass values for those placeholders.

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n danny", name); // %s sign means that a string will be place at that point. %n neans the line will break at this point Always remember to add the string identifier at the end

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s! ", greeting, name); // the way the string will be passed depends on the way it is listed in the printf()

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
