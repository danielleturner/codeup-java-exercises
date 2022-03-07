import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp {


    public static void GroceryList() {

        String yes = "yes";
        String no = "no";
        String newsel = "";

        Scanner userinput = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list? ");
        String userInput = userinput.next();
        String usercontinue1 = "";

        ArrayList<String> grocerylist = new ArrayList<>();

        do {
            if (userInput.equalsIgnoreCase(yes)) {

                System.out.println("Please enter a new item: ");
                String useritem1 = userinput.next();
                grocerylist.add(useritem1);
                System.out.println(grocerylist);


                System.out.println("Would you like to add another item to your cart?");
                usercontinue1 = userinput.next();

//            if (userInput.equalsIgnoreCase(yes)){
//                System.out.println();
//                System.out.println("grocerylist = " + grocerylist);
//            }
//            }else{
//                return;
            }
        } while (usercontinue1.equalsIgnoreCase("yes"));

        System.out.println(grocerylist);


        HashMap<String, String> students = new java.util.HashMap<>();


    }

    public static void main(String[] args) {
        GroceryList();
    }
}
