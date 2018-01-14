package vfh.Einsendeaufgabe_VI;

public class Geschenkpapier {

    int zeilen;
    int spalten;
    String muster1;
    String muster2;

    //Konstruktor 1 für das Geschenkpapier mit einem Muster
    public Geschenkpapier(int zeilen, int spalten, String muster) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.muster1 = muster;
    }

    //Konstruktor 2 für das Geschenkpapier mit verschiedenem Muster
    public Geschenkpapier(int zeilen, int spalten, String muster1, String muster2) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.muster1 = muster1;
        this.muster2 = muster2;
    }

    public void erstelleGleichesMuster() {

        int x = 1;
        String ausgabe = "";


        for (int i = 1; i <= zeilen; i++) {
            while (x <= spalten) {
                ausgabe = ausgabe + muster1;    //Hier wird die Zeile erstellt und in ausgabe gespeichert
                x++;
            }
            System.out.println(ausgabe);
        }
    }

    public void erstelleVerschiedenesMuster() {

        int x = 1;
        int i = 1;
        String ausgabe1 = "";
        String ausgabe2 = "";


        do {
            while (x <= spalten) {
                ausgabe1 = ausgabe1 + muster1;  //Hier werden die beiden ausgabe-Strings generiert
                ausgabe2 = ausgabe2 + muster2;
                x++;
            }
            System.out.println(ausgabe1);

            if (i == zeilen) {                  //damit bei ungeraden Zeilenvorgaben nicht eine Zeile zu viel ausgegeben wird
                break;
            }
            else {
                System.out.println(ausgabe2);
            }
            i = i + 2;                          //+2 da ja immer 2 Zeilen pro Durchlauf erstellt werden
        } while (i <= zeilen);

    }
}
