package practice_projects;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 7; // this variable is defined in vehicle.java and can be accessed from her by using a public.int passengers on the passenger int in vehicle.java
        minivan.fuelcap = 16;
        minivan.mpg = 21;


        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("minivan can carry " + minivan.passengers + " with a range of " + range + " miles");


    }
}
