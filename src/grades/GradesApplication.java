package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends Student {

    private String name;
    private ArrayList<Integer> grades;


    public GradesApplication(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public void getGradeAverage() {
        int i;
        int sum = 0;
        for(int x : grades){ // enhanced for loop iterating over the three grades
            sum += x;
        }
        System.out.println("sum = " + sum / grades.size());
    }


    ArrayList<String> githubusernames = new ArrayList<>();
    String danielleturner = "danielleturner";
    String dbees = "dbees";
    String mthomas = "mthomas";
    String speyton = "speyton";
    String yes = "yes";
    String no = "no";


    public void gitGitHubUser(){
        String githubuser = "";
        for(String x : githubusernames){
            System.out.println(githubuser);
        }

    }




    public static void github(){

        HashMap<String, String> students = new java.util.HashMap<>();

        ArrayList<Integer> danielleTurnerGrades = new ArrayList<>();

        ArrayList<Integer> drewBreesGrades = new ArrayList<>();

        ArrayList<Integer> michealThomasGrades = new ArrayList<>();

        ArrayList<Integer> seanPeytonGrades = new ArrayList<>();

        ArrayList<String> githubusernames = new ArrayList<>();

        githubusernames.add(0, "|" + "danielleturner" + "|");
        githubusernames.add(1, "|" + "mthomas" + "|");
        githubusernames.add(2, "|" + "dbees" + "|");
        githubusernames.add(3, "|" + "speyton" + "|");


        String yes = "";


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Would you like to view the github users for this class? ");
        String resposne = input.next();

        if(resposne.equalsIgnoreCase("yes")){
            System.out.println("githubusernames = " + githubusernames);
            System.out.println("Please enter a github username: ");
        }else{
            System.out.println("no");
        }


//        System.out.println("Here are the GitHub usernames of our students:\n" +
//                "|danielleturner|  |dbees|  |speyton|  |mthomas|\n" +
//                "What student would you like more information on?\n" +
//                "danielleturner\n" +
//                "dbees\n" +
//                "speyton\n" +
//                "mthomas\n" +
//                "\n" +
//                "Enter your choice: ");



        students.put("Danielle Turner",  "|" + "danielleturner"+"|");
        danielleTurnerGrades.add(95);
        danielleTurnerGrades.add(100);
        danielleTurnerGrades.add(81);
//        System.out.println("danielleTurnerGrades = " + danielleTurnerGrades);
//        System.out.println();



        students.put("Drew Brees", "|" + "dbees" + "|");
        drewBreesGrades.add(100);
        drewBreesGrades.add(100);
        drewBreesGrades.add(100);
//        System.out.println("drewBreesGrades = " + drewBreesGrades);
//        System.out.println();


        students.put( "Micheal Thomas", "|" + "mthomas" + "|");
        michealThomasGrades.add(90);
        michealThomasGrades.add(60);
        michealThomasGrades.add(30);
//        System.out.println("michealThomasGrades = " + michealThomasGrades);
//        System.out.println();


        students.put("Sean Peyton", "|" + "speyton" + "|");
        seanPeytonGrades.add(100);
        seanPeytonGrades.add(100);
        seanPeytonGrades.add(100);
//        System.out.println("seanPeytonGrades = " + seanPeytonGrades);
//        System.out.println();


        String danielleturner = "danielleturner";
        String dbees = "dbees";
        String mthomas = "mthomas";
        String speyton = "speyton";
        String sure = "";
        String no = "";




//        System.out.println("students.get(\"githubuser_1\") = " + students.get("githubuser_1")); // <-- user from github how to pull
//        System.out.println();
//        System.out.println("students.get(\"Danielle Turner\") = " + students.get("Danielle Turner"));
//        System.out.print("students.get(\"Danielle Turner\") = " + students.get("Danielle Turner")); //<--Make github usernames with this format
//        System.out.print(students.get("Danielle Turner")+ "" );
//        students.put(" mthomas |","Micheal Thomas");
//        students.put(" |akamara|", "Alvin Kamara");
//        int userInput = input.nextInt();


        String userInput = input.next();

        if(userInput.equalsIgnoreCase(danielleturner)){
            System.out.println("GitHub name is: " + githubusernames.get(0));
            System.out.println("danielleTurnerGrades = " + danielleTurnerGrades);
            System.out.println("Would you like to see another student?");
        }else if(userInput.equalsIgnoreCase(dbees)){
            System.out.println("GitHub names is: " + githubusernames.get(2));
            System.out.println("drewBreesGrades = " + drewBreesGrades);
            System.out.println("Would you like to see another student?");
        }else if(userInput.equalsIgnoreCase(speyton)){
            System.out.println("GitHub name is: " + githubusernames.get(3));
            System.out.println("seanPeytonGrades = " + seanPeytonGrades);
            System.out.println("Would you like to see another student?");
        }else if(userInput.equalsIgnoreCase(mthomas)){
            System.out.println("GitHub name is: " + githubusernames.get(1));
            System.out.println("michealThomasGrades = " + michealThomasGrades);
            System.out.println("Would you like to see another student?");
        }else if(!userInput.equalsIgnoreCase(String.valueOf(githubusernames))){
            System.out.println("Sorry know students were found with the username of: " + userInput);
            System.out.println("Would you like to see another student?");
        }else {
            System.out.println("Sorry know students were found with the username of: " + userInput);
            System.out.println("Would you like to see another student?");
        }
    }

    public static void main(String[] args) {

        github();

    }

}


