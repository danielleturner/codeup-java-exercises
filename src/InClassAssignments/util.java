package InClassAssignments;

import java.util.Scanner;

public class util {

    Scanner scanner = new Scanner(System.in);



    private class Input{

        Scanner scanner = new Scanner(System.in);

    }

    public static void main(String[] args) {
        getString();
        yesNo();
        getInt();
        getInt(3, 5);





        Scanner scanner = new Scanner(System.in);



    }

    public static void getString(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello nice to see you today. How are you doing? ");
        String userinput = scanner.nextLine();
        System.out.println(userinput);

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


    public static int getInt(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter two integers: ");
        int numbers = scanner.nextInt();
        System.out.println(numbers);
        return numbers;
    }

    public static int getInt(int min, int max){
//        getInt(2, 5);

        Scanner scanner = new Scanner(System.in);

        int numBottom = 50;
        int numTop = 100;

        System.out.println("Please enter a number: ");
        int usernum = scanner.nextInt();

        if (usernum < numBottom){
            System.out.println("Your number is to low");
            getInt(0, 0); // have user input another number
        }else if(usernum > numTop){
            System.out.println("Your number is too high");
            getInt(0, 0); // have uer input another number
        }if(usernum <= numBottom || usernum >= numTop){
            System.out.println("Good guess");
        }
        return getInt(0,0);


    }

}
