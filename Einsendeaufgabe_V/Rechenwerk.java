package vfh.Einsendeaufgabe_V;

/**
 * Rechenwerk.java
 * Klasse zur Ausfuehrung der vier Grundrechenarten
 * fuer ganze Zahlen
 *
 * @author Chris Merscher
 * @version 1.01; 13.12.2017
 */
public class Rechenwerk {

    public int rechnen(int zahl1, int zahl2, char op) {

        int ergebnis;                   //Variable zum Speichern des Ergebnisses

        switch (op){                        //Fallunterscheidung
            case '+':
                ergebnis = zahl1 + zahl2;   //Addition
                break;
            case '-':
                ergebnis = zahl1 - zahl2;   //Subtraktion
                break;
            case '/':
                ergebnis = zahl1 / zahl2;   //Division
                break;
            default:
                ergebnis = zahl1 * zahl2;   //Multiplikation
                break;
        }
        return ergebnis;                    //Rückgabewert der Methode
    }
}