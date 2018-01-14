package vfh.Uebung1_Praesenz;

/**
 * Beschreibung :
 *
 * @author      Chris Merscher
 * @version     1.01, 01.03.2000
 */

public class Uebung1_Quadrat {

  private double l_feet;
  private double w_feet;
  private static final double CONERVERSIION_RATE = 0.09290304;

  public static double feet_square (double l_feet, double w_feet){

      return l_feet * w_feet;
  }

  public static double feet_in_meters (double l_feet, double w_feet){

      return (l_feet * w_feet)* CONERVERSIION_RATE;
  }
}

