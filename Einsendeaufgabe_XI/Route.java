package vfh.Einsendeaufgabe_XI;

/**
 * Klasse zum Berechnen von Rundreisen aus einer Default-Tabelle oder einer
 * vom User eingegebenen Tabelle
 *
 * @author Chris Merscher
 * @version 1.0, 12/2017
 */

import vfh.EinleseMethode.Konsole;
import java.util.Arrays;

public class Route {

    private int[][] entfernung;
    private String[] staedte;
    protected String[] reise;
    private int erfolgsZaehler;

    protected Route() {



        final int[][] defaultEntfernung = {
                //0    1    2    3    4    5    6    7    8    9
                { 0 , 282, 566, 452, 612, 473, 265, 170, 157, 370}, //0
                {282,  0 , 611, 380, 531, 305, 134, 310, 407, 111}, //1
                {566, 611,  0 , 481, 205, 496, 488, 358, 364, 587}, //2
                {452, 380, 481,  0 , 296, 76 , 273, 436, 543, 279}, //3
                {612, 531, 205, 296,  0 , 330, 397, 380, 442, 473}, //4
                {473, 305, 496, 76 , 330,  0 , 204, 393, 504, 202}, //5
                {265, 134, 488, 273, 397, 204,  0 , 240, 352, 102}, //6
                {170, 310, 358, 436, 380, 393, 240,  0 , 114, 343}, //7
                {157, 407, 364, 543, 442, 504, 352, 114,  0 , 453}, //8
                {370, 111, 587, 279, 473, 202, 102, 343, 453,  0 }};//9

        final String[] defaultStaedte = {
                "Potsdam",  //0
                "Hamburg",  //1
                "Muenchen", //2
                "Koeln",    //3
                "Stuttgart",//4
                "Dortmund", //5
                "Hannover", //6
                "Leipzig",  //7
                "Dresden",  //8
                "Bremen"};  //9

        this.staedte = defaultStaedte;                     //Damit die Klassen-Methoden alle auf staedte und entfernung programmiert werden können sind die Defaultwerte direkt im Standard-Konstruktor
        this.entfernung = defaultEntfernung;               //So muss sowohl für die Default- als auch für die User-Variante nur eine Methode geschrieben werden
    }

    protected Route(String[] userStaedte, int[][] userEntfernung) {
        this.entfernung = userEntfernung;
        this.staedte = userStaedte;
    }


    protected void zeigeTabelle() {

        for (int a = 0; a < staedte.length; a++) {
            for (int b = 0; b < staedte.length; b++) {
                System.out.printf("Entfernung von %s nach %s: %dkm %n", staedte[a], staedte[b], entfernung[a][b]);
            }
        }
    }

    protected void staedteFuerRundreiseEinlesen() {

        String eingabe;
        int laengeAlt;
        int laengeNeu;
        String[] tempReihung;
        String[] reise = new String[0];
        int erfolgsZaehler = 0;

        System.out.println("Waehlen Sie die Staedte fuer Ihre Rundreise. Eingabe ist case-sensitive! Maximal 8 Staedte!");
        do {

            System.out.printf("Bitte Stadt eingeben < 0 zum Beenden > ");
            eingabe = Konsole.getInputString();

            if (eingabe.equals("0") && erfolgsZaehler > 1)          //Wenn 0 und mindestens zwei Werte in der Liste, dann Schleifenabbruch
                break;
            else if (eingabe.equals(""))                            //Wenn leer, dann Fehlermeldung
                System.out.println("Leere Eingabe nicht erlaubt!");
            else if (eingabe.equals("0"))                           //Wenn 0 und weniger als zwei Werte, Fehlermeldung
                System.out.println("Bitte mindestens 2 Staedte fuer Ihre Rundreise angeben!");
            else {
                laengeAlt = reise.length;
                laengeNeu = laengeAlt + 1;
                tempReihung = new String[laengeNeu];

                for (int i = 0; i < laengeAlt; i++) {
                    tempReihung[i] = reise[i];
                }

                tempReihung[laengeNeu - 1] = eingabe;
                reise = tempReihung;
                erfolgsZaehler++;
                this.erfolgsZaehler = erfolgsZaehler;
            }

        } while (erfolgsZaehler < 8);

        System.out.println();
        System.out.println("Ihre Staedte fuer die Rundreise: " + Arrays.toString(reise));
        System.out.println();

        this.reise = reise;
    }

