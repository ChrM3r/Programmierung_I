/**
 * Eine Klasse fuer verschiedene Mathematische Funktionen.
 *
 * @author Chris Merscher (chris.merscher@beuth-hochschule.de)
 * @version 1.00, 10/2017
 */
public class MyMath {

    /**
     * Oeffentliche, statische Variable fuer das Ergebnis der ersten Rechhnung
     */
    public static int ergebnis1;
    /**
     * Oeffentliche, statische Variable fuer das Ergebnis der zweiten Rechhnung
     */
    public static int ergebnis2;
    /**
     * Oeffentliche, statische Variable fuer das Ergebnis der dritten Rechhnung
     */
    public static int ergebnis3;
    /**
     * Oeffentliche, statische Variable fuer das Ergebnis der vierten Rechhnung
     */
    public static int ergebnis4;

    /**
     * Diese Methode berechnet und liefert die Summe von 3 Zahlen vom Typ int.
     * @param n1    erste Zahl
     * @param n2    zweite Zahl
     * @param n3    dritte Zahl
     * @return ergebnis1 = die Summe der Zahlen
     */
    public static int summiere3Zahlen(int n1, int n2, int n3) {
        ergebnis1 = n1 + n2 + n3;
        return ergebnis1;
    }

    /**
     * Diese Methode berechnet und liefert die Differenz von 4 Zahlen vom Typ int.
     * @param n1    erste Zahl
     * @param n2    zweite Zahl
     * @param n3    dritte Zahl
     * @param n4    vierte Zahl
     * @return      ergebnis2 = die Differenz der Zahlen
     */
    public static int subtrahiere4Zahlen(int n1, int n2, int n3, int n4) {
        ergebnis2 = n1 - n2 - n3 - n4;
        return ergebnis2;
    }

    /**
     * Diese Methode berechnet und liefert das Produkt von 3 Zahlen vom Typ int.
     * @param n1    erste Zahl
     * @param n2    zweite Zahl
     * @param n3    dritte Zahl
     * @return      ergebnis3 = das Produkt der Zahlen
     */
    public static int multipliziere3Zahlen(int n1, int n2, int n3) {
        ergebnis3 = n1 * n2 * n3;
        return ergebnis3;
    }

    /**
     * Diese Methode berechnet und liefert das Produkt von 3 Zahlen vom Typ int.
     * @param n1    erste Zahl
     * @param n2    zweite Zahl
     * @return      ergebnis3 = der Quotient der Zahlen
     */
    public static int dividiere2Zahlen(int n1, int n2){
        ergebnis4 = n1 / n2;
        return ergebnis4;
    }

    /**
     * Diese Methode berechnet und liefert das Ergebnis einer
     * definierten Rechenaufgabe mit den vorher ermittelten Ergebnissen.
     * @return  Ergebnis der ersten Rechnung + Ergebnis der zweiten Rechnung
     * - Ergebnis der dritten Rechnung * Ergebnis der vierten Rechnung
     */
    public static int plusMinusMal() {
        return ergebnis1 + ergebnis2 - ergebnis3 * ergebnis4;
    }

}