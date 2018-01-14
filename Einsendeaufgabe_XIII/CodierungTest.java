package vfh.Einsendeaufgabe_XIII;

import vfh.gp1.bib.Konsole;

public class CodierungTest {

    public static void main(String args[]) {

        System.out.println("Herzlich Willkommen bei Chris' String-Codierer v. 1.0");

        String klarText = Konsole.getInputString("Bitte geben Sie den zu verschluesselnden Text ein: ");
        Codierung c1 = new Codierung(Konsole.getInputInt("Schluessel 1 (Zeilen): "), Konsole.getInputInt("Schluessel 2 (Spalten): "));
        System.out.println();
        try {
            c1.verschluessleText(klarText);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
