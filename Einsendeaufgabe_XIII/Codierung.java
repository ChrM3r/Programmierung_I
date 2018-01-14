package vfh.Einsendeaufgabe_XIII;

/**
 * Klasse zum Codieren von Text.
 *
 * @author Chris Merscher
 * @version 1.0, 12/2017
 */

import vfh.Einsendeaufgabe_XII.Zeichenkettenanalyse; //Import der Zeichenzaehlmethode zum Leerzeichenzählen
import java.util.Random;

public class Codierung {

    private int zeilen;
    private int spalten;

    protected Codierung(int zeilen, int spalten){
        this.zeilen = zeilen;
        this.spalten = spalten;


    }

    protected String verschluessleText(String klarText) throws IllegalArgumentException{

        char[][] codeMatrix = new char[zeilen][spalten];
        char[][] transponierteCodeMatrix = new char[codeMatrix[0].length][codeMatrix.length];

        char[] tempCodeMatrix = klarText.toCharArray(); //Array aus Chars aus dem Klartext machen
        char[] tempCodeMatrixOhneLeerzeichen = new char[tempCodeMatrix.length - Zeichenkettenanalyse.zeichenZaehlen(klarText, ' ')]; //und ein neues Array mit der Länge des ursprünglichen minus die Leerzeichen

        int anzahl = 0;
        int anzahl2 = 0;

        StringBuilder erweiterterText = new StringBuilder();
        StringBuilder verschluesselterText = new StringBuilder();


        //Leerzeichen aus dem Char-Array entfernen
        for (int i = 0; i < tempCodeMatrix.length; i++){
            if (anzahl == tempCodeMatrix.length); //weil anzahl am Ende der Schleife auch den Index übersteigen kann (wegen des Hochzählens bei Leerueichen, hier die Prüfnung; Wenn es so ist, macht er gar nichts.
            else {
                if (tempCodeMatrix[anzahl] == ' ')
                    anzahl++;
                tempCodeMatrixOhneLeerzeichen[i] = tempCodeMatrix[anzahl];
                anzahl++;
                }
        }
        //Zum eventuellen Erweitern (hinzufügen von Zeichen), bis Zeichenanzahl des Klartexts = Zeilen * Spalten muss das Array in einen String(Builder) umgewandelt werden
        for (int i = 0; i < tempCodeMatrixOhneLeerzeichen.length; i++)

            erweiterterText.append(tempCodeMatrixOhneLeerzeichen[i]);

        //Wenn die Matrix zu klein ist...
        if (erweiterterText.length() > (zeilen * spalten)){
            throw new IllegalArgumentException("Schlussel-Matrix ist zu klein fuer den Text! \n Schluesselmatrix kann " + zeilen * spalten +
                    " Zeichen fassen. Sie haben " + Integer.toString(klarText.length() - Zeichenkettenanalyse.zeichenZaehlen(klarText, ' ')) + " Zeichen eingegeben (Leerzeichen nicht beruecksichtigt)! \n " +
                    "Bitte mindestens eine " + Long.toString(Math.round(Math.sqrt(klarText.length() - Zeichenkettenanalyse.zeichenZaehlen(klarText, ' '))) + 1) + "x" + Long.toString(Math.round(Math.sqrt(klarText.length() - Zeichenkettenanalyse.zeichenZaehlen(klarText, ' ')))) + "-Matrix angeben! \n" );
        }

        //Wenn der Text zu klein ist, um random-Zahlen erweitern...
        while (erweiterterText.length() != (zeilen * spalten)){
            int randomErweiterung = new Random().nextInt(9);
            erweiterterText.append(randomErweiterung);
        }
        //...und wieder in ein Array umwandeln
        tempCodeMatrix = (erweiterterText.toString()).toCharArray();

        //Dann aus einem eindimensionalen Array ein zweidimensionales Array machen
        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++) {
                    codeMatrix[i][j] = tempCodeMatrix[anzahl2];
                    anzahl2++;
            }
        }

        //Verschlüsselungs-Array anzeigen
        System.out.println("Die codierte Matrix:");

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(Character.toString(codeMatrix[i][j]));
            }
            System.out.println();
        }
        System.out.println();

        //Array transponieren

        for (int i = 0; i < codeMatrix.length; i++) {
            for (int j = 0; j < codeMatrix[0].length; j++) {
                transponierteCodeMatrix[j][i] = codeMatrix[i][j];
            }
        }

        //Transponiertes Array in einen String packen und ausgeben

        for (int i = 0; i < transponierteCodeMatrix.length; i++){
            for (int j = 0;j < transponierteCodeMatrix[0].length; j++){
                verschluesselterText.append(transponierteCodeMatrix[i][j]);
            }
        }

        System.out.println("Ihr eingegebener Text in verschluesselter Form:");
        System.out.println(verschluesselterText);

        return verschluesselterText.toString();
    }
}