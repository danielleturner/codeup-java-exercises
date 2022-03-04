package Shapes;

public class Rectangle extends Quadrilateral{

    protected double height;


    public Rectangle(double length, double width, double height) {
        super(length, width);
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    void setLength() {
        this.length = length;
    }

    void setWidth() {
        this.width = width;
    }

    void setHeight(){
        this.height = height;
    }
}
