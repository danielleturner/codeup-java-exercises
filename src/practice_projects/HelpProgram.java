package practice_projects;

import java.io.IOException;

public class HelpProgram {

    public static void main(String[] args) throws IOException {

        char choice; // initialize variable choice

        System.out.println("help on: ");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print(" Choose one: ");

        choice = (char) System.in.read();  // System.in.read() allows me to record the user selection on keyboard

        switch (choice) // switch statement is going to allow me to display a default message for unlisted statements
        {
            case '1':
                System.out.println("The if statement:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch statement:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }

    }
}
