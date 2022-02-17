/*-----Syntax, Types ona Variables---

Two main categories of data types: primitive and reference
primitive---- these data types are not objects. There only job is to store values of a specific type of [byte, short, int, long, float, double, char, boolean (see char in curriculum)]
----[byte all the way through doubles are dealing with only numbers]
----[char is a single character] 'would be declared with a single quote'
----[boolean true or false]
reference----
**/


public class SyntaxTypesVariables {

    public static void main(String[] args){
//        int myFavoriteNumber = 7; //1
//        System.out.println(myFavoriteNumber);

//      String myString = "Hey"; //2
//      System.out.println(myString);

//      String myString = "D";  //3
//      System.out.println(myString);  // throws and error due to myString being declared

//        String.myString = 3.14159;  //4
//        System.out.println(myString);

//      long myNumber; //5
//      System.out.println(myNumber); // Here the myNumber has no value so it shows red and can't be consoled.

//       float myNumber = 3.14F;  //6
//       System.out.println(myNumber);
       // In order to get this run you need to put an F at the end to say it's a float
       // long can not store [a number with a decimal] you would have to use a double
       // java: incompatible types: possible lossy conversion from double to long it
        // corresponds to the possibility of losing the value or precision of a variable while converting one type to another.

//        long myNumber = 123L; // 7
//        System.out.println(myNumber); // prints out only the number 123 even thought there is an L. The L is for long and it's used just in case there is longer math space neede

//        long myNumber = 123; // 8
//        System.out.println(myNumber);

//        float myNumber = 3.14; // 9  // number has to be a single digit to fix you can add a f after 3.14 or change it to a double
//        System.out.println(myNumber);

//        int x = 5; // 10
//        System.out.println(x++);
//        System.out.println(x);  // increments the number 5 by one giving the number 6 in console

//        int x = 5; // 10
//        System.out.println(++x);
//        System.out.println(x); // increments the number 5 by one -- no matter where the x is place either before the plus-plus or after it will always increment it by one

//        int class = 21; // 11   // class does not work reserved word

//        String theNumberThree = "three"; // 12  neither of the code blocks work due to casting
//        Object o = theNumberThree;
//        int three = (int) o;

//          int three = (int) "three"; // 13   neither of these codeblocks work

//        int x = 4;  // Below 14
////        x = x + 5;
//          x += 5;
//        System.out.println(x);
//
//        int x = 3;
//        int y = 4;
////        y = y * x;
//         y *= x;
//        System.out.println(y);
//        int x = 10;
//        int y = 2;
//        x = x / y;
//          x /= y;
//        System.out.println(x);

//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
////        x /= y;
//        x -= y;
//        System.out.println(x);
//        System.out.println(y);

// Class Explanation below exercises above//


//       int myFavoriteNumber = 18;             // in order to declare a variable you must declare it's type first
//                                             // this way is also used int myFavoriteNumber; next line below myFavoriteNumber = 18;
//        System.out.println(myFavoriteNumber);
//
//        // storing a favorite letter
//
//        char myFavoriteLetter = 'D';
//        System.out.println(myFavoriteLetter);
//
//        // boolean
//
//        boolean isSunny = true;  // boolean values have to be written lowercase
//        System.out.println(isSunny);

        // good to know
        // int --> primitive type / not an object
        // Integer --> object / give us access to manipulate the Integer as an object

        // double --> primitive
        // Double --> Object / give us access to manipulate the Integer as an object

        // char --> primitive
        // Character --> Object / give us access to manipulate the Integer as an object

        // Strings --> in java are not primitive
        // Example
//        String school;
//        school = "CodeUp";           //now assign a value or initalize the variable --> now CodeUp becomes a identifier after it has a value
//        System.out.println(school);

        // escaping characters
        // ---->  "\"" // => "
        // --->  "\\" // => \
        // --->  "\n" // => the newline character
        // --->  "\t" // => the tab character

        /*Reserve Words*/ //---> Words that can't be used

        /*abstract continue for new switch assert default goto package synchronized boolean do if private this break double implements protected throw byte else import public throws case enum instanceof
        return transient catch extends int short try char final interface static void class finally long strictfp volatile const float native super while*/

        /*Arithmetic Expressions*/
        // Store the number 3 and 9

//        int firstNumber = 3;
//        firstNumber++; // increments number by one
//        int secondNumber = 9;
//        secondNumber--; // decrements number by one
//        int result = firstNumber + secondNumber;
//        System.out.println(result);
//
//        byte firstNum = 125;
//        byte secondNum = 120;
//        int total = firstNum % secondNum;
//        System.out.println(total);

        // Constants
        // final keyword ----> can not re-assign the variable to anything else

        // Casting --->  is converting a value of one data-type into another data-type
        // a byte can be cast to a short but a short cannot be cast into a byte
        // byte	    1	Very short integers from -128 to 127
        // short	2	Short integers from -32,768 to 32,767

//         // example
//        int myInteger = 900;
//        long morePrecise = myInteger;
//
//        System.out.println(myInteger);
//        System.out.println(morePrecise);
//
//        //example 2
//        double pi = 3.14159;
//        int almostPi = (int) pi;
//
//        System.out.println(pi);
//        System.out.println(almostPi);

        // int myNumb = 18;
        // myNum + 2;





    }
}
