package vfh.Einsendeaufgabe_IX;

public class Square extends Rectangle {

    protected Square(double x, double y, double delta) {
        super(x, y, delta, delta);
    }

    public String toString() {
        return ("Square with origin: " + origin() +
                " and delta: " + Double.toString(xDelta));
    }

}
