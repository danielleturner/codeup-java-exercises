package practice_projects;

import java.sql.SQLOutput;

public class GalToLitTable {

    public static void main(String[] args) {

        double gallons, liters;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 20; gallons++ ) {
            liters = gallons * 3.7854; // this converts gallons to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;

            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
