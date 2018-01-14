package vfh.Einsendeaufgabe_VI;

public class GeschenkpapierTest {

    public static void main(String[] args) {

        Geschenkpapier geschenk1 = new Geschenkpapier(5, 9, "** ");
        geschenk1.erstelleGleichesMuster();

        System.out.println();

        Geschenkpapier geschenk2 = new Geschenkpapier(10, 12, ":-) ", "(-: ");
        geschenk2.erstelleVerschiedenesMuster();
    }
}
