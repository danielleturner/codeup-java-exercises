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

        githubusernames.add("|danielleturner|");
        githubusernames.add("|mthomas|");
        githubusernames.add("|dbees|");
        githubusernames.add("|speyton|");


        String ok = "";


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Would you like to view the github users for this class? ");
        String resposne = input.next();

        if(resposne.equalsIgnoreCase("yes")){
            System.out.println("githubusernames = " + githubusernames);
            System.out.println("Please enter a github username: ");
        }else{
            System.out.println();
        }


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


        String userInput = input.next();



        if(userInput.equalsIgnoreCase(danielleturner)){
            System.out.println("GitHub name is: " + githubusernames.get(0));
            System.out.println("danielleTurnerGrades = " + danielleTurnerGrades);
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


