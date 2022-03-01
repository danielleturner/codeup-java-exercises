package Shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Square sq1 = new Square(5); // ---> I created a new instance of square
        System.out.println(sq1.side);// ---> this performs the action of running the instance after the new instance is created

        System.out.println("sq1.getArea() = " + sq1.getArea());

        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getPerimeter());

        Square box2 = new Square(5);
        System.out.println("box2.getArea() = " + box2.getArea());
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());


    }


}
