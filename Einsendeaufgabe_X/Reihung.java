package vfh.Einsendeaufgabe_X;

/**
 * Klasse zum Testen von Intervallen.
 *
 * @author Chris Merscher
 * @version 1.0, 12/2017
 */

import vfh.EinleseMethode.Konsole;
import java.util.Arrays;

public class Reihung {

    private int untereGrenze;
    private int obereGrenze;
    private int maximaleAnzahl;
    private int fehlerzaehler = 0;
    private int erfolgszaehler = 0;
    private int[] eingabeReihung;
    private String stringReihung = "";

    //Getter zum Auslesen der Attribute

    public int getUntereGrenze() {
        return untereGrenze;
    }

    public int getObereGrenze() {
        return obereGrenze;
    }

    public int getMaximaleAnzahl() {
        return maximaleAnzahl;
    }



    public Reihung(int untereGrenze, int obereGrenze, int maximaleAnzahl) {

        this.untereGrenze = untereGrenze;
        this.obereGrenze = obereGrenze;
        this.maximaleAnzahl = maximaleAnzahl;
    }

    public Reihung(int[] reihung) {

        this.untereGrenze = reihung[0];
        this.obereGrenze = reihung[1];
        this.maximaleAnzahl = reihung[2];

    }

    public void einlesen() {

        int[] eingabeReihung = new int[0];
        int[] tempReihung;
        int laengeAlt;
        int laengeNeu;
        int eingabe;

        do {
            System.out.printf("Geben Sie eine Zahl zwischen %d und %d (inklusive) ein! <Hinweis:  0 beendet das Programm> ",this.untereGrenze,this.obereGrenze);
            eingabe = Konsole.getInputInt();

            if (eingabe == 0)
                break;

            if (eingabe > obereGrenze || eingabe < untereGrenze) {

                System.out.println("Fehler! Element nicht in Reihung!");
                fehlerzaehler++;
            }

            laengeAlt = eingabeReihung.length;
            laengeNeu = laengeAlt + 1;
            tempReihung = new int[laengeNeu];

            for (int i = 0; i < laengeAlt; i++) {

                tempReihung[i] = eingabeReihung[i];
            }

            if (eingabe > obereGrenze || eingabe < untereGrenze) ;
            else {

                tempReihung[laengeNeu - 1] = eingabe;
                eingabeReihung = tempReihung;
                erfolgszaehler++;
                System.out.println("OK ");
            }

        } while (eingabeReihung.length < maximaleAnzahl);

        System.out.printf("Anzahl der Fehleingaben: %d %n", fehlerzaehler);
        System.out.printf("Anzahl der erfolgreichen Eingaben: %d %n", erfolgszaehler);

        this.eingabeReihung = eingabeReihung;

    }

    //Summer der einzelnen Elemente des Arrays
    public int berechneSumme() {

        int ergebnis = 0;

        for (int i = 0; i < eingabeReihung.length; i++) {

            ergebnis = ergebnis + eingabeReihung[i];
        }
        return ergebnis;
    }


    //Das Benutzer-Array zum String umwandeln
    public String toString() {

        String tempString = "";
        for (int i = 0; i < eingabeReihung.length; i++) {

            tempString += "[" + Integer.toString(eingabeReihung[i]) + "] ";
        }
        this.stringReihung = tempString;

        return this.stringReihung;
    }

    //Methode zum Sortieren des durch Benutzereingabe entstanden Arrays
    public int[] sortiereReihung() {

        Arrays.sort(eingabeReihung);
        return eingabeReihung;
    }

    //Methode die den kleinsten Wert der Reihung ausgibt
    public int getMin(){

        this.sortiereReihung();

        return eingabeReihung[0];
    }

    //Methode die den größten Wert der Reihung ausgibt
    public int getMax(){

        this.sortiereReihung();

        return eingabeReihung[eingabeReihung.length - 1];
    }

    //Methode zum Ausgeben der Array-Eigenschaften
    public void report() {

        //Grenzen des Objekts
        System.out.printf("untere Grenze der Reihung: %d %n", untereGrenze);
        System.out.printf("obere Grenze der Reihung: %d %n", obereGrenze);

        //Unsortierte Ausgabe des Arrays
        this.toString();
        System.out.printf("Ihre Reihung: %s %n", stringReihung);

        //Sortiere das durch den Benutzer eingegebene Array...
        this.sortiereReihung();
        //...und wandle es in einen String um...
        this.toString();
        //...und gebe es hier aus.
        System.out.printf("Ihre Reihung (sortiert): %s %n", stringReihung);

        //Gebe die kleinste Zahl des Arrays aus
        System.out.printf("Das kleinste Element der Reihung lautet %d %n", this.getMin());

        //Gebe die größte Zahl des Arrays aus
        System.out.printf("Das groesste Element der Reihung lautet %d %n", this.getMax());

        //Summe der Elemnte des aktuellen Arrays
        System.out.printf("Die Summe ihrer Reihung: %d %n", this.berechneSumme());
    }
}