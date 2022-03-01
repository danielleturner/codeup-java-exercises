package InClassAssignments;

import java.util.*;

public class WarmUpExercise1March {

    public static void main(String[] args) {

        // TODO: Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
        //example: [2,4,8,5,1,2];
        //output; [6,16]
        //reason: 2+4+8+2 = 16
        //5+1 = 6

        int[] array1 = new int[5];
        int[] oddEven = new int[2];

        array1[0] = 21;
        array1[1] = 72;
        array1[2] = 12;
        array1[3] = 18;
        array1[4] = 4;

        int odd = 0;
        int even = 0;

        for (int num : array1) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        oddEven[0] = odd;
        oddEven[1] = even;
        System.out.println("should be 6,11");
        System.out.println(Arrays.toString(oddEven));


    }

}
