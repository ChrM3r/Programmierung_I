package vfh.Einsendeaufgabe_VII;
/**
 * Beschreibung : Test-Klasse unm den Rauten-Ersteller zu testen
 *
 * @author      Chris Merscher
 * @version     1.0, 16.12.2017
 */

public class RauteTest {
    public static void main(String[] args) {

        System.out.println("Hallo, und herzlich Willkommen zu Chris' Rauten-Ersteller Version 1.0");
        System.out.println();


        Raute r1 = new Raute(10,"*");
        System.out.println("Raute 1: \n");
        r1.erstelleRaute();
        System.out.println();

        Raute r2 = new Raute(19,"+");
        System.out.println("Raute 2: \n");
        r2.erstelleRaute();
        System.out.println();

        Raute r3 = new Raute(14,"*+*+");
        System.out.println("Raute 3: \n");
        r3.erstelleRaute();
        System.out.println();

        Raute r4 = new Raute(3,"#");
        System.out.println("Raute 4: \n");
        r4.erstelleRaute();
        System.out.println();

        Raute r5 = new Raute(2,"-");
        System.out.println("Raute 5: \n");
        r5.erstelleRaute();
    }
}

