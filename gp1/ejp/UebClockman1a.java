import de.vfh.gp1.bib.clockman.Clockman_Frame;

import java.awt.*;

/**
 * Beschreibung : Ein erstes Programm zum Kennenlernen von Java.
 *
 * @author      Chris Merscher
 * @version     1.01, 01.03.2000
 */

public class UebClockman1a {

  /**
   * Soll die Klasse von der Eingabekonsole aus aufgerufen werden koennen,
   * dann muss die hier aufgefuehrte main-Methode enthalten sein.
   * Diese Methode ist der definierte Einstiegspunkt fuer die Ausfuehrung.
   */
  public static void main(String[] args)
  {
    // Reserviere fuer die Klasse "Clockman" eine Variable mit dem Namen
    // "meinClockman".
    Clockman_Frame meinClockman;

    Color colMeineFarbe = new Color(173, 225, 238);
    // Fuelle die Variable "meinClockman" mit einer neuen Instanz der Klasse
    // "Clockman".
    meinClockman = new Clockman_Frame(400,400);
    meinClockman.setzeGesichtsfarbe(colMeineFarbe);
  }

}