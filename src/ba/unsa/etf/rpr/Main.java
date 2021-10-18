package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Kreirati Java program koji omogućuje unos dva cijela broja i njihov ispis na ekran

        int x, y;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        x = ulaz.nextInt();
        System.out.println("Unesite drugi broj: ");
        y = ulaz.nextInt();

        System.out.println("Unijeli ste brojeve " + x  + " i " + y + ".");
    }
}
