package InClassAssignments;

import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int myNum = 5; // 1a
//        while (myNum < 15)
//        {
//            myNum++;
//            System.out.println("My number is now: " + myNum);
//        }


        // Do while
//        int numUp = 0; // 1b first point
//            // tells the loop what i want it to do
//        do {
//            System.out.println(numUp);
//            numUp +=2;
//        }while(numUp < 100);
//            // this is my final outcome I want to achieve




//        int newNum = 100; // 1b second point
//        do {
//            System.out.println(newNum);
//            newNum -=1;
//        }while(newNum >= -10);
//        {
//            System.out.println("Way to go");
//        }



//        double num2 = 2;
//        double counter = 0;

//        do{ // 1b third point
//            System.out.println(num2);
//            num2 *= num2;
//        }while(num2 <= 1000000);

//        for(num2 = 2; num2 < 1000000; num2 *= 2) // 1b fourth point
//        {
//            System.out.println(num2);
//        }

        // Number 2

//        int num = 0;
//        for(num = 0; num < 100; num++){ // this is going to create the loop through 100
//            if( num % 3 == 0 && num % 5 ==0)
//            {
//                System.out.println("FIzzBuzz");
//            }
//            else if (num % 3 == 0)
//            {
//                System.out.println("Fizz");
//            }
//            else if(num % 5 == 0)
//            {
//                System.out.println("buzz");
//            }else {
//                System.out.println(num);
//            }
//        }

        // Number 3


//        Scanner scanner = new Scanner(System.in);
//
//
//
//        System.out.print("Please enter an integer between 1 and 5: ");
//        int userInput = scanner.nextInt();
//
//        int startValue = userInput;
//        System.out.println("You entered the number: " + startValue);
//
//        for(startValue = startValue; startValue <= 5; startValue++)
//        {
//            System.out.println("number |"  + " squared |" + " cubed" );
//            System.out.println(startValue +  "      "  + "|" + " " + startValue*startValue + "       " + "|" + " " + startValue*startValue*startValue);
//        }



        // Numbrt 4.

        Scanner scanner = new Scanner(System.in);

        double gradeA = 88;
        double gradeB = 80;
        double gradeC = 67;
        double gradeD = 60;
        double gradeF = 50;

        System.out.print("Please enter a numerical grade from 1 to 100: ");
        double grade = scanner.nextDouble();

        System.out.print("Do you want to know your letter grade: [y/N]");
        String userInput = scanner.next();
//        System.out.println(userInput);
        if(userInput.equals("y"))
        {
            if(grade >= gradeA)
            {
                System.out.print("Good job skywalker you got an A. May the force be with you!" );
            }
            else if (grade >= gradeB)
            {
                System.out.print("Good job young patawan you got a B! Trained hard see I");
            }
            else if (grade >= gradeC)
            {
                System.out.print("Hmmm train harder do you. You got a C");
            }
            else if (grade >= gradeD)
            {
                System.out.print("Be careful young Anakin the the darkside may be upon you it may");
            }
            else if (grade <= gradeF)
            {
                System.out.print("You have turned to darkside luke, you shall be know as darthvader.....You shall not pass!");
            }
        }else {
            System.out.print("Hmmm, afraid are you young skywalker");
        }
    }
}
