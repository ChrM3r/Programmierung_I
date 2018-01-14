package vfh.Einsendeaufgabe_VIII;

/**
 * Klasse zum Testen der Klasse ErgaenztesAuto
 *
 * @author Chris Merscher
 * @version 1.1, 12/2017
 */

public class ErgaenztesAutoTest {

    public static void main(String[] args) {

        //Neue Objekte vom Typ ErgaenztesAuto erzeugen

        ErgaenztesAuto auto1 = new ErgaenztesAuto("Chris", "Schraeghecklimousine", "braun", 2016, 125, 33000, "Potsdam", "WOB7GH3LFFH9876");
        ErgaenztesAuto auto2 = new ErgaenztesAuto("Kathrin", "Kombi", "dunkelblau", 2010, 133, 246000, "Michendorf", "JHD844HKFH9PPK");
        ErgaenztesAuto auto3 = new ErgaenztesAuto("Martin", "Kombi", "schwarz", 2012, 136, 187000, "Potsdam", "KLG67D5LFFH9237");



        //Ausgabe Block I - Test der Methode getAlter()

        System.out.println("Das Auto von Chris ist " + auto1.getAlter() + " Jahr(e) alt.");
        System.out.println("Das Auto von Kathrin ist " + auto2.getAlter() + " Jahr(e) alt.");
        System.out.println("Das Auto von Martin ist " + auto3.getAlter() + " Jahr(e) alt.");



        //Ausgabe Block II - Test der Methode meldung()

        System.out.println(); //leere Zeile zur Formatierung der Ausgabe
        auto1.meldung();
        auto2.meldung();
        auto3.meldung();
        System.out.println(); //leere Zeile zur Formatierung der Ausgabe



        //Ausgabe Block III - Test der Methode setzeNeuesZiel(String ziel, int entfernung)

        auto1.setzeNeuesZiel("Bremen", 360);
        auto2.setzeNeuesZiel("Potsdam", 15);
        auto3.setzeNeuesZiel("Glindow", 5);


        //Ausgabe Block IV - Test der Methode toString()

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());

    }


}
