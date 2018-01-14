package vfh.Einsendeaufgabe_VIII;
import java.util.Calendar;

/**
 * Klasse zum Erzeugen von Auto Objekten.
 *
 * @author Sandra Kaltofen
 * @version 1.02, 07/2012
 */

public class EinfachesAuto {

    // Instanzvariablen
    private String besitzer;
    private String autotyp;
    private String farbe;
    private int erstzulassung;
    private int leistung;
    private int kmStand;

    //Getter zum Abrufen der Instanzvariablen aus den Subklassen heraus
    public String getBesitzer() {
        return besitzer;
    }

    public String getAutotyp() {
        return autotyp;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getErstzulassung() {
        return erstzulassung;
    }

    public int getLeistung() {
        return leistung;
    }

    public int getKmStand() {
        return kmStand;
    }


    //Setter zum Setzen der Instanzvariablen aus den Subklassen heraus
    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    /**
     * Konstruktor fuer die Klasse EinfachesAuto
     *
     * @param besitzer  Name des Autobesitzers
     * @param autotyp Typ des Autos
     * @param farbe  Farbe des Autos
     * @param erstzulassung Jahreszahl der Autozulassung
     * @param leistung PS-Zahl des Autos
     * @param kmStand Kilometerstand des Autos
     */

    public EinfachesAuto(String besitzer, String autotyp, String farbe,
                         int erstzulassung, int leistung, int kmStand) {
        this.besitzer = besitzer;
        this.autotyp = autotyp;
        this.farbe = farbe;
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
        this.kmStand = kmStand;
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
        System.out.print("Hier gruesst das " + this.farbe + "e ");
        System.out.println("Auto von " + this.besitzer);
    }

}