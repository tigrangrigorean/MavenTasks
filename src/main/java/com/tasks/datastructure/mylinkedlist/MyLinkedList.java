package com.tasks.datastructure.mylinkedlist;

public class MyLinkedList<E>{
	
	private Node<E> head;
	private Node<E> tail;
	
	private int size;
	
	/**
	 * Constructor
	 */
	public MyLinkedList() {
		head = null;
		tail = null;
	}
	
	/**
	 * Method return List empty or not
	 * @return
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/**
	 * Method gets Element by index
	 * @param index
	 * @return
	 */
	 public E get(int index) {

	        Node temp = head;
	        int counter = 0;
	        while (temp != null){
	            if (counter == index){
	                return (E) temp.item;
	            }
	            counter++;
	            temp = temp.next;
	        }
	        throw  new ArrayIndexOutOfBoundsException();
	    }

	
	/**
	 * Method adds an element to the beginning
	 * @param e
	 */
	public void addFirst(E e) {
		Node temp = new Node(e);
		
		if(isEmpty()) {
			tail = temp;
		} else {
			head.prev = temp;
		}
		
		temp.next = head;
		head = temp;
		size++;
	}

	/**
	 * Method adds an element to the end
	 * @param e
	 */
	public void addLast(E e) {
		Node temp = new Node(e);
		
		if(isEmpty()) {
			head = temp;
		} else {
			tail.next = temp;
		}
		
		temp.prev = temp;
		tail = temp;
		size++;
	}
	
	/**
	 * Method set element
	 * @param index
	 * @param element
	 */
	 public void set(int index,E element){
	        Node temp = head;
	        int counter = 0;

	        while (temp != null){
	            if (index == counter){
	                temp.item = element;
	                return;
	            }
	            temp = temp.next;
	            counter++;
	        }
	    }

	
	/**
	 * Method clear LinkedList
	 */
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
	
	/**
	 * Method removes first element
	 */
	public void removeFirst() {
		Node temp = head;
		
		if(head.next == null) {
			tail = null;
		} else {
			head.next.prev = null;
		}
		head = head.next;
		size--;
	}
	
	/**
	 * Method removes last element
	 */
	public void removeLast() {
		Node temp = head;
		
		if(head.next == null) {
			tail = null;
		} else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		size--;
	}
	
	/**
	 * Method reverse Linked List
	 */
	public void reverse() {
		Node temp = tail;
		System.out.print("[ ");
		while(temp != null) {
			System.out.print(temp.item + "," + " ");
			temp = temp.prev;
		}
		System.out.print("]\n");
	}
	
	/**
	 * Method return size of LinkedList
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * This method clone LinkedList
	 * @param list
	 */
	public void cloneLinkedList(MyLinkedList list) {
		Node temp = head;
		Node newTemp;
		while(temp != null) {
			newTemp = temp;
			list.addFirst(newTemp.item);
			temp = temp.next;
		}
	}
	
	/**
	 * Method check LinkedList contains element or not
	 * @param element
	 * @return
	 */
	 public boolean contains(E element){
	        Node temp = head;
	        while (temp != null){
	            if (temp.item.equals(element)){
	                return true;
	            }
	            temp = temp.next;
	        }
	        return false;
	    }
	
	 
	/**
	 * Method prints all elements of LinkedList
	 */
	public void print() {
		Node temp = head;
		System.out.print("[ ");
		while(temp != null) {
			System.out.print(temp.item + "," + " ");
			temp = temp.next;
		}
		System.out.print("]\n");
	}
	
	
	
}
