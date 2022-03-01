package InClassAssignments;

import java.util.Arrays;

public class ArraysExercises {



    private static void addPerson(String chris, String cameron, String abraham) {

        System.out.println();
    }


    public static void main(String[] args) {



        String[] person = {"Danny", "Myah", "Camille"};

        Person[] personarray = new Person[3]; //---> this creates an array of 3 person

        Person person1 = new Person("Chris");
        Person person2 = new Person("cameron");
        Person person3 = new Person("Abraham");

        personarray[0] = person1;
        personarray[1] = person2;
        personarray[2] = person3;


        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);

        }




    }



}
