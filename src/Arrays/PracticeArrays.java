package Arrays;

public class PracticeArrays {
    public static class ArrayDemo {

        public static void main(String[] args) {

            int sample[] = new int[10]; // --> type of array | array name = new type[size]
            int i;

            for(i = 0; i < 10; i++){
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

            int t, i; // --> here i'm intializing int i & t
            int table [] [] = new int[3][4];

            for(t = 0; t < 3; t++) {
                for(i = 0; i < 4; i++){
                    table[t] [i] = (t * 4) + i + 1;
                    System.out.print(table[t] [i] + " ");
                }
                System.out.println();
            }
        }
    }
}
