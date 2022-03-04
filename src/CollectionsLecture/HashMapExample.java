package CollectionsLecture;


import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> authorsBooks = new java.util.HashMap<>(); // HashMaps are data structure for key-value pairs

        // .put set a key-value pair
        authorsBooks.put("Kurt Vonnegut", "Cat's Cradle");
        authorsBooks.put("J.D. Salinger", "Franny and Zooey");
        System.out.println("authorsBooks = " + authorsBooks);

        // What if I didn't want a null value
        System.out.println("authorsBooks.getOrDefault(\"Isaac Newton\", \"No book found for author\") = " + authorsBooks.getOrDefault("Isaac Newton", "No book found for author"));


        // What if I want to override the key-value pair
        System.out.println();
        authorsBooks.put("Kurt Vonnegut", "Slaughter Five");
        // If I don't want to overide but put if there I will use put if abscent
        authorsBooks.putIfAbsent("Kurt Vonnegut", "Welcome to the Monkey House");
        authorsBooks.put("Karl Marx", "The Communist Manifesto");
        System.out.println("authorsBooks = " + authorsBooks);
        // remove someone from book
        authorsBooks.remove("Karl Marx", "The Communist Manifesto");
        System.out.println("authorsBooks = " + authorsBooks);


        //Whiat if I wanted to just replace something
        authorsBooks.replace("J.D. Salinger", "Nine Stories");
        System.out.println("authorsBooks = " + authorsBooks);


        // .get returns the value associated with the given key
        System.out.println("authorsBooks.get(\"Kurt Vonnegut\") = " + authorsBooks.get("Kurt Vonnegut")); // <-- Here I get the book written by Kurt Vonnegut by typing authorsBook.get--then name
        System.out.println("authorsBooks.get(\"Chris\") = " + authorsBooks.get("Chris")); // <-- returns null because there is no author name chris


        // to clear author books us clear() method
        authorsBooks.clear(); // <-- this clears the authors object
        System.out.println("authorsBooks = " + authorsBooks);
        System.out.println("authorsBooks.isEmpty() = " + authorsBooks.isEmpty());
    }
}
