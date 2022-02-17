package Lectures;

import java.util.Scanner;

public class ControlStatementsAndLoops {


    public static void main(String[] args) {


        // CONTROL STATEMENTS
        // allows us to control the flow of the code
        // operators -- tools needed to control the flow
        // ==, !=, >, < <=,, >+ // operators

        // boolean expression
        // java statement that results in either true or false

        // EXAMPLE 1
//        int myFavoriteNum = 18; // statement
//        boolean yorn = myFavoriteNum > 0; // yorn ---> Yes or No --> also in order to get a true or false statement the identifier must be declared as a boolean
//        System.out.println(yorn);

        // Logical Operators
        // &&, |, $, !

        // if statements
//        int age = 11;
//        int bmi = 20;
//        String myHair = "curly";
//        String yourHair = "straight";
//        if(myHair == yourHair){  // in order to compare a string to
//            System.out.println("Curly Hair!!");
//        } else {
//            System.out.println("Not so curly");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();
//        // Don't do this!
//        // boolean confirmation = userInput == "y";

        if(userInput.equals("y")){ // use the .equals TO COMPARE A STRING TO A STRING
            System.out.println("yes continue");
        } else {
            System.out.println("Don't continue");
        }

//        String myName = "Danny";
//        String yourName = "Tom";
//
//        boolean nameMatching = myName.equals(yourName);
//        System.out.println(nameMatching); // false
//
//        boolean nameNoCase = myName.equalsIgnoreCase(yourName);
//        System.out.println(nameNoCase); // true
//
//        boolean bothNames = myName == yourName;
//        System.out.println(bothNames); // false


//        LOOPS
//        iterating through an index/array


//        FOR LOOPS
//        for(int i = 0; i < 10; i++) { // when looping with java to loop through numbers we have to use the int value
//            System.out.println("i is currently at : " + i);
//        }

//        WHILE LOOP
//        not sure how many times it will loop
//        check the condition first before it starts looping
//        int i = 0; // while using while loop need to give a value to the variable
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        DO WHILE
//        executes code once before checking
        int counter = 0;
        int i = 0;
        do{
            System.out.println("i: " + 10);
            i++;
            if(i == 4){

//               break; // break method allow code to break out of code as a specified point
            }
        }
        while (i < 10);
        {
            i++;
            System.out.println("WHILE i is: " + i);
            if(i % 2 == 0 ){
                counter += 2;
//                continue;
            }
            System.out.println("counter: " + counter);
        }




    }
}
