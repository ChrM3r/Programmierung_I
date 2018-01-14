package vfh.Einsendeaufgabe_IX;

public class ShapeTester {

    public static void main(String[] args) {

        Shape sh = new Shape(10, 40);
        Rectangle r = new Rectangle(20, 30, 35, 15);
        Square sq = new Square(30, 20, 5);
        Circle c = new Circle(40, 10, 25);

        //Ausgabe wie in der Beispielausgabe ersichtlich
        Reporter.report(sh);
        Reporter.report(r);
        Reporter.report(sq);
        Reporter.report(c);
        System.out.println();


        //Ausgabe, wie im Text der Aufgabenstellung gewünscht
        Reporter.reportCircum(sq);
        System.out.println();
        Reporter.reportArea(r);
        System.out.println();
        Reporter.reportArea(c);
        Reporter.reportCircum(c);

    }
}
