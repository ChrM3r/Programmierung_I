package vfh.Einsendeaufgabe_VIII;
import java.util.Calendar;

/**
 * Klasse zum Erzeugen von Auto Objekten  - diesmal mit Vererbung
 *
 * @author Chris Merscher
 * @version 1.1, 12/2017
 */

public class ErgaenztesAuto extends EinfachesAuto{

    // Instanzvariablen

    private String standort;
    private String fahrgestellnummer;

    /**
     * Konstruktor fuer die Klasse ErgaenztesAuto
     *
     * @param besitzer  Name des Autobesitzers
     * @param autotyp Typ des Autos
     * @param farbe  Farbe des Autos
     * @param erstzulassung Jahreszahl der Autozulassung
     * @param leistung PS-Zahl des Autos
     * @param kmStand Kilometerstand des Autos
     * @param standort aktueller Standort
     * @param fahrgestellnummer Fahrgestellnummer des Autos
     */

    public ErgaenztesAuto(String besitzer, String autotyp, String farbe,
                          int erstzulassung, int leistung, int kmStand,
                          String standort, String fahrgestellnummer) {
        super(besitzer, autotyp, farbe, erstzulassung, leistung, kmStand);
        this.standort = standort;
        this.fahrgestellnummer = fahrgestellnummer;
    }


    /**
     * Die Methode toString() gibt alle Attribute der Objekte vom Typ ErgaenztesAuto
     * in einem formatierten String, sortiert, untereinander aus.
     *
     * @return String: formatierte Daten des Fahrzeugs
     */
    public String toString(){
        String alleDaten =
                "\n Besitzer: " + this.getBesitzer() +
                "\n Autotyp: " + this.getAutotyp()+
                "\n Farbe: " + this.getFarbe() +
                "\n Erstzulassung: " + Integer.toString(this.getErstzulassung()) +
                "\n Leistung: " + this.getLeistung()+ "PS" +
                "\n Km-Stand: " + Integer.toString(this.getKmStand()) + "km" +
                "\n Aktueller Standort: " + this.standort +
                "\n Fahrgestellnummer: " + this.fahrgestellnummer;

        return alleDaten;
    }


    /**
     * Die Methode setzeNeuesZiel() gibt die Parameter "ziel" und "entfernung",
     * sowie das Objektattribut "standort" auf der Standardausgabe aus, setzt den
     * "standort" des aktuellen Objekts auf den Wert von "ziel" und errechnet den
     * Kilometerstand anhand des aktuellen Wertes "kmStand", addiert mit "entfernung".
     */
    public void setzeNeuesZiel(String ziel, int entfernung){

        System.out.println("Das Auto faehrt von " + this.standort + " nach " + ziel + ".");
        System.out.println("Die Entfernung betraegt " + entfernung + "km.");
        this.standort = ziel;
        this.setKmStand(this.getKmStand() + entfernung);
    }

}