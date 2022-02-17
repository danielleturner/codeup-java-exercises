import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        boolean a = input.hasNextInt();
//        if (a == true) System.out.println("True");
//        else System.out.println("False");

        double pi = 3.14159;


//        System.out.print("How do you measure a circle? ");  //1
//        String userInput = input.next();
//        System.out.println("You entered:    " + userInput + " ");
//        System.out.println("If you entered: " + pi + " You answered correctly");
//        System.out.println("If you entered anything other " + pi + " you are incorrect");


//        System.out.print("Please enter a word: "); //2
//        String userInput = input.next();
//        System.out.print("Please enter another word: ");
//        String secondWord = input.next();
//        System.out.print("Please enter on final word: ");
//        String thirdWord = input.next();
//
//
//        System.out.printf("The first word you entered was: %s%nThe second word you entered was %s%nThe third word you entered was: %s", userInput, secondWord, thirdWord);

//          System.out.print("Please enter your favorite quote in quotations:");
//          String myString = input.next(); // .next() terminates the line after any whitespace
//          System.out.println(myString);

//        System.out.print("Please enter your favorite quote in quotations: ");
//        String myString = input.nextLine(); // .nextLine() terminates the line after any whitespace
//        System.out.println("Your favorite quote is:  " + myString);



          // input length of room
          System.out.print("Please enter the length of your room: ");
          String length = input.nextLine();
          System.out.println("The length of your room is: " + length);

          // input width of room
          System.out.print("Please enter the width of your room: ");
          String width = input.nextLine();
          System.out.println("The width of your room is: " + width);

          // Ask user if they want to know the square foot of room
         System.out.print("Would you like to know the square footage of your room? ");
         String myInput = input.nextLine();

         // Total square footage of room
//        int footage = width  length;
        Integer.parseInt(length);
        System.out.println(length);
        Integer.parseInt(width);
        System.out.println(width);


        System.out.print("The total square feet of your room is " + footage );

//         Integer footage = input.nextInt();

//         if (footage > 0) {
//             System.out.println("The total square footage of your room is " + );
//
//         }










    }

}
