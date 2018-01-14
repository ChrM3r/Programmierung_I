package vfh.Einsendeaufgabe_III;
import java.util.Calendar;

/**
 * Klasse zum Erzeugen von Auto Objekten.
 *
 * @author Chris Merscher
 * @version 1.0, 12/2017
 */

public class ErgaenztesAuto {

    // Instanzvariablen
    private String besitzer;
    private String autotyp;
    private String farbe;
    private int erstzulassung;
    private int leistung;
    private int kmStand;
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
        this.besitzer = besitzer;
        this.autotyp = autotyp;
        this.farbe = farbe;
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
        this.kmStand = kmStand;
        this.standort = standort;
        this.fahrgestellnummer = fahrgestellnummer;
    }

    /**
     * Die Methode getAlter() dient zur Errechnung des Autoalters ueber die
     * Erstzulassung.
     *
     * @return int: Alter des Autos
     */
    public int getAlter() {
        // Ermittlung des aktuellen Jahres
        Calendar aktuellerKalender = Calendar.getInstance();
        int aktuellesJahr = aktuellerKalender.get(Calendar.YEAR);
        return aktuellesJahr - this.erstzulassung;
    }

    /**
     * Die Methode meldung() gibt die Attribute "farbe" und "besitzer" auf der
     * Standardausgabe aus.
     */
    public void meldung() {
        System.out.println("Hier gruesst das " + this.farbe + "e " + "Auto von " + this.besitzer );
    }


    /**
     * Die Methode toString() gibt alle Attribute der Objekte vom Typ ErgaenztesAuto
     * in einem formatierten String, sortiert, untereinander aus.
     *
     * @return String: formatierte Daten des Fahrzeugs
     */
    public String toString(){
        String alleDaten =
                "\n Besitzer: " + this.besitzer +
                "\n Autotyp: " + this.autotyp +
                "\n Farbe: " + this.farbe +
                "\n Erstzulassung: " + Integer.toString(this.erstzulassung) +
                "\n Leistung: " + this.leistung + "PS" +
                "\n Km-Stand: " + Integer.toString(this.kmStand) + "km" +
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

        System.out.println("Das Auto fährt von " + this.standort + " nach " + ziel + ".");
        System.out.println("Die Entfernung beträgt " + entfernung + "km.");
        this.standort = ziel;
        this.kmStand = this.kmStand + entfernung;
    }

}