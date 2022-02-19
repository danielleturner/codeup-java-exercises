package InClassAssignments;

import java.util.Scanner;

public class MethodsExercises {




    public static void main(String[] args) {

//        System.out.println(addNum(5, 5));
//        System.out.println(subNum(25, 20));
//        System.out.println(multiply(5, 5));
//        System.out.println(divide(70, 10));
//        System.out.println(modules(5,2));
//        recmul(5);
//        calculateNum();
//        calculateNum();
        System.out.println(getFactorial(5));
        System.out.println("Factorials using recursive method.");
        System.out.println(getIterativeFactorial(6));


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

    public static void calculateNum(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 10: ");
        int lum1 = scanner.nextInt();
        System.out.println(lum1);
        System.out.print("Do you want to talk about it? [y/N] ");
        String input = scanner.next();


        if(input.equalsIgnoreCase("y"))
            System.out.println("standby");

    }

    public static int getFactorial(int n){

        if (n < 0) return -1;
        else if (n < 2) return 1;
        else return (n * getFactorial(n-1));
    }

    public static int getIterativeFactorial(int n){
        if (n < 0) return -1;
        int fact = 1;
        for (n = 1; n <= 5; n++)
            fact *=1;
        return fact;
    }

}
