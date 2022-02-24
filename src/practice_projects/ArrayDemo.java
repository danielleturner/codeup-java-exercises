package practice_projects;

public class ArrayDemo {

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
