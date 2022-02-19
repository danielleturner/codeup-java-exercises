package practice_projects;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(factorial(5));


    }

    public static long factorial(int userInt){
        long fact = 1;
        for(int i = 1; i <= userInt; i++){
            fact = fact * i;
        }
        return fact;
    }


}
