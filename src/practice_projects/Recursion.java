package practice_projects;

public class Recursion {


    public static void main(String[] args) { // THE WAY THIS RECURSION METHOD WORKS
//        factorial(5);
        factorialTable(5);

//        sayHi(5); // N IS SET TO 5
//        addNum(5);


    }

    public static void sayHi(int n){ // HERE N IS EQUAL TO 5 BECAUSE IN THE MAIN METHOD N WAS SET TO EQUAL 5
        if (n == 0){ // IN THIS CONDITIONAL STATEMENT N IS NOT EQUAL TO ZERO SO BECAUSE THIS IS FALSE WE GO TO THE ELSE STATEMENT
            System.out.println("Done");
        }else {
            System.out.println("hi");
            n--; // SINCE N IS NOT EQUAL TO 5 HERE WE DECREMENT BY ONE AND START THE IF STATEMENT OVER AGAIN ONCE IN IS EQUAL TO ZERO WE PRINT HI
            sayHi(n);
        }
    }
        // Recursion needs a base case and if statement

    public static void addNum(int z){

        int myfirst = 1;
        int mysecond = 2;
        int mythird = 6;
        int myfourth = 24;

        if (z == 0){
        }else {
            System.out.printf("%s! = 1           = 1\n", myfirst);
            z--;
            addNum(z);
        }
    }

    public static void factorialTable(int userInt){
        long fact = 1;
        for(int i = 1; i <= userInt; i++){
            fact = fact * i;
            System.out.printf("%d! = %d\n", i, fact);
        }
    }


}
