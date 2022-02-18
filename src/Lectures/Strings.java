package Lectures;

import java.util.Locale;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // String in java are primitive/object
        // if use == signs to compare string will always get true because this way just compares objects
        // The value of string can not change they are immutable. So you can not reassign the string object value

        // String Manipulation Methods

        // char charAt(int index) --> Returns the character at the specified index of the string.
        // int indexOf(String subString) --> Returns the index of the first occurrence of a certain substring. Returns -1 if the substring is not found.
        // int lastIndexOf(String subString) --> Like indexOf, but starts the search from the end of the string.
        // int length() --> Returns the length of a string.
        // String replace(String pattern, String replacement) --> Returns a copy of the string that has pattern replaced with replacement.
        // String substring(int beginIndex[, int endIndex]) --> Returns a new substring that starts at a specified index and (optionally) ends at the specified index.
        // String toLowerCase() --> Returns a string that has all lower case letters.
        // String toUpperCase() --> Returns a string that has all upper case letters.
        // String trim() --> Returns a copy of the string without leading and trailing whitespaces.

//        String myName = "Danny";
//        String otherName = "danny";

//        if (myName.equals(otherName))
//            System.out.println("names match");
//        else
//            System.out.println("doesn't match");

//        if(myName.startsWith("d")) // ------ startsWidth method just checks the letter the object starts with
//            System.out.println("Ohh Happy Days");
//        else
//            System.out.println("Not so Happy Days");

//        if(myName.endsWith("d")) // ------- endsWith method just checks the last letter of the object
//            System.out.println("Ohh Happy Days");
//        else
//            System.out.println("Not so Happy Days");

//        if(myName.equalsIgnoreCase(otherName)) // ---- here this method just checks to see if all charachters in the object are the same disregaurding the if it's upper or lower case
//            System.out.println("Ohh Happy Days");
//        else
//            System.out.println("Not so Happy Days");
//
//        String greeting = "Hello";
//        greeting = greeting + " there!";
//        System.out.println(greeting);

        // String Manipulation Methods

        String sentence = "The quicka browna foxa jumpedaa over the lazy dog.";
        System.out.println(sentence.charAt(0)); // the letter T is at the position of 0 charAt()int index ---> finds character at a position
        char findingChar = sentence.charAt(8); // here I assigne the char at position 8 to a variable
        System.out.println(findingChar);

        // indexOf(String subString) --> finds first occurenece of string pased in returns int value
        System.out.println(sentence.indexOf("quick")); // return the number 4 because the word quick begins at the 4 position --> if something is not there returns a number -1
        int indOf = sentence.indexOf("j");


        // lastIndexOf --> returns int at the last match or returns a number -1
        System.out.println(sentence.lastIndexOf("a"));

        // .lenght() --> doesn't accept params, returns total number of characters as int (starts at 1)
        System.out.println(sentence.length());

        // .replace(String--what we are replacing then pass in what we are replacing it with) --> returns the whole string with the replaced item(s)
        System.out.println(sentence.replace("quicka", "quick"));

        // String substring
        System.out.println(sentence.substring(5,10)); // prints from index before 5 which is u and stops before the index of 10 which is 9 because index start from 0

        // .toLowerCase
        System.out.println(sentence.toLowerCase(Locale.ROOT));

        // .toUpperCase
        System.out.println(sentence.toUpperCase(Locale.ROOT));

        // String trim ---> trims out any white space
        System.out.println(sentence.trim());




    }
}
