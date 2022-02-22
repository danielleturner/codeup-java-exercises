package practice_projects;

public class inches {

    // Demonstration on usage of long int type

    public static void main(String[] args) {

        long ci; // here long is used due to the number of inches in a mile
        long im; // long is also used here for the same reason

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + "cubic inches in a mile");

    }
}
