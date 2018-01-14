/**
 * Testprogramm fuer die Klasse MyMath.
 *
 * @author  Chris Merscher (chris.merscher@beuth-hochschule.de)
 * @version 1.00, 10/2017
 */
public class MyMathTest {

    /**
     * Main-Method zum Starten und Testen der Klasse MyMath. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     *
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
    public static void main(String[] args) {
        // Statische Methoden der Klasse MyMath testen
        System.out.println("Die Summe aus 1,2 und 3 ergibt "
                + MyMath.summiere3Zahlen(1, 2, 3));

        System.out.println("Die Differenz von 184, 4, 30 und 25 beträgt "
                + MyMath.subtrahiere4Zahlen(184, 4, 30, 25));

        System.out.println("Das Produkt aus 42, 4 und 2 ist exakt "
                + MyMath.multipliziere3Zahlen(42, 4, 2));

        System.out.println("Der Quotient aus 55 und 5 ist "
                + MyMath.dividiere2Zahlen(55, 5));

        System.out.println("Und wenn ich von der Summe aus " + MyMath.ergebnis1 +
                " und " + MyMath.ergebnis2 +
                " das Ergebnis aus der dritten Rechnung, nämlich " + MyMath.ergebnis3 +
                ", abziehe und das zu guter letzt noch mit " + MyMath.ergebnis4 +
                " multipliziere, erhalte ich " + MyMath.plusMinusMal() + ".");


    }
}