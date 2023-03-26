package com.tasks.homework16;

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
	 * Method create queue, add elements and remove all elements, check queue contains element or not
	 */
	void queueOfIntegers() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(1);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		
		System.out.println(queue);
		
		if(queue.contains(2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		while(!queue.isEmpty()) {
		queue.poll();
		}
		System.out.println(queue);
	}
	
	/**
	 * Method create queue of Strings
	 */
	void queueOfStrings() {
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("a");
		queue.add("Hi");
		queue.add("No");
		
		
		
	}
	
	/**
	 * Method create deque of Integers, remove elements from deque and check contains deque element or not
	 */
	void dequeOfIntegers() {
		Deque deque = new ArrayDeque();
		
		deque.add(1);
		deque.add(4);
		deque.add(3);
		deque.add(2);
		
		System.out.println(deque);
		
		if(deque.contains(2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

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
		
		System.out.println(queue.poll());
	}
		
	
}
