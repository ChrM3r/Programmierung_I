package vfh.Methoden_Uebung_1;

public class UebungMet01 {

    public static void main(String[] args) {
        int i = 0;
        iAendern(i);
        System.out.println("Der Wert von i ist " + i);
    }

    static void iAendern(int x) {
        /*
         * Verändern Sie den Wert für x, indem Sie den Wert
         * um 10 erhöhen. Geben Sie diesen Wert mittels
         * System.out.println()-Anweisung in der Methode
         * aus
         */
        x =+ 40;
        System.out.println("i verändert ist " + x);
    }
}