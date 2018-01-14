package vfh.Einsendeaufgabe_XI;

import vfh.EinleseMethode.Konsole;

public class RouteTest {

    public static void main (String args[]) {

        boolean auswahl = false;


        System.out.println("Herzlich Willkommen bei Chris' Rundreisen-Berechner v. 1.0");

        do {
            System.out.println();
            System.out.println("Wollen Sie selbst Staedte und Entfernungen festlegen (1), feste Vorgaben verwenden (2) oder das Programm beenden (0): ");
            int vorAuswahl = Konsole.getInputInt();

            switch (vorAuswahl){

                case 0: {
                    auswahl = true;
                    break;
                }
                case 1: {
                    //neues Objekt erstellen aus den Benutzereingaben

                    String[] userStaedte = Route.userStaedteTabelleFestlegen();
                    int[][] userEntfernung = Route.userEntfernungTabelleFestlegen(userStaedte);
                    Route rUser = new Route(userStaedte, userEntfernung);

                    //Methoden testen
                    System.out.println();
                    System.out.println("Dies sind die Ihnen zur Verfuegung stehenden Staedte und Entfernungen:");
                    rUser.zeigeTabelle();
                    System.out.println();
                    rUser.staedteFuerRundreiseEinlesen();
                    try {
                        rUser.routeDerRundReiseBerechnen(rUser.reise);
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    //neues Objekt erstellen mit festen Vorgaben
                    Route rDefault = new Route();

                    //Methoden testen
                    System.out.println();
                    System.out.println("Dies sind die Ihnen zur Verfuegung stehenden Staedte und Entfernungen:");
                    rDefault.zeigeTabelle();
                    System.out.println();
                    rDefault.staedteFuerRundreiseEinlesen();
                    try {
                        rDefault.routeDerRundReiseBerechnen(rDefault.reise);
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                default:
                    System.out.println("Eingabe fehlerhaft! Bitte erneut versuchen: ");
                    break;

            }

        } while (!auswahl);     //Solange auswahl false bleibt, läuft die Schleife

    }

}