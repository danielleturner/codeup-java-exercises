package pillarsOOP;


public class Person {
    protected String name;
    private int age;


    // constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    // Methods
    public int getAge() {
        return this.age;
    }

    public Person(){

    }

    public void sayHello(){
        System.out.println("Hello from " + name +  "!");
    }

    public void sayGoodBye(){
        System.out.println("Adios muchachos and thanks for all the fish from " + name + "!");
    }

    public String getName() {
        return name;
    }
}
