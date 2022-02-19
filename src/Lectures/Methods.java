package Lectures;

import java.util.Scanner;

public class Methods {



    public static void main(String[] args) {

        count(5);

//        sayHello(5);
//        sayHello("Danny");
//        sayHello("hello", "again");
//        sayHello();
    }
//        sayHi();
//        System.out.println(sayHello(" Danny"));
//        System.out.println(greetings(""));
//        System.out.println(addNum());
//
//
//    }
//
//    public static void sayHi(){ // in order to call this method you have to call it in the main method
//        System.out.println("hi!");
//
//        // say hi is the name of our method
//        // public --> can be accessed from other packages and classes
//        // static --> not declaring specific primitive type
//        // void/sting/int --> return type
//    }
//
//    public static String sayHello(String name){
//        return "Hello!" + name; // in order to get the output it has to be put in main method wrapped in sout
//    }
//
//    // 1. Write a method that accepts username from input and returns hello user input
//
//    public static String greetings(String name){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("hello, what is your name?");
//        String userInput = scanner.next();
//        return "Hello," + userInput;
//    }
//
//
//    // using this method I add two numbers from a user input
//    public static int addNum(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter one number: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Please enter another number: ");
//        int num2 = scanner.nextInt();
//        return num1 + num2;
//    }

    // METHOD OVERLOADING ---> Methods that are within one main class and have the same name but accepts different arguments and parameters

    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//
//
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//
//
//
//    // version 3
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//
//
//
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }
//
//
//    // method signature is what is living before the parenthesis
//    public static void multipy(int num1, int num2){
//        System.out.println(num1 * num2);
//    }
//
//   public static void multiply(float float1, float float2){
//       System.out.println(float1 * float2);
//   }
//
//   public static void multiply(int intnum1, int intnum2){
//       System.out.println(intnum1 * intnum2);
//   }

    // RECURSION
    // often have infinite loops unless break/ stopping point/
//    public static void sayHello(){
//        sayHello();
//    }

    public static void count(int n) { //---> The method count is recursive because it calls itself,
        if (n <= 0) {                 //---> and will continue to call itself with an argument of 1 less that the value that was originally passed [recursion basically is a loop that loops itself]
            System.out.println("All done!");
            return; // return ---> exits the method to stop the infinite loop MUST PUT THIS IN
        }
        System.out.println(n);
        count(n - 1);
    }

}

