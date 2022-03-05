package grades;

import java.util.ArrayList;
import java.util.HashMap;

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




    public static void main(String[] args) {





        HashMap<String, String> students = new java.util.HashMap<>();

        ArrayList<Integer> danielleTurnerGrades = new ArrayList<>();

        students.put("Danielle Turner",  "|" + "danielleturner"+"|");
        danielleTurnerGrades.add(95);
        danielleTurnerGrades.add(100);
        danielleTurnerGrades.add(81);
        System.out.println("danielleTurnerGrades = " + danielleTurnerGrades);
        System.out.println();


        ArrayList<Integer> drewBreesGrades = new ArrayList<>();

        students.put("Drew Brees", "|" + "dbees" + "|");
        drewBreesGrades.add(100);
        drewBreesGrades.add(100);
        drewBreesGrades.add(100);
        System.out.println("drewBreesGrades = " + drewBreesGrades);
        System.out.println();


        ArrayList<Integer> michealThomasGrades = new ArrayList<>();

        students.put( "Micheal Thomas", "|" + "mthomas" + "|");
        michealThomasGrades.add(90);
        michealThomasGrades.add(60);
        michealThomasGrades.add(30);
        System.out.println("michealThomasGrades = " + michealThomasGrades);
        System.out.println();


        System.out.println("students.get(\"Danielle Turner\") = " + students.get("Danielle Turner"));
        System.out.print("students.get(\"Danielle Turner\") = " + students.get("Danielle Turner")); //<--Make github usernames with this format


        System.out.print(students.get("Danielle Turner")+ "" );



        students.put(" mthomas |","Micheal Thomas");
//        students.put(" |akamara|", "Alvin Kamara");


    }

}
