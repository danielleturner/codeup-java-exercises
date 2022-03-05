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
        Student student1 = new Student("Danny");
        student1.addGrade(95);
        student1.addGrade(100);
        student1.addGrade(81);
        System.out.println("student1 = " + student1.name + student1.grades);
        student1.getGradeAverage();




    }




}
