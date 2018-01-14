package vfh.Einsendeaufgabe_IX;

public class Circle extends Shape {

    private double radius;
    private static final double PI = 3.14159265359;

    protected Circle (double x, double y, double radius){
        super (x, y);
        this.radius = radius;
    }

    public double area() {
        return Math.round(10.0 * Math.pow(radius, 2) * PI) / 10.0;
    }

    public double circumference() {
        return Math.round(10.0 * 2 * PI * radius) / 10.0;                       //Math.round kann nur auf volle Zaheln runden;
    }                                                                           //--> eine Stelle nach dem Komma, deswegen *10 vorne und /10 hinten


    public String toString() {
        return ("Circle with origin: " + origin() +
                " and radius: " + Double.toString(radius));
    }
}
