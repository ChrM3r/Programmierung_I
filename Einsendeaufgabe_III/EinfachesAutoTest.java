package vfh.Einsendeaufgabe_III;
/**
 * Klasse zum Testen der Klasse EinfachesAuto.
 *
 * @author Chris Merscher
 * @version 1.0, 12/2017
 */


public class EinfachesAutoTest {

    public static void main(String[] args) {

        EinfachesAuto auto1 = new EinfachesAuto("Chris", "Schräghecklimousine", "braun", 2016, 125, 33000);
        EinfachesAuto auto2 = new EinfachesAuto("Kathrin", "Kombi", "dunkelblau", 2010, 133, 246000);
        EinfachesAuto auto3 = new EinfachesAuto("Martin", "Kombi", "schwarz", 2012, 136, 187000);

        System.out.println("Das Auto von Chris ist " + auto1.getAlter() + " Jahr(e) alt.");
        System.out.println("Das Auto von Kathrin ist " + auto2.getAlter() + " Jahr(e) alt.");
        System.out.println("Das Auto von Martin ist " + auto3.getAlter() + " Jahr(e) alt.");
        auto1.meldung();
        System.out.println();
        auto2.meldung();
        System.out.println();
        auto3.meldung();

    }


}
