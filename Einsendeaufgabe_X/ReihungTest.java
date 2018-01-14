package vfh.Einsendeaufgabe_X;

import vfh.EinleseMethode.Konsole;

public class ReihungTest {

    public static void main (String args[]){


        System.out.println("Herzlich Willkommen bei Chris' Intervall-Tester v. 1.0");
        System.out.println("Wollen Sie selber Vorgaben eingeben (1) oder feste Vorgaben verwenden (2): ");
        int reihung[] = new int[3];
        boolean auswahl = false;

        do {
            int vorauswahl = Konsole.getInputInt();

            if (vorauswahl == 1) {
                //Intervall durch Benutzereingabe festlegen

                System.out.println("Legen Sie die Grenzen der Reihung fest: ");

                System.out.print("untere Grenze: ");
                reihung[0] = Konsole.getInputInt();

                System.out.print("obere Grenze: ");
                reihung[1] = Konsole.getInputInt();

                System.out.print("maximale Anzahl der Elemente: ");
                reihung[2] = Konsole.getInputInt();

                auswahl = true;

                //neues Objekt erstellen aus den Benutzereingaben
                Reihung r1 = new Reihung(reihung);

                //Methoden testen
                r1.einlesen();
                r1.report();

            } else if (vorauswahl == 2) {

                //neues Objekt erstellen mit festen Vorgaben
                Reihung r2 = new Reihung(-3, 6, 7);

                auswahl = true;

                System.out.printf("Es wird ein Objekt mit obereGrenze = %d, untereGrenze = %d und maximaleAnzahl = %d erstellt %n", r2.getObereGrenze(), r2.getUntereGrenze(), r2.getMaximaleAnzahl());
                r2.einlesen();
                r2.report();

            } else System.out.println("Eingabe fehlerhaft! Bitte erneut versuchen: ");

        } while (auswahl == false);

    }

}
