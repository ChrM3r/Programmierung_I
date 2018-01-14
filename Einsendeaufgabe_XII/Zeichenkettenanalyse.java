package vfh.Einsendeaufgabe_XII;

/**
 * Klasse zum Analysieren von Strings.
 *
 * @author Chris Merscher
 * @version 1.0, 12/2017
 */

public class Zeichenkettenanalyse {


    public static int[] vokaleZaehlen(String zeichenkette) {

        int aZaehler = 0;
        int eZaehler = 0;
        int iZaehler = 0;
        int oZaehler = 0;
        int uZaehler = 0;
        int[] anzahlVokale;

        String zeichenketteKlein = zeichenkette.toLowerCase();

        for (int i = 0; i < zeichenkette.length(); i++) {
            switch (zeichenketteKlein.charAt(i)) {
                case 'a': {
                    aZaehler++;
                    break;
                }
                case 'e': {
                    eZaehler++;
                    break;
                }
                case 'i': {
                    iZaehler++;
                    break;
                }
                case 'o': {
                    oZaehler++;
                    break;
                }
                case 'u': {
                    uZaehler++;
                    break;
                }
                default:
                    break;
            }
        }
        anzahlVokale = new int[] {aZaehler, eZaehler, iZaehler, oZaehler, uZaehler};
        System.out.printf("Zu analysierende Zeichenkette (Anzahl der Vokale): %s %n%n Anzahl 'a', 'A': %d %n Anzahl 'e', 'E': %d %n Anzahl 'i', 'I': %d %n Anzahl 'o', 'O': %d %n Anzahl 'u', 'U': %d %n%n", zeichenkette, aZaehler, eZaehler, iZaehler, oZaehler, uZaehler);
        return anzahlVokale;
    }


    public static int zeichenZaehlen(String zeichenkette, char zeichen) {

        int zeichenZaehler = 0;

        for (int i = 0; i < zeichenkette.length(); i++) {
            if (zeichenkette.charAt(i) == zeichen)
                zeichenZaehler++;
        }
        // System.out.printf("Zu analysierende Zeichenkette (Anzahl eines Zeichens): %s %n%n Zu pruefendes Zeichen: %c %n%n Anzahl '%c': %d %n%n" , zeichenkette, zeichen, zeichen, zeichenZaehler);
        return zeichenZaehler;
    }

    public static int[] zeichenZaehlen(String zeichenkette, char[] zeichenArray) {

        int[] anzahlZeichen = new int[zeichenArray.length];

        for (int x = 0; x < zeichenArray.length; x++) {
            for (int i = 0; i < zeichenkette.length(); i++) {
                if (zeichenkette.charAt(i) == zeichenArray[x])
                    anzahlZeichen[x] = anzahlZeichen[x] + 1;
            }
        }
        System.out.printf("Zu analysierende Zeichenkette (Anzahl mehrerer Zeichen): %s %n%n", zeichenkette);
        for (int i =0; i <anzahlZeichen.length; i++) {
            System.out.printf("Anzahl '%c': %d %n" , zeichenArray[i], anzahlZeichen[i]);
        }
        return anzahlZeichen;
    }
}
