package InClassAssignments;

import java.util.Arrays;

public class ServerNameGenerator {

    static String[] adjective = {"red", "yellow", "pink", "small", "brown", "green", "yellow", "purple", "blue", "grey"};
    static String[] noun ={"John", "Chris", "Bob", "Henry", "Moses", "Paul", "Peter", "James", "Cyrus", "Ezekiel"};

    static String randomNounAdj(String[] array){

        int min = 0;
        int max = array.length;
        int random = (int)(Math.random() * (max - min + 1));
        String newName = "";

        for(int i = 0; i < 1; i++){
            newName = array[random];
        }
        return newName;

    }

    public static void main(String[] args) {
        String ranadj = randomNounAdj(adjective);
        String randn = randomNounAdj(noun);


        System.out.printf("Here is your server name: \n%s-%s", randn, ranadj);

    }
}


