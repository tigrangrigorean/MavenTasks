package com.tasks.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Generics<E>{
	
	/**
	 * This element exchange two Elements of ArrayList
	 * @param <E>
	 */
	void exchangeTwoElements() {
		E swap;
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(3);
		array.add(1);

		swap = (E) array.get(0);
		array.set(0, array.get(2));
		array.set(2, (Integer) swap);
		
	}
	
	/*Will the following class compile? If not, why? |  This class can't 
	 * complie, because  (>)
	 * operator applies only to primitive numeric types.
	 
	public final class Algorithm {
			public static <T> T max(T x, T y) {
			       return x > y ? x : y;
			        }
			}
	*/
	
	
	/**
	 * Method prints all elements of list
	 * @param list
	 */
		public static void print(List<? extends Number> list) {
			 for (Number n : list)
			   System.out.print(n + " ");
			   System.out.println();
			}
		
		/**
		 * Method gets max element in List
		 * @param begin
		 * @param end
		 * @return
		 */
		E maxElement(int begin, int end) {
			List array = new ArrayList();
			
			  E max = (E) array.get(begin);
		        for (int i = begin + 1; i < end; i++) {
		            E elem1 = (E) array.get(i);
		            if (((Integer) elem1).compareTo((Integer) max) > 0) {
		                max = elem1;
		            }
		        }
		        return max;
		}
		

}
