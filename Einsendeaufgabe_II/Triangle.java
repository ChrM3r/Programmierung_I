package vfh.Einsendeaufgabe_II;
/**
 * Eine Klasse zum Erzeugen von Dreieck-Objekten. Ein Dreieck hat 3 Seiten a, b
 * und c die den folgenden Eigenschaften entsprechen muessen: Erstens, alle drei
 * Seiten muessen einen positiven Wert haben. Zweitens, die drei Seiten muessen
 * den folgenden Ungleichungen entsprechen: a < b+c, b< a+c, c < a+b.
 *
 * @author Chris Merscher (chris.merscher@beuth-hochschule.de)
 * @version 1.00, 23.11.2017
 */
public class Triangle {
    // Drei Attribute fuer die drei Seiten des Dreiecks
    private float a;
    private float b;
    private float c;

    /**
     * Der Konstruktor erzeugte Objekte vom Typ Triangle mit den Standardwerten
     * 3, 4 and 5.
     */
    public Triangle() {
        // So wird ein anderer Konstruktor in der Klasse aufgerufen
        this(3, 4, 5);
    }

    /**
     * Der Konstruktor erzeugte Objekte vom Typ Triangle. Wenn die uebergebenen
     * Werte fuer die drei Seiten nicht den, Vorschriften fuer ein Dreieck
     * entsprechen, wird ein Dreieck mit den Standardwerten 3, 4 und 5 erzeugt.
     *
     * @param a
     *            erste Seite
     * @param b
     *            zweite Seite
     * @param c
     *            dritte Seite
     */

    public Triangle(float a, float b, float c) {
        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c
                || c >= a + b) {
            System.out.println("Fehler in den Uebergabeparametern."
                    + "Ein Dreieck mit Standardwerten wird erzeugt.");
            // In den folgenden Zuweisungen wird ein int Wert in einen float
            // Wert umgewandelt.
            // Das Schluesselwort this wird benutzt um das Attribut a (this.a)
            // vom Parameter a zu unterscheiden und aehnlich fuer b und c
            this.a = 3;
            this.b = 4;
            this.c = 5;
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    /**
     * Diese Methode ueberprueft, ob das Dreieck gleichseitig ist.
     *
     * @return true, wenn das Dreieck gleichseitig ist, sonst false.
     */
    public boolean isEquilateral() {
        return (a == b && b == c);
    }
    /**
     * Diese Methode berechnet den Umfang des Dreiecks.
     *
     * @return a + b + c
     */
    public float berechneUmfang() {
        return (a + b + c);
    }
    /**
     * Diese Methode ueberprueft, ob das Dreieck rechtwinklig ist.
     *
     * @return true, wenn das Dreieck rechtwinklig ist, sonst false.
     */
    public boolean istRechtwinklig(){
        return ((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (c*c) + (b*b) == (a*a));
    }
}