package Lectures;

import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {
//        System.out.println(sumAll());



        // ARRAY.FIll()
        String[] languages = new String[]{"french", "Portguese", "Dutch"};
        System.out.println(Arrays.toString(languages));
        Arrays.fill(languages,"french");
        System.out.println(Arrays.toString(languages));

        // ARRAYS.EQUAL
        String[] answer = {"apart", "Learn", "knock"};
        String[] KenGuess = {"apart", "Learn", "knock"}; // --> because ken array is the same the boolean value is true
//        String[] KenGuess = {"texas", "green", "array"}; // --> because ken array is wrong it passes a false
        System.out.println(Arrays.equals(answer, KenGuess));
        // accepts two params
        // returns a boolean
        // BOOLEAN ARRAYS.EQUALS
        boolean isKenRight = Arrays.equals(answer, KenGuess);
//        System.out.println(isKenRight);

        // ARRAYS.COPYOF()
        String[] lauraCopy = Arrays.copyOf(answer, 2); // --> have to add the number to specify how many indexs you want.
        System.out.println(Arrays.toString(lauraCopy));

        // ARRAYS.sort(array name)
        String[] language = new String[]{"french", "Portguese", "Dutch"};
        Arrays.sort(language);
        System.out.println(Arrays.toString(language));


        // ARRAYS.sort(array name) <--- also can be used to sort numbers
        int[] random = {44,12,1,54,2};
        System.out.println(Arrays.toString(random));
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));



        // WHAT ARE ARRAYS
        // --> the length of the array need to be defined before using;
        // --> the type of elements going inside an array must be defined also
        // -->

        // HOW TO PROPERLY USE THEM IN JAVA

        //  CREATE AN ARRAY OF INTEGERS [texasTemps for 3 days]
        // SYNTAX
        int[] texasTemps = new int[3];
        // --> int[] -- type of array
        // --> texasTemps -- name of the array
        // --> new -- assigns the array to memory
        // --> int -- type of array
        // --> [3] -- length of array


        // asign values to area with below method
//        texasTemps[0] = 36;
//        texasTemps[1] = 45;
//        texasTemps[2] = 86;
//        System.out.println(texasTemps[0]);  // --> to print out array I must call it at it's index

        // --> Practice weatherType array
        // TODO: create an array of string that store 3 different weather string(sunny, rainy, etc.)
//        String[] weatherType = new String[3];
//        weatherType[0] = "sunny";
//        weatherType[1] = "cloudy";
//        weatherType[2] = "rainy";
//        System.out.println(weatherType[0]); // --> if array passed in the sout is greater than the size of the array it throws a  (outOfBounds Exception)
//        System.out.println(); // <-- this is how you print out the value of the array

        // HANDLING MULTIPLE ELEMENTS AT A TIME

        // TODO: create and array that hold my daily steps
        // data type of elements? long
        // data type - array
        // name the varaible that hold the array - dailysteps
        // data type of the variable (daily steps)
//        long[] dailysteps = {10000, 12000, 22000};
//        System.out.println(dailysteps[0]); //--> prints out -- 10000
//        System.out.println(Arrays.toString(dailysteps)); // <-- Here we can turn the data in to a string with this method --> prints out [10000, 12000, 22000]

        // TODO: create an array of ints and pring out the array
//        int[] nums = {400, 800, 1200, 1600};
//        System.out.println(Arrays.toString(nums));

        // HOW TO ITERATE THROUGH ARRAYS
        // TODO: create a method(nums) that returns the sum of all integers in an int array
        // [5,2,3,1] <-- output 11


//
//        public static int sumAll() {
//
//
//            int[] nums = {1, 2, 3, 4, 5}; // initialize array object
//            int sum = 0; // --> create holding variable for sum of result
//            for (int num : nums) { // --> this adds current element to previous element
//                sum += num; // the iteration is added here to the sum on first iteration --> iteration 1 will just have the sum = 1
//                // return sum;
//            }







        // --- PSEUDOCODE --- //
        // 1. create method (nums)
        // // what's the method signature --> the public static int
        // // // what data type if any is being retured from his method
        // 2. create an array of int
        // // 2a. What is the length of the array (5)
        // // 2b. Where does this array go --> in the method we are creating the sumAlll method
        // 3. Assign values to array
        // // 3a. how are we going to initialize teh array of ints
        // // // array literal -- {}
        // // // array declaration new
        // 4. iterate through our elements in the array
        // // 4a. how do you want to iterate?
        // // 4b. traditional FOR loop
//        String[] names = {"cody", "kenneth", "jordy", "laura"};
//        System.out.println(names.length);
//        for(int i = 0; i < names.length; i+= 1){
//            System.out.println(names[i]);
//        }
        // // 4c. enhanced for loop
//        String[] names = {"cody", "kenneth", "jordy", "laura"};
//        System.out.println(names.length);
//        for(String name : names) { // for (data and name of variable(this is always the singular version of the string) : name of the array were iterating through)
//            System.out.println(name);
//        }
        // 5. create a variable to hold the sum
        // // where does this variable live? --> this goes outside the loop
        // // what's this variable type 9int)
        // // what's variable starting point
        // 6. add logic that will add each element to itself
        // int sum;
        // // [1,5,3,2]
        // // sum variable = sum + index of element
        // first iteration: sum = 0 --> sum = 0 + 1 // sum = 1;
        // second iteration: sum = 1 --> sum = 1 + 5 // sum = 6;
        // 7. return sum
        // // where doe this return statement live? it lives in main method
        // 8. call method sout result in of sumAll method in psvm

        // // Let's create a method (nums) that returns the sum of all integers in an int array

        // TWO-DIMENSIONAL ARRAYS


    }
    }
//}
