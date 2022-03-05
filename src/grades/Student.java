package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public  Student(String name){ // <- by not adding the grade parameter here I can just pass in instruction in the .this method
        this.name = name;
        this.grades = new ArrayList<>(); // <-- by saying this.grades = new ArrayList<>() I create an array list eachtime i creat a student
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


        ArrayList<Integer> myGrades = new ArrayList<>();

        Student student1 = new Student("Danielle Turner ");
        student1.addGrade(95);
        student1.addGrade(100);
        student1.addGrade(81);
        System.out.println("student1 = " + student1.name + student1.grades);
        student1.getGradeAverage();
        System.out.println();


        Student student2 = new Student("Drew Brees ");
        student2.addGrade(100);
        student2.addGrade(100);
        student2.addGrade(100);
        System.out.println("student2 = " + student2.name + student2.grades);
        student2.getGradeAverage();
        System.out.println();


        Student student3 = new Student("Micheal Thomas ");
        student3.addGrade(90);
        student3.addGrade(60);
        student3.addGrade(30);
        System.out.println("student3 = " + student3.name + student3.grades);
        student3.getGradeAverage();
        System.out.println();


        Student student4 = new Student("Alvin Kamara ");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(90);
        System.out.println("student4 = " + student4.name + student4.grades);
        student4.getGradeAverage();
        System.out.println();




    }




}
