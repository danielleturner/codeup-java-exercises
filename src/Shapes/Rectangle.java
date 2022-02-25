package Shapes;
// Parent class
public class Rectangle{

    protected double width;
    protected double length;



    // --Constructor---///
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double side){
        this.length = side;
        this.width = side;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(20,80);
        Rectangle perm1 = new Rectangle(20,80);
        System.out.println("The Area for rec1 is: " + rec1.getArea());
        System.out.println("The perimeter of rect is: " + perm1.getPerimeter());
    }



}
