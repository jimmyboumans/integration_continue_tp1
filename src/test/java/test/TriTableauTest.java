package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import api.TriTableau;


class TriTableauTest {

	protected TriTableau trieur;
	protected int[] tab = { 4, 2, 5, 3, 1 };
	protected int[] tabC = { 1, 2, 3, 4, 5 };
	protected int[] tabD = { 5, 4, 3, 2, 1 };

	@BeforeEach
	void setUp() throws Exception {
		this.trieur = new TriTableau();

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void TriTableau_trier_ShoulThrowNullPointerException() {
		int[] nullTab = null;
		assertThrows(NullPointerException.class, () -> trieur.trier(nullTab));
	}
	
	@Test
	void TriTableau_trier_ShouldIllegalArgumentException() {
		int[] emptyTab = {};
		assertThrows(IllegalArgumentException.class, () -> trieur.trier(emptyTab));
	}

	@Test
	void TriTableau_triCroissant() {
		trieur.triCroissant(tab);

		assertArrayEquals(tabC, tab);

	}

	@Test
	void TriTableau_triDecroissant() {
		trieur.triDecroissant(tab);

		assertArrayEquals(tabD, tab);

	}
	@Test
	void TriTableau_triCroissant_empty() {
		
		int[] emptyTab = {};
		assertThrows(IllegalArgumentException.class, () -> trieur.triCroissant(emptyTab));


	}
	void TriTableau_triCroissant_null() {
		
		int[] nullTab = {};
		assertThrows(IllegalArgumentException.class, () -> trieur.triCroissant(nullTab));


	}
	
	@Test
	void TriTableau_triDecroissant_empty() {
		
		int[] emptyTab = {};
		assertThrows(IllegalArgumentException.class, () -> trieur.triDecroissant(emptyTab));


	}
	void TriTableau_triDecroissant_null() {
		
		int[] nullTab = {};
		assertThrows(IllegalArgumentException.class, () -> trieur.triDecroissant(nullTab));


	}


}
