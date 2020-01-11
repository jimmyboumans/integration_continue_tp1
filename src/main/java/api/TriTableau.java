package api;

import java.io.IOException;

public class TriTableau {

	public static void trier(int tab[])
			throws ArrayIndexOutOfBoundsException, NullPointerException, IllegalArgumentException {

		if (tab == null)
			throw new NullPointerException("Can't handle null arrays");
		if (tab.length == 0)
			throw new IllegalArgumentException("Can't handle zero-length arrays.");

		triCroissant(tab);

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

		triDecroissant(tab);

		System.out.println("\n");

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

	}

	public static void triCroissant(int tableau[]) throws ArrayIndexOutOfBoundsException, NullPointerException, IllegalArgumentException{
		
		if (tableau == null)
			throw new NullPointerException("Can't handle null arrays");
		if (tableau.length == 0)
			throw new IllegalArgumentException("Can't handle zero-length arrays.");
		
		int longueur = tableau.length;
		int tampon = 0;
		boolean permut;

		do {
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				if (tableau[i] > tableau[i + 1]) {
					tampon = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	}

	public static void triDecroissant(int tableau[])  throws ArrayIndexOutOfBoundsException, NullPointerException, IllegalArgumentException{
		
		if (tableau == null)
			throw new NullPointerException("Can't handle null arrays");
		if (tableau.length == 0)
			throw new IllegalArgumentException("Can't handle zero-length arrays.");
		int longueur = tableau.length;
		int tampon = 0;
		boolean permut;

		do {
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				if (tableau[i] < tableau[i + 1]) {
					tampon = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	}

}