package com.tasks.datastructure.myarraylist;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;


public class MyArrayList<E> extends AbstractList<E>

implements List<E>, RandomAccess, Cloneable, java.io.Serializable{

	private static final long serialVersionUID = 5214260734784743380L;
	
	private int capacity = 10;
	private Object[] array = new Object[capacity];
	private int size;
	private int index;
	
	
	/**
	 * Method expand Array length
	 */
	private void createNewArray() {
		int newCapacity = capacity + 16;
		Object[] expandArray = new Object[newCapacity];
		System.arraycopy(array, 0,expandArray,0,capacity);
		array = expandArray;
		capacity = newCapacity;
	}
	
	

	/**
	 * Method get element by index
	 */
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return (E) array[index];
	}

	/**
	 * Method return size of Arraylist
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}



	/**
	 * Method check Arraylist is empty or not
	 */
	@Override
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}



	/**
	 * Method check Arraylist contains object or not
	 */
	@Override
	public boolean contains(Object o) {
		
		for(int i = 0; i<size; i++) {
			if(array[i].equals(o)) {
				return true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Method add new element
	 */

	@Override
	public boolean add(E e) {
		if(index >= array.length) {
			createNewArray();
		}
		array[index++] = e;
		size++;
		return true;
	}

	
	/**
	 * This method add collection in Arraylist
	 */
	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean flag = false;
		for (E element: c) {
			add(element);
			flag = true;
		}
		return flag;
	}


	/**
	 * Method removes all elements from array, and reset array capacity to 10
	 */
	@Override
	public void clear() {
		capacity = 10;
		array = new Object[capacity];
		size = 0;
	}



	/**
	 * Method set element by index
	 */
	@Override
	public E set(int index, E element) {
		if(index < size) {
			array[index] = element;
		}
		if(index == size) {
			array[index] = element;
			size++;
		}
		return null;
	}




	/**
	 * Method remove Element by index
	 */
	@Override
	public E remove(int index) {
		
		E element = get(index);
		for (int i=index; i<size-1; i++) {
			array[i] = array[i+1];
		}
		size--;
		return element;
	}
	




	/**
	 * Method return index of object
	 */
	@Override
	public int indexOf(Object o) {
		for (int i = 0; i<size; i++) {
			if (o.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}



	/**
	 * Method return last index of object
	 */
	@Override
	public int lastIndexOf(Object o) {
		for (int i = size-1; i>=0; i--) {
			if (o.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Method return list iterator
	 */
	@Override
	public Iterator<E> iterator() {
		
		E[] copy = (E[]) Arrays.copyOf(array, size);
		
		return Arrays.asList(copy).iterator();
	}
	
	/**
	 * Method iterateAllElements in list, and return boolean value
	 * @return
	 */
	public boolean iterateAllElements() {
		
		for(int i = 0; i<size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		return true;
	}

	/**
	 * Method add element to the beginning of the arraylist
	 * @param element
	 * @return
	 */
	public boolean addFirstElement(E element) {
		
		Object[] newArray = new Object[array.length];
		System.arraycopy(array, 0,newArray,0,capacity);
		
		for(int i = 1; i<=size;i++) {
			array[i] = newArray[i-1];
		}
		array[0] = element;
		size++;
		
		return true;
		
	}
	
	public boolean reverse() {
		Object[] newArray = new Object[array.length];
		System.arraycopy(array, 0,newArray,0,capacity);
		
		for(int i = 0, j = size-1; i<size; i++,j--) {
			array[i] = newArray[j];
		}
		
		return true;
	}

	/**
	 * Method swap two elements
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean swapTwoElements(int i, int j) {
		E swap = (E) array[i];
		
		array[i] = array[j];
		array[j] = swap;
		return true;
	}
	
	/**
	 * Method print odd numbers of array
	 */
	public void printOddNumbers() {
		System.out.print("[");
		for(int i = 0; i<size; i++) {
			if((int) array[i]% 2 != 0) {
				System.out.print(array[i] + ",");
			}
		}
		System.out.println("]\n");
	}

	/**
	 * Method print Arraylist
	 */
	@Override
	public String toString() {
		String elements = "";
		for(int i = 0; i<size; i++) {
			if(i<size-1) {
			elements += array[i] + ", ";
			} else {
				elements += array[i];
			}
		}
		return "[" + elements + "]";
	}
	
	
}
