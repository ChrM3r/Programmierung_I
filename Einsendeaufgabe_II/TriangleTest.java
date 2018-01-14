package vfh.Einsendeaufgabe_II;
/**
 * Testprogramm fuer die Klasse Triangle.
 *
 * @author Chris Merscher (chris.merscher@beuth-hochschule.de)
 * @version 1.00, 23.11.2017
 */
public class TriangleTest {
    /**
     * Main-Methode zum Starten und Testen der Klasse Triangle.
     *
     * @param args
     *            Uebergabeparameter fuer das Programm
     */
    public static void main(String[] args) {

        // ein Dreieck mit richtigen Werten nicht gleichseitig
        Triangle dreieck1 = new Triangle(1, 2.5f, 3);
        System.out.println("Dreieck 1: " + dreieck1.isEquilateral());
        // ein Dreieck mit richtigen Werten ist gleichseitig
        Triangle dreieck2 = new Triangle(3.2f, 3.2f, 3.2f);
        System.out.println("Dreieck 2: " + dreieck2.isEquilateral());
        // ein Dreieck mit falschen Werten
        Triangle dreieck3 = new Triangle(-1, 2, 3);
        // ein Dreieck mit falschen Werten
        Triangle dreieck4 = new Triangle(1, 2, 3);
        // ein Dreieck mit default Werten
        Triangle dreieck5 = new Triangle();
        // Gleichseitig pruefen
        System.out.println("Dreieck 5: Ist gleichseitig: " + dreieck5.isEquilateral());
        // ein rechtwinkliges Dreieck
        Triangle dreieck6 = new Triangle(5, 5, 7.07106781f);
        // Rechtwinkligkeit pruefen
        System.out.println("Dreieck 6: Ist rechtwinklig: " + dreieck6.istRechtwinklig());
        // Umfang berechnen
        System.out.println("Dreieck 6: Umfang: " + dreieck6.berechneUmfang() + " Längeneinheiten");
    }
}