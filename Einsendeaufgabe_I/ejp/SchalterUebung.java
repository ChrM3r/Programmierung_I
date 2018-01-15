package vfh.Einsendeaufgabe_I.ejp;
/**
 * Beschreibung :
 *
 * @author      Chris Merscher
 * @version     1.01, 01.03.2000
 */

public class SchalterUebung {

  /**
   * Soll die Klasse von der Eingabekonsole aus aufgerufen werden koennen,
   * dann muss die hier aufgefuehrte main-Methode enthalten sein.
   * Diese Methode ist der definierte Einstiegspunkt fuer die Ausfuehrung.
   */
  public static boolean Schalter (boolean schalt1, boolean schalt2){
    return ((schalt1 && !schalt2)||(!schalt1 && schalt2));

  }

}