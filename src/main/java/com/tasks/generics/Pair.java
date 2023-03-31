package com.tasks.generics;

/**
 * Class for Pairs
 *
 * @param <T>
 * @param <E>
 */
public class Pair <T,E>{
	
	  private T firstOb;
	  private E secondOb;
	  
	/**
	 * @param firstOb
	 * @param secondOb
	 */
	public Pair(T firstOb, E secondOb) {
		super();
		this.firstOb = firstOb;
		this.secondOb = secondOb;
	}
	  
	  

}
