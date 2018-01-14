package vfh.Einsendeaufgabe_IX;

public class Rectangle extends Shape {

    protected double xDelta;
    private double yDelta;


    protected Rectangle(double x, double y, double xDelta, double yDelta) {
        super(x, y);
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public double circumference() {
        return (4 * xDelta + 4 * yDelta);
    }

    public double area() {
        return (4 * xDelta * yDelta);
    }

    public String toString() {
        return ("Rectangle with origin: " + origin() + ", " +
                "xDelta: " + Double.toString(xDelta) + ", " +
                "yDelta: " + Double.toString(yDelta));
    }
}