package InClassAssignments;

import java.util.Arrays;

public class ArraysExercises {



    private static void addPerson(String chris, String cameron, String abraham) {

        System.out.println();
    }


    public static void main(String[] args) {



        String[] person = {"Danny", "Myah", "Camille"};

        Person[] personArray = new Person[3]; //---> this creates an array of 3 person

        Person person1 = new Person("Chris");
        Person person2 = new Person("cameron");
        Person person3 = new Person("Abraham");

        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;
        System.out.println(person2);


        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);

        }




    }



}
