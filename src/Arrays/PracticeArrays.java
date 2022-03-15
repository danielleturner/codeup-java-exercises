package Arrays;

public class PracticeArrays {
    public static class ArrayDemo {

        public static void main(String[] args) {

            int sample[] = new int[10]; // --> type of array | array name = new type[size]
            int i;

            for (i = 0; i < 10; i++) {
                sample[i] = i;
                // the for loop loops through the array and returns the following
                // after the initial loop it returns sample[0] = 0 <--- the reason for this is that the array is set to 0 --> i = 0
                // the second loop it returns sample which is the array name [what index it is at] = what index array is at
                // this step repeats until i reaches 10 since 10 is greater than 9 the loops stops at 9
                System.out.println("This is a sample[" + i + "]: " + sample[i]);
            }
        }


    }

    public static class TwoDimensionalArrays {

        public static void main(String[] args) {

//            even();
//            odd();
//            minMax();
//            numtwo();
            fibonacci();




//            int t, i; // --> here i'm intializing int i & t
//            int table [] [] = new int[3][4];
//
//            for(t = 0; t < 3; t++) {
//                for(i = 0; i < 4; i++){
//                    table[t] [i] = (t * 4) + i + 1;
//                    System.out.print(table[t] [i] + " ");
//                }
//                System.out.println();
//                System.out.println();
//            }
        }


        public static void even() {
            int sum = 0;

            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }


        public static void odd() {
            for (int i = 0; i < 30; i++) {
                int num = 0;
                if (i % 3 == 0) {
                    System.out.println("the number " + "" + i + "" + " can be divide by 3");
                } else {
                    System.out.println(i);
                }
            }
        }

        public static void minMax() {

            int num[] = {32, 54, 21, 97, -55, 21, 99, 23, 321};

            int min, max;
            min = max = num[0];

            for (int i = 1; i < 9; i++) {
                if(num[i] < min){
                    min = num[i];
                }
                if (num[i] > max) {
                    max = num[i];
                }
            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }

        public static void numtwo(){

            int num[] = {44,44,22,100,43};
            int sum = 0;

            for(int i = 0; i < num.length; i++){
                sum += num[i];
            }
            System.out.println("Hey " + sum / num.length);
        }

        public static void fibonacci(){
            int num = 0;
            int numtwo = 0;


            for(int i = 0; i < 5; i++){
                num = i;
                System.out.println(num);
                numtwo += num;
                System.out.println(numtwo);
            }


        }
    }
}






