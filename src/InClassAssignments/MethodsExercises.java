package InClassAssignments;

import java.util.Scanner;

public class MethodsExercises {

static final long randomNum = Math.round(Math.random()*100); // random number generator


    public static void main(String[] args) {

//        System.out.println(addNum(5, 5));
//        System.out.println(subNum(25, 20));
//        System.out.println(multiply(5, 5));
//        System.out.println(divide(70, 10));
//        System.out.println(modules(5,2));
//        recmul(5);
//        factorial(5);
//        factorials(5);
//        factorialTable(5);
//        diceSide(5);
        highLow();
    }


    public static int addNum(int num1, int num2){
        return num1 + num2;
    }

    public static int subNum(int sub1, int sub2){
        return sub1 - sub2;
    }

    public static int multiply(int mul1, int mul2){
        return mul1 * mul2;
    }

    public static int divide(int div1, int div2){
        return div1 / div2;
    }

    public static int modules(int mod1, int mod2){
        return  mod1 % mod2;
    }

    public static void recmul(int n){

        if (n >= 100){
            System.out.println("Good to Go");
            System.out.println();
            return;      //----> Here i'm going to break out the loop
        }
        System.out.println(n);
        recmul(n * 2);
    }



    public static void factorials(int count){

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter an integer from 1 to 10: ");
        int userInput = scanner.nextInt();

        System.out.print("Do you want to continue? [y/N] ");
        String input = scanner.next();

        int fact = userInput * userInput;

        if(input.equalsIgnoreCase("y"))
            System.out.printf("The factorial for !%s is: %s \n", userInput, fact);

    }

    public static void factorialTable(int userInt){
        long fact = 1;
        for(int i = 1; i <= userInt; i++){
            fact = fact * i;
            System.out.printf("%d! = %d\n", i, fact);
        }
    }

    public static void diceSide(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides for a pair of dice?");
        int input = scanner.nextInt();


        long diceOne = Math.round(Math.random()* input);
        System.out.printf("Dice 1 equals %s\n", diceOne);

        long diceTwo = Math.round(Math.random()* input);
        System.out.printf("Dice 2 equals %s\n", diceTwo);



        System.out.print("Do you want to continue? [y/N] ");
        String response = scanner.next();

        if(response.equalsIgnoreCase("y")){
            System.out.println("cool");
            diceSide();
        }else
            System.out.println("Are you afraid...chicken");

    }

    public static void highLow(){

        Scanner scanner = new Scanner(System.in);
//        System.out.println(randomNum);

        System.out.println("Guess a number between 1 - 100: ");
        double input = scanner.nextDouble();


            if(input == randomNum){
                System.out.print("GOOD GUESS GRASSHOPPER");
            }else if(input < randomNum){
                System.out.println("HIGHER");
                highLow();
            }else if(input > randomNum) {
                System.out.println("LOWER");
                highLow();
            }

    }


}
