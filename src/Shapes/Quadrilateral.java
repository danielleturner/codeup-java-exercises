package Shapes;

abstract class Quadrilateral extends Shape implements Measurable {


    public Quadrilateral(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }


    public double getArea() {
        return length * width;
    }
}
