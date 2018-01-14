package vfh.Uebung1_Praesenz;
import java.util.Scanner;

/**
 * Beschreibung :
 *
 * @author      Chris Merscher
 * @version     1.01, 01.03.2000
 */

public class Uebung1_Praesenz {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bitte Länge eingeben:");
    double laenge = scanner.nextInt();

    System.out.println("Bitte Breite eingeben:");
    double breite = scanner.nextInt();

    System.out.println("Die Quadratfüße betragen " + Uebung1_Quadrat.feet_square(laenge, breite));
    System.out.println("Die Quadratmeter betragen " + Uebung1_Quadrat.feet_in_meters(laenge, breite));

    System.out.printf("Die Quadratfüße sind %f und die Quadratmeter betragen %f", Uebung1_Quadrat.feet_square(laenge,breite), Uebung1_Quadrat.feet_in_meters(laenge, breite));
    scanner.close();
  }

}