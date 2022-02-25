package Shapes;
// subclass of rectangle
public class Square extends Rectangle {

    public double side;

    public Square(double length, double width){
        super(length, width);

    }

    public Square(double side) {
        super(side);
        this.side = side;
    }

    public double getArea(){
        return Math.pow(this.side,2);
    }

    public double getPerimeter(){
        return this.side * 4;
    }



    public static void main(String[] args) {

    }
}
