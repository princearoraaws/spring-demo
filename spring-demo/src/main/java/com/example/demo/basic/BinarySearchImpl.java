package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;
	
	
	
	
	/*
	 * public BinarySearchImpl(SortAlgo sortAlgo) { super(); this.sortAlgo =
	 * sortAlgo; }
	 */
	 



	/*
	 * public void setSortAlgo(SortAlgo sortAlgo) { this.sortAlgo = sortAlgo; }
	 */




	public int binarySearch(int[] numbers, int numberToSearch) {
		
		numbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		return 0;
	}

}
