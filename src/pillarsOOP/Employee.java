package pillarsOOP;

public class Employee extends Person{
    //Employees still have names . . so I don't have to really reinvent what I did there in the Person class
    public Employee(String employeeName){
        super(employeeName);
    }

    //Well, that worked pretty good to this point - HOWEVER, late breaking news update, we do need to have Employees to be able to have a 'department' - this is NOT something that all 'Person's have
    public String department;

    public void sayGoodBye(){
        System.out.println("It was my pleasure working with you today - come back and see us sometime");
    }

    public String getName() {
        return this.name;
    }

//    public int getAge() {
//        // ERROR! age is still private over in Person.java
//        return this.age;
//    }

    public static void main(String[] args) {
        Employee mcKen = new Employee("McKenneth McHowell");

        System.out.println("mcKen.name = " + mcKen.name);
        mcKen.sayHello();
        mcKen.sayGoodBye();
        System.out.println("mcKen.getName() = " + mcKen.getName());
        System.out.println("mcKen.getAge() = " + mcKen.getAge());
//        System.out.println(mcKen.age);

    }
}


