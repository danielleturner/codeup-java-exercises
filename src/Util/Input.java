package Util;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);


    public static String getString(){

        Scanner scanner = new Scanner(System.in);

        String userinput = scanner.nextLine();
        return scanner.nextLine();

    }

    public int getInt(){

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter two integers: ");
//        int numbers = scanner.nextInt();
        String numInt = getString();
        return Integer.valueOf(numInt);

//        try{
//            return Integer.parseInt(getString());
//        }catch (NumberFormatException e){
//            System.out.println("Nubmer can't be parsed");
//            System.out.println("please enter a number");
//            return getInt();
//        }

    }


    public static boolean yesNo(){

        Scanner scanner = new Scanner(System.in);

        boolean Yes = true;
        boolean No = false;


        System.out.println("Is today Thursday? Yes or No ");
        boolean userInput = scanner.hasNext();

        if(userInput == Yes)
        System.out.println("Correct today is not thursday");
        else if(userInput == No){
            System.out.println("Correct it is Wednesday");
        }
            return userInput;
    }


    public static void getInt(int min, int max){
//        getInt(2, 5);

        Scanner scanner = new Scanner(System.in);

        int numBottom = 50;
        int numTop = 100;

        System.out.println("Please enter a number: ");
        int usernum = scanner.nextInt();

        if (usernum < numBottom){
            System.out.println("Your number is to low");
            System.out.println("Please pick another number");
            getInt(0, 0); // have user input another number
        }else if(usernum > numTop){
            System.out.println("Your number is too high");
            System.out.println("Please pick another number");
            getInt(0, 0); // have uer input another number
        }else if(usernum <= numBottom || usernum >= numTop){
            System.out.println();
        }else{
            System.out.println("Good job");
        }
    }

    public static double getDouble(double min, double max){

        Scanner scanner = new Scanner(System.in);

        double numLow = 10.91;
        double numHigh = 27.31;


        System.out.println("Please enter a double digit number followed by a decimal point and two additional numbers: ");
        double sumNum = scanner.nextDouble();

        if (sumNum < numLow){
            System.out.println("Your number is to low.");
            System.out.println("Please pick another number:");
            getDouble(0,0);
        }else if(sumNum > numHigh){
            System.out.println("Your number is to high.");
            System.out.println("Please pick another number: ");
            getDouble(0,0);
        }else if(sumNum <= numLow || sumNum >= numHigh){
            System.out.println();
        }else{
            System.out.println("Good Guess");
        }
        return sumNum;

    }

    public static double getDouble(){

        Scanner scanner = new Scanner(System.in);

        double low = 10;
        double high = 50;

        System.out.println("Please enter a double digit number: ");
        double newNum = scanner.nextDouble();

        try{
            return Double.parseDouble(getString());
        } catch (NumberFormatException e){
            System.out.println("Given input cannot be parsed as an double");
            e.printStackTrace();
            return getDouble();
        }

//        if (newNum < low){
//            System.out.println("Your number is to low.");
//            System.out.println("Please pick another number:");
//            getDouble(0,0);
//        }else if(newNum > high){
//            System.out.println("Your number is to high.");
//            System.out.println("Please pick another number: ");
//            getDouble(0,0);
//        }else if(newNum <= low || newNum >= high){
//            System.out.println();
//        }else{
//            System.out.println("Good Guess Skywalker");
//        }
//        return newNum;
    }

    public static void main(String[] args){
//        getString();
//        yesNo();
//        getInt();
//        getInt(3, 5);
//        getDouble(0,0);
        getDouble();

        Scanner scanner = new Scanner(System.in);



    }


}
