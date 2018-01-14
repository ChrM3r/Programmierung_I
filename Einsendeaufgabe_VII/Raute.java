package vfh.Einsendeaufgabe_VII;

/**
 * Beschreibung : Test-Klasse unm den Rauten-Ersteller zu testen
 *
 * @author Chris Merscher
 * @version 1.0, 16.12.2017
 */
public class Raute {

    private int groesse;
    private String zeichen;

    //Konstruktor
    public Raute(int groesse, String zeichen) {
        this.groesse = groesse;
        this.zeichen = zeichen;
    }

    public void erstelleRaute() {

        int haelfte;
        //Ausgabe der Rauten-Eigenschaften
        System.out.println("Eingabewerte: \n Groesse: " + groesse + "\n Zeichenkette: '" + zeichen + "' \n");

        //Prüfung ob "groesse" gerade oder ungerade ist
        if (groesse % 2 == 0) {

            System.out.println("Es muss eine ungerade Anzahl an Zeilen vorgegeben werden!");
            groesse = groesse - 1;
            System.out.println("Neuer Wert von Groesse: " + groesse + "\n");
        }
        //Prüfung ob "zeichen" mehr als ein Zeichen beinhaltet. Dies führt zu unsymetrischen Mustern
        if (zeichen.length() != 1) {
            System.out.println("Bei einer Zeichenanzahl > 1 kann es zu unsymetrischen Mustern kommen! \n");
        }

        // Berechnung des Startwertes für:
        // 1. die Anzahl der Zeilen für die halben Rauten
        // 2. den Anfangswert zur Berechnung des Vergleichswert für die Abfrage welches Zeichen gesetzt werden soll
        haelfte = groesse / 2;



        //Beispiel für die Größe 7
        //Konsole (Zahlen stellen die Variable "zeichenposition" dar)
        //=======================================================================
        //0 1 2 3 4 5 6 | Erstelle "zeichen" genau dann wenn "zeichenposition" zwischen
        //_ _ _ * _ _ _ |  ≥ 3 und ≤ 3 liegt; zeilenzaehler = 0
        //_ _ * * * _ _ |  ≥ 2 und ≤ 4 liegt; zeilenzaehler = 1
        //_ * * * * * _ |  ≥ 1 und ≤ 5 liegt; zeilenzaehler = 2
        //* * * * * * * |  ≥ 0 und ≤ 6 liegt; zeilenzaehler = 3


        //Obere Haelfte der Raute
        for (int zeilenzaehler = 0; zeilenzaehler <= haelfte; zeilenzaehler++) {                                        //Zeilen produzieren(insgesamt 4 im Beispiel)
            for (int zeichenposition = 0; zeichenposition < groesse; zeichenposition++) {                               //Zeichen produzieren
                if ((zeichenposition >= haelfte - zeilenzaehler) && (zeichenposition <= haelfte + zeilenzaehler)) {     //zeilenzaehler wird hier als Hilfsvariable missbraucht
                    System.out.print(zeichen);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Untere Haelfte der Raute

        //    - wie oben nur rückwärts in der ersten for-Schleife und den Startwert um 1 vermindert
        //      um eine Dopplung der "vollen" Zeile zu vermeiden
        for (int zeilenzaehler = haelfte - 1; zeilenzaehler >= 0; zeilenzaehler--) {                                    //Zeilen produzieren(insgesamt 3 im Beispiel)

            for (int zeichenposition = 0; zeichenposition < groesse; zeichenposition++) {                               //Zeichen produzieren
                if ((zeichenposition >= haelfte - zeilenzaehler) && (zeichenposition <= haelfte + zeilenzaehler)) {     //zeilenzaehler wird hier als Hilfsvariable missbraucht
                    System.out.print(zeichen);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
