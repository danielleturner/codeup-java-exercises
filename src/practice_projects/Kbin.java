package practice_projects;

import java.io.IOException;

public class Kbin {

    public static void main(String[] args) throws IOException {

        char ch;
        System.out.print("Press a key followed by enter: ");
        ch = (char) System.in.read(); // THIS METHOD ALLOWS ME TO READ THE USERS KEY ENTRY ON THE KEYBOARD AND DISPLAY ON CONSOLE
        System.out.println("Your key is: " + ch);
    }
}
