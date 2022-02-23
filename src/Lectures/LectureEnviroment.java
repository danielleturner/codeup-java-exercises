package Lectures;

public class LectureEnviroment {

    public static void main(String[] args) {

        Person thisPerson = new Person();

        thisPerson.firstName = "Samuel";
        thisPerson.lastName = "Clemens";

        // A test of an instance mehtod to see the right String return of "Hello form Samuel Clemens"
        System.out.println(thisPerson.sayHello());

        //Well, what about Arthimetic? It wouldn't be prroper to start off by making an instance of it.

//        Arithmetic kensMath = new Arithmetic(); // ---> can do this but you will have yellow block
//        System.out.println(kensMath.pi); // --> can do this but you will have yellow block
        // Instead we want to talk to it in a no-instance way[static way]
        System.out.println();
        System.out.println(Arithmetic.pi);
        System.out.println(Arithmetic.add(3, 3));
        System.out.println(Arithmetic.multiply(4, 5));

        // Well, can I access the instance property similarly to a static property?
        //Back here: Let's make a Person with an age and mess with visibility :D
        Person mcPerson = new Person("Kurt", "Vonnegut", 60, "complicated");

//        System.out.println(mcPerson.shareAge());

    }

}
