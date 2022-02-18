package practice_projects;

import java.io.IOException; // built in java exception

public class GuessLetterGame {

    public static void main(String[] args) throws IOException {

        char ch, answer = 'K';

        System.out.print("I'm thinking of a number between A and Z. ");
        System.out.print("Can you guess it? ");

        ch = (char) System.in.read(); // this statement allows me to read from the keyboard
        if(ch == answer) System.out.print("Right");
        else System.out.print("wrong grass hopper");
        if(ch < answer) System.out.println(" too low");
        else System.out.print(" too high");
    }
}
