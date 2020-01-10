package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test {
	
	protected int values1;
	protected int values2;

	@BeforeEach
	void setUp() throws Exception {
		this.values1 = 10;
		this.values2 = 20;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	

}
