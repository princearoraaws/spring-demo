package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */



	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	


	public int binarySearch(int[] numbers, int numberToSearch) {

		// Sort an array
		//BubbleSortAlgorithm bSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortednumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array

		// return the result
		return 0;
	}




}
