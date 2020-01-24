package com.paytmlabs.challenge.MovingAverage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Implements the moving average functionality. This class has a queue to hold
 * the last N elements that are added, and uses that to calculate the average of
 * the last N elements. Also it has list to hold all added element to the
 * structure.
 */
public class MovingAverageImpl implements MovingAverage {

	private Queue<Integer> lastElements = new LinkedList<>();
	private List<Integer> elements = new ArrayList<>();

	private int windowSize = 0;
	private double sum = 0.0;

	/**
	 * The constructor to initialize the number for the moving window (the last "N"
	 * element to calculate the average)
	 */
	public MovingAverageImpl(Integer n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Window size must be positive.");
		}
		windowSize = n;
	}

	@Override
	public void addElement(Integer newElement) {
		sum += newElement;
		lastElements.add(newElement);
		elements.add(newElement);

		// If size of the queue is bigger than size of window, remove the element from
		// queue and subtract the value from the sum
		if (lastElements.size() > windowSize)
			sum -= lastElements.remove();

	}

	@Override
	public Double getAverage() {
		if (lastElements.isEmpty())
			return 0.0;
		return sum / lastElements.size();
	}

	@Override
	public List<Integer> getElementsInStructure() {
		return elements;
	}

}
