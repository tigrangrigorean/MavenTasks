package com.tasks.queue_exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercises {

	/**
	 * Method add element in queue
	 */
	void addElementQueue() {
		Queue queue = new LinkedList();
		
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		
	}
	
	/**
	 * Method add element in deque
	 */
	void addElementDeque() {
		Deque deque = new LinkedList();
		
		deque.add(1);
		deque.add(4);
		deque.add(3);
		deque.add(2);
	}
	
	/**
	 * Method create queue, add elements
	 */
	void queueOfIntegers() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		
		System.out.println(queue);
		
	}
	
	/**
	 * Method check are queue contains element
	 * @param <E>
	 * @return
	 */
	<E> boolean checkQueue(E element) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		
		if(queue.contains(element)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Method remove Elements in Queue
	 */
	void removeAllElements() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(2);
	}
	
	/**
	 * Method create queue of Strings
	 */
	void queueOfStrings() {
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("a");
		queue.add("Hi");
		queue.add("No");
		
		
		while(!queue.isEmpty()) {
		queue.poll();
		}
		System.out.println(queue);
		
		
		
	}
	
	/**
	 * Method create deque of Integers,and check contains deque element or not
	 */
	void dequeOfIntegers() {
		Deque deque = new ArrayDeque();
		
		deque.add(1);
		deque.add(4);
		deque.add(3);
		deque.add(2);
		
		System.out.println(deque);
		
	}
	
	/**
	 * Method check are Deque contains element
	 * @param <E>
	 * @param element
	 */
	<E> boolean checkDeque(E element) {
	Deque deque = new ArrayDeque();
		
		deque.add(1);
		deque.add(4);
		deque.add(3);
		deque.add(2);
		
		
		if(deque.contains(element)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Method removes all elements in Deque
	 */
	void removeElementsDeque() {
		
		Deque deque = new ArrayDeque();
		
		deque.add(1);
		deque.add(4);
		deque.add(3);
		deque.add(2);
		
		while(!deque.isEmpty()) {
			deque.poll();
		}
		System.out.println(deque);

	}
	
	/**
	 * Method print all numbers from queue and removes elements
	 */
	void printAllNumbersQueue() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
	
	/**
	 * Method creates Priority Queue and print colors
	 */
	void printColorsQueue() {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		
		System.out.println(queue);
	}
	
	/**
	 * Method clone Queue
	 */
	void cloneQueue() {
		Queue<String> queue = new PriorityQueue<String>();
		Queue<String> queue2 = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");

		Iterator<String> it = queue.iterator();
		while(it.hasNext())  {
		   queue2.add(it.next());
		}
		
		System.out.println(queue2);
	}
	
	/**
	 * Method removes first element of Queue
	 */
	
	void removeFirstElementQueue() {
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		
		queue.poll();
		System.out.println(queue);
	}
		
	
}
