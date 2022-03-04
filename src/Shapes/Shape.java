package Shapes;
// Parent class
abstract class Shape {

    protected double length;
    protected double width;


    //---Constructor---//
    public Shape(double length, double width){
        this.length = length;
        this.width = width;
    }


    //---Getters---//
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    //---Setter---//
    abstract void setLength();
    abstract void setWidth();


}
