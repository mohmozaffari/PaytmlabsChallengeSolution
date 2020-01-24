package com.paytmlabs.challenge.MovingAverage;

import java.util.List;

public interface MovingAverage {

	/**
	 * Gets the average of elements in the data structure.
	 * 
	 * @return The calculated average
	 */
	public Double getAverage();

	/**
	 * Add an element to the data structure. This method also keeps the sum of last N
	 * elements that are added to our data structure. This sum is used to calculate
	 * the average when getAverage API is called.
	 */
	public void addElement(Integer newElement);

	/**
	 * Gets all the elements in the data structure.
	 * 
	 * @return list of elements in the structure
	 */
	public List<Integer> getElementsInStructure();


}
