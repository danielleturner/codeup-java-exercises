package CollectionsLecture;

import java.util.ArrayList;

public class ArraysLists {

    public static void main(String[] args) {
        ArrayList<Integer> favNumbers = new ArrayList<>(); // instantiate a new array list

        // Let's add elements to the array
        favNumbers.add(7);  // <--- Call array list
        //Number 7 isn't my favorite number I want to add a 0 before 7
        favNumbers.add(0,222); // <-- Here I can add to favorite number by adding to the favNumbers// 0 is the index it will be added at if 0 is removed it will add it after the original number
        System.out.println(favNumbers);

        System.out.println("favNumber = " + favNumbers);
        System.out.println("favNumber.size() = " + favNumbers.size());

        // How to get something at a specific index
        System.out.println("favNumbers.get(0) = " + favNumbers.get(0));
        int myFavoriteFavoritenum = favNumbers.get(0); // <-- Here I can also store my favorite number as a variable
        System.out.println("myFavoriteFavoritenm = " + myFavoriteFavoritenum);

        //Lets search for my second facorite number 7
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));

        //Feeling lucky I want to get triple 7s
        System.out.println("favNumbers.indexOf(777) = " + favNumbers.indexOf(777)); // <-- if the array index can't be found it will give a minus -1

        //What happens if there are two identical numbers in the array list
        favNumbers.add(13);
        favNumbers.add(7); // <-- Here I added another 7 to the array list
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7)); // <-- it returns the first 7 at the specific index

        //How to get the last 7 in a array with the same number multiple times
        System.out.println();
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.lastIndexOf(7) = " + favNumbers.lastIndexOf(7));
        System.out.println();

        // Remove a number from an array
        System.out.println("Remove Number");
        Integer toRemove = new Integer(7); // <-- here initiate a number to remove by given the exact number I want to remove
        favNumbers.remove(toRemove); // <--- Here I run the method to remove the number 7
        System.out.println("favNumbers = " + favNumbers); // <-- printing out result
        System.out.println();

        // String
        // We'll start by defining an array list and adding some items to it
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        System.out.println(roasts); // [light, medium, medium, dark]


        // using .contains
        System.out.println();
        System.out.println("Using Contains");
        roasts.contains("dark"); // true <-- here i use the .contains method to see if roast contain dark because roast contain dark it returns true
        System.out.println("roasts.contains(\"dark\") = " + roasts.contains("dark"));
        roasts.contains("espresso"); // false <-- here i use the .contains method to see if espresso contain dark because it doesn't it returns false
        System.out.println("roasts.contains(\"espresso\") = " + roasts.contains("espresso"));
        System.out.println("roasts.contains(\"Dark\") = " + roasts.contains("Dark")); // <-- Here I tried for case sensitivity and return a false so case sensitivy is necessary


        // using .lastIndexOf
        roasts.lastIndexOf("medium"); // 2

        // using .isEmpty
        System.out.println();
        roasts.isEmpty(); // false
        System.out.println("roasts.isEmpty() = " + roasts.isEmpty());
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("emptyList = " + emptyList);
        emptyList.isEmpty(); // true

        // .remove has two variants
        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
        System.out.println(roasts); // [light, medium, dark]

        roasts.remove(2); // "dark"
        System.out.println(roasts); // [light, medium]

        //

    }

}
