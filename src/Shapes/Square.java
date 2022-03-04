package Shapes;

// subclass of rectangle
public class Square extends Rectangle implements Measurable {


    public Square(double side) {
        super(side,side);
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public double getArea() {
        return super.getArea();
    }
}
