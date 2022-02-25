package pillarsOOP;

public class LiveCode {

    public static void main(String[] args) {
//        Person chaucer = new Person("Chaucer");
//
//        chaucer.sayHello();
//        chaucer.sayGoodBye();
//        System.out.println("chaucer.name = " + chaucer.name);
//        //Okay - so, we've seen THAT before. What's new with this inheritance?
//        System.out.println();
//        //Well, I'm glad you asked : Here's our first example of instantiating an object with inheritance being used
//        Employee mcKen = new Employee("McKenneth McHowell");
//
//        System.out.println("mcKen.name = " + mcKen.name);
//        mcKen.sayHello();
//        mcKen.sayGoodBye();
//
//        mcKen.department = "Delivery";
//
//        System.out.println("mcKen.department = " + mcKen.department);
//
////        Person unemployedPerson = new Person("this guy");
////        unemployedPerson.department;
//
//        System.out.println("SUPERHERO TIME");
//        SuperHero theComedian = new SuperHero("Eddie Blake", "The Comedian");
//
//        System.out.println("theComedian.getName() = " + theComedian.getName());
//        System.out.println("mcKen.getName() = " + mcKen.getName());
//        System.out.println("theComedian.getSecretIdentity() = " + theComedian.getSecretIdentity());

        //Mighty morphing polymorphers!
        Person one = new Person("mcExample mcPerson");
        Person two = new Employee("mcExample mcEmployee");

        one.sayGoodBye();
        two.sayGoodBye();

    }
}