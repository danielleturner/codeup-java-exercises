package FileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LectureEnviorenment {

    public static void printPoem(Path filePath) throws IOException{
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);// this must be inserted after creating an instance in order to read all lines followed by (filepath) in paranthensis
        for(int i = 0; i < fileContents.size(); i++){
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }

    }


    public static void main(String[] args) throws IOException {
        // Paths class = static method obtain filepaths (Path class)
        // Path interface = abstract away difference between win && macOS [vs trying to do everything with strings]
        // File class - Files.method()
        //for manipulating / interacting with files ^ utilizing paths above


        // Initalize a Path datatype for the first time
        String myString = "This string";

        // Now were doing it with a 'Path' dataype and the result of Paths.get :D
        Path pathToPoem = Paths.get("src/fileIO/wcw.txt");


        System.out.println("pathToPoem = " + pathToPoem);

        // We can call the Files helper class - we ask it "hey, Files class, at this path did you find a file that exists? True or False
        System.out.println("Files.exist(pathToPoem) =" + Files.exists(pathToPoem));

        printPoem(pathToPoem);

        // Alright - looks good, I can get to an eisting file with some of these new classes in interesting ways. What if I wnated to creat a file and director/path to go
        // First: A string representing where I want a directory to go
        String directory = "./src/fileIO/data";
        //Second: how about a string representing the name of the fle as I would like it?
        String fileName = "groceryList.txt";

        //Now we are going to combine the two with path data type
        Path dataDirectory = Paths.get(directory); //Path-ify that String with the directory!
        Path dataDirectoryAndFile = Paths.get(directory, fileName); // Combing both String into one 'Path' Overloading
        System.out.println();

//        System.out.println("dataDirectory = " + dataDirectory);
//        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        if(Files.notExists(dataDirectoryAndFile)){
            Files.createDirectories(dataDirectory);// if dataDirectory does not exist and its true creat it at this directory
        }

        if(Files.notExists(dataDirectoryAndFile)){
            Files.createFile(dataDirectoryAndFile);
        }

        // File IO part 3 - okay, I've gotten to something that exists, I've created directories and file that did not exist, now how do I manipulate what is inside a file.

        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        // Set up something we want to write in our text file groceries we need
        List<String> groceryList = Arrays.asList("coffee", "catfood", "roastbeef", "carrots", "onions", "potatoes", "bread");
        System.out.println("groceryList = " + groceryList);
        Files.write(dataDirectoryAndFile,groceryList); // here I write the list to groceryList this overides (dataDirectoryAndFile)

        List<String> forgetAGrocery = Arrays.asList("fish", "boudin", "crackers");
        Files.write(dataDirectoryAndFile,forgetAGrocery, StandardOpenOption.APPEND); // Here I use this method to add to my groceryList (update) with a StandardOpenOption.Append

        // Alright- we've update the text file with various Strings of information - how do I get that back out of th text file??
        List<String> printGroceryList = Files.readAllLines(dataDirectoryAndFile);

        System.out.println();
        System.out.println("groceryList = " + groceryList);

        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ":" + printGroceryList.get(i)); // Here we loop through the groceryList and use .get method to get each element and and give it a number
        }

        //Let's do a more complicated element- replacing a found element with a new element
        //First let's get grocerylist from text file as it exist now
        List<String> printGroceryList2 = Files.readAllLines(dataDirectoryAndFile);
        // Second: let's set up a second array list to hold the updated list we want to write to the text file
        List<String> newList = new ArrayList<>(); // using polymorphism

        for(String line : printGroceryList2){
            if(line.equalsIgnoreCase("potatoes")){
                newList.add("celery"); // this method allows me to replace potatoes and add celery
                continue;
            }

            newList.add(line);
        }

        System.out.println("printGroceryList2 = " + printGroceryList2);
        System.out.println("newList = " + newList);
        Files.write(dataDirectoryAndFile,newList);

        for(int i = 0; i < newList.size(); i++){
            System.out.println((i + 1) + ":" + newList.get(i));
        }

    }

}
