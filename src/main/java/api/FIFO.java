package api;
import java.util.ArrayList;

import java.util.NoSuchElementException;

/**
 * A FIFO queue for Integers.
 */
public class FIFO {
	private ArrayList<Integer> queue = new ArrayList<Integer>();

	/**
	 * Adds the Integer to the end of the queue.
	 * 
	 * @param Integer The Integer to add to queue.
	 */
	public void add(Integer myInt) {
		queue.add(myInt);
	}

	/**
	 * Returns the first Integer in the queue. If the queue is empty, a
	 * NoSuchElementException is thrown.
	 * 
	 * @return The first Integer in queue.
	 * @throws NoSuchElementException If the queue is empty.
	 */
	public Integer first() throws NoSuchElementException {
		if (queue.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			return queue.get(0);
		}
	}

	/**
	 * This method returns true if the queue is empty of Integers.
	 * 
	 * @return True if the queue is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/**
	 * Removes the first Integer from the queue. If the queue is empty, a
	 * NoSuchElementException is thrown.
	 * 
	 * @throws NoSuchElementException If queue is empty.
	 */
	public void removeFirst() throws NoSuchElementException {
		if (queue.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			queue.remove(0);
		}
	}

	/**
	 * Returns the number of elements in the queue.
	 * 
	 * @return The current size of the queue.
	 */
	public int size() {
		return queue.size();
	}
}
