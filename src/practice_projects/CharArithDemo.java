package practice_projects;

public class CharArithDemo {

    public static void main(String[] args) {

        char ch; // Here the ch is initialized

        ch = 'X'; // ----> Here ch is assigned the value of X
        System.out.println(ch); // ---> returns X

        ch++; // ---> ch can also be incremented......incrementing char makes it the following letter x the next letter would be y.
        System.out.println("ch is now " +  ch);

        ch = 90;
        System.out.println("ch is now " + ch);// ---> the value of ch is 90 however becaause ASCII value of 90 corresponds to the letter Z the valued is displayed as a letter instead of the actual number.
    }
}
