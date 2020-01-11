package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import api.FIFO;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FifoUnitTest {
	protected int values1;
	protected int values2;
	protected FIFO fifo;

	@BeforeEach
	void setUp() throws Exception {
		this.values1 = 10;
		this.values2 = 20;
		this.fifo = new FIFO();

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testFIFO_First_ShouldThrow() {
		assertThrows(NoSuchElementException.class, () -> fifo.first());

	}

	@Test
	public void TestFIFO_First_ShouldbeTrue() {
		fifo.add(values1);
		fifo.add(values2);
		int firstValues = fifo.first();
		assertEquals(values1, firstValues);

	}

	@ParameterizedTest
	@ValueSource(ints = { 10, 20, 50, 125 })
	void testFIFO_add_int(int param) {
		fifo.add(param);
		int values2 = fifo.first();
		assertEquals(param, values2);

	}

	@Test
	void testFIFO_isEmpty_shouldBeTrue() {
		assertTrue(fifo.isEmpty());
	}

	@Test
	public void testFIFO_RemoveFirst_ShouldThrow() {
		assertThrows(NoSuchElementException.class, () -> fifo.removeFirst());
	}

	@Test
	void testFIFO_removeFirst() {

		fifo.add(values1);
		fifo.add(values2);

		int firstValues = fifo.first();
		fifo.removeFirst();

		firstValues = fifo.first();
		assertEquals(values2, firstValues);
	}

	@Test
	void testFIFO_size() {
		int size = fifo.size();
		assertEquals(0, size);

		fifo.add(values1);
		size = fifo.size();
		assertEquals(1, size);

		fifo.add(values2);
		size = fifo.size();
		assertEquals(2, size);

	}

}
