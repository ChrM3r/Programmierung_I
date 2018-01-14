package vfh.Einsendeaufgabe_V;

/** Taschenrechner.java
 * Aufzurufende Klasse in der das Objekt
 * des Taschenrechners erzeugt wird
 *
 * @author Ihr Name, E-Mail-Adresse
 * @version Versionsnummer, Datum
 */
public class Taschenrechner {

    private Gui rechner;

    public Taschenrechner() {
        rechner = new Gui();

    }

    public static void main (String[] args) {
        new Taschenrechner();
    }
}