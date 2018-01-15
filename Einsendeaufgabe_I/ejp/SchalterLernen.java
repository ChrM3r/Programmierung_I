package vfh.Einsendeaufgabe_I.ejp;

/**
 * Beschreibung :
 *
 * @author      Chris Merscher
 * @version     1.01, 01.03.2000
 */

public class SchalterLernen {

    /**
     * Soll die Klasse von der Eingabekonsole aus aufgerufen werden koennen,
     * dann muss die hier aufgefuehrte main-Methode enthalten sein.
     * Diese Methode ist der definierte Einstiegspunkt fuer die Ausfuehrung.
     */
    public static void main(String[] args) {

        boolean schalter1 = true;
        boolean schalter2 = false;

        System.out.println(SchalterUebung.Schalter(schalter1, schalter2));
        }
    }