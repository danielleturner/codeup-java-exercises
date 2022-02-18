package InClassAssignments;

import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {


        String myquestion = "Hey Bob are you ok?";

        Scanner input = new Scanner(System.in);

        System.out.print("Hey Bob are you ok?");
        String response = input.next();



        if (response.equalsIgnoreCase("sure"))
            System.out.println("Why are you late for work then?");
        else if(response.equalsIgnoreCase("no"))
            System.out.println("What's wrong");


        System.out.print("Do you want to talk about it? [y/N] ");
        String userInput = input.next();
        if (userInput.equalsIgnoreCase("y"))
            System.out.println("Ok, let's talk");
        else if(userInput.equalsIgnoreCase("N"))
            System.out.println("Well why are you late?");


        System.out.print("Do you want to talk about it? [y/N] ");
        String response1 = input.next();
        if(response1.equalsIgnoreCase("n"))
            System.out.println("I'm not paying you to be late you're fired");
        else if(response1.equalsIgnoreCase("y"))
            System.out.println("Whoa, chill out");


        if (response.equalsIgnoreCase("sure"))
            System.out.println("Fine, be that way");
        else if(response.equalsIgnoreCase("sure"))
            System.out.println("  ");

        if (response.equalsIgnoreCase(" "))
            System.out.println(" ");
        else if (response.equalsIgnoreCase("  "))
            System.out.println("Whatever");
        else
            System.out.println();


    }
}
