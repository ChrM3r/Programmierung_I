package vfh.Einsendeaufgabe_IX;

public class Reporter{

    static public void report(Shape s){
        System.out.println(s.toString() + " / Area: " + s.area() + " / Circumference: " + s.circumference());
    }

    static public void reportArea(Shape s){
        System.out.print("Area: " + s.area() + " ");
    }

    static public void reportCircum(Shape s){
        System.out.print("Circumference: " + s.circumference() + " ");
    }
}
