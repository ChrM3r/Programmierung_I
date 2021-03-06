package vfh.Einsendeaufgabe_I.ejp;
import vfh.Einsendeaufgabe_I.bib.clockman.*;
import java.awt.Color;

/**
 * Beschreibung : Ein erstes Programm zum Kennenlernen von Java.
 *
 * @author      Chris Merscher
 * @version     1.01, 01.03.2000
 */

public class UebClockman{

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

    // Fuelle die Variable "meinClockman" mit einer neuen Instanz der Klasse
    // "Clockman".
    meinClockman = new Clockman_Frame(400,400);
  }

}