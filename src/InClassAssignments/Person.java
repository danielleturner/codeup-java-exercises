package InClassAssignments;

public class Person{

    private String name;

    Person(String name){ // ---> Here  I created a constructor that accepts a string
        this.name = name;
    }



    public static void main(String[] args) {

        Person Myah = new Person(" Myah");
        Myah.sayHello();
        System.out.println(Myah.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John"); /// Gives an error
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

    public String getName(){ // --> return statement needed here
       return this.name;
    }

    public void SetName(String Name){

    }

    public void sayHello(){
        System.out.println("Hello " + name + "how are you doing?");
    }

}
