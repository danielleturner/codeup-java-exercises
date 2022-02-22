package practice_projects;

public class ForLoopPracice
{

    public static void main(String[] args)
    {
        moonGravity();
        inchToMeterConvertre();


        // FizzBuzz test
//        int count = 0;

//        for(count = 0; count < 100; count++ )
//        {
//            if(count %3 == 0 & count %5 == 0)
//            {
//                System.out.println(count + " FizzBuzz");
//            }
//            else if(count %5 == 0)
//            {
//                System.out.println(count + " Fizz");
//            }
//            else if(count %3 == 0)
//            {
//                System.out.println(count + " Buzz");
//            }
//            else
//            {
//                System.out.println(count);
//            }
//        }
//        System.out.println("done");
//

    }

    public static void moonGravity(){

        double moonwieght = .17;
        double earthweight = 200;

        double convertWeight = earthweight * moonwieght;
        System.out.println("Your moon weight is: " + convertWeight + "lbs");


    }

    public static void inchToMeterConvertre(){

        double inches = 1;

        for(inches = 1; inches < 144; inches++){
            if(inches %12 == 0){
                System.out.println();
            }
            else
                System.out.println(inches);
        }
}

}