    protected void routeDerRundReiseBerechnen(String[] reise) throws IllegalArgumentException{

        //String-Array in Integer umwandeln, um damit auf die Entfernungstabelle zugreifen zu können
        int laengeAlt;
        int laengeNeu;
        int[] tempReihung;
        int[] staedteAlsZahlen = new int[0];
        int gesamtStrecke = 0;

        for (int i = 0; i < erfolgsZaehler; i++) {
            for (int j = 0; j < staedte.length; j++) {

                if (reise[i].equals(staedte[j])) {

                    laengeAlt = staedteAlsZahlen.length;
                    laengeNeu = laengeAlt + 1;
                    tempReihung = new int[laengeNeu];

                    for (int t = 0; t < laengeAlt; t++)
                        tempReihung[t] = staedteAlsZahlen[t];

                    tempReihung[laengeNeu - 1] = j;             //Wandelt an der Stelle des Match den String in den Index um (weil j zu dem Zeitpunkt den Wert des Index hat)
                    staedteAlsZahlen = tempReihung;             //mit diesem Hilfsarray aus Integern kann man auf das zweidimensionale entfernung-Array zugreifen
                }
            }
        }
        if (staedteAlsZahlen.length != reise.length)
            throw new IllegalArgumentException("Eine oder mehrere der von Ihnen eingegeben Staedte sind nicht Teil Ihrer Staedteliste.");

        for (int x = 0; x < staedteAlsZahlen.length; x++) {
            System.out.printf("%d. Entfernung von %s ", x + 1, staedte[staedteAlsZahlen[x]]); //

            if (x + 1 < staedteAlsZahlen.length) {      //Weil der Index x+1 am Ende größer ist als die Länge des Arrays würde ohne diese Abfrage eine IndexOutOfBound Exeption kommen
                System.out.printf("nach %s: %dkm %n", staedte[staedteAlsZahlen[x + 1]], entfernung[staedteAlsZahlen[x]][staedteAlsZahlen[x + 1]]);
                gesamtStrecke += entfernung[staedteAlsZahlen[x]][staedteAlsZahlen[x + 1]];
            } else {                                    //genau dann soll er den ursprünglichen Startpunkt als letzten Zielpunkt nehmen (Index = 0)
                System.out.printf("nach %s: %dkm %n", staedte[staedteAlsZahlen[0]], entfernung[staedteAlsZahlen[x]][staedteAlsZahlen[0]]);
                gesamtStrecke += entfernung[staedteAlsZahlen[x]][staedteAlsZahlen[0]];
                System.out.printf("Gesamtlaenge der Tour: %dkm %n", gesamtStrecke);

            }
        }
    }

    //Statische Methode zum festlegen der benutzerdefinierten Staedte-Liste

    protected static String[] userStaedteTabelleFestlegen() {


        String eingabe;
        int laengeAlt;
        int laengeNeu;
        String[] tempReihung;
        String[] staedte = new String[0];
        int erfolgsZaehler = 0;


        System.out.println("Geben Sie die Staedte Ihrer Staedtetabelle ein! Eingabe ist case-sensitive! Maximal 1.000.000.000 Staedte! ");

        while (erfolgsZaehler < 1000000000) {           //Höchstgrenze der Anzahl an User-Staetdten = 1.000.000.000 Einträge
            System.out.print("Bitte Stadt eingeben < 0 zum Beenden > ");
            eingabe = Konsole.getInputString();

            if (eingabe.equals("0") && erfolgsZaehler > 1)
                break;
            else if (eingabe.equals("0"))
                System.out.println("Bitte mindestens 2 Staedte angeben!");
            else if (eingabe.equals("")){
                System.out.println("Leere Eingabe nicht erlaubt!");
            }
            else {
                laengeAlt = staedte.length;
                laengeNeu = laengeAlt + 1;
                tempReihung = new String[laengeNeu];

                for (int i = 0; i < laengeAlt; i++) {
                    tempReihung[i] = staedte[i];
                }
                tempReihung[laengeNeu - 1] = eingabe;
                staedte = tempReihung;
                erfolgsZaehler++;
            }
        }
        System.out.println();
        System.out.println("Dies sind Ihre gewaehlten Staedte: " + Arrays.toString(staedte));
        System.out.println();
        return staedte;
    }

    //Statische Methode zum festlegen der benutzerdefinierten Entfernungstabelle

    protected static int[][] userEntfernungTabelleFestlegen(String[] staedte) {


        int eingabe;
        int laengeAlt;
        int laengeNeu;
        int[][] tempReihung;
        int[][] entfernung = new int[0][0];
        int stadt1 = 0;

        while (stadt1 < (staedte.length)) {
            for (int stadt2 = 0; stadt2 < staedte.length; stadt2++) {

                System.out.printf("Geben Sie die Entfernung von %s nach %s ein: ", staedte[stadt1], staedte[stadt2]);
                eingabe = Konsole.getInputInt();

                laengeAlt = entfernung.length;
                laengeNeu = laengeAlt + 1;
                tempReihung = new int[laengeNeu][laengeNeu];

                for (int j = 0; j < laengeAlt; j++) {
                    for (int x = 0; x < laengeAlt; x++) {
                        tempReihung[j][x] = entfernung[j][x];
                    }
                }
                tempReihung[stadt1][stadt2] = eingabe;          //jeder Durchlauf der for-Schleife setzt für [stadt1] genau stadte.lenght -1 zugehörige Werte [stadt 2]
                entfernung = tempReihung;
            }
            stadt1++;
        }
        return entfernung;
    }
}