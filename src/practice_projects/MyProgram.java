package practice_projects;

import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {

        // Declare Variables
        String fName;
        String lName;
        String city;
        String state;
        int number;


        // Create new scanner input object instance
        Scanner input = new Scanner(System.in); /// in order to activate the input you need to use the scanner method


        // Ask user for their first and last name
        System.out.println();

        // First Name
        System.out.print("What is your first Name? ");
        fName = input.nextLine();

//        if (input !== ){
//            System.out.println("Please enter a number");
//        } else {
//            return;
//        }

        // Last Name
        System.out.print("What is your last Name? ");
        lName = input.nextLine();

        // Ask user for city and state
        System.out.print("What city do you live in? ");
        city = input.nextLine();
        System.out.print("What state you live in? ");
        state = input.nextLine();

        // Ask user for their age
        System.out.print("How old are you? ");
        Integer age = input.nextInt();

        if (age < 20) {
            System.out.println("Wow " +  fName + " " + lName + " you are a young buckaroo!");
        }
        if (age < 90) {
            System.out.println("Welcome to the green zone");
        } else {
            System.out.println("Well, hello there " + fName + " " + "my old friend! You are at a pretty ripe age of " + age + " " + "It's about time for you kick the bucket aye?");
        }
    }
}
