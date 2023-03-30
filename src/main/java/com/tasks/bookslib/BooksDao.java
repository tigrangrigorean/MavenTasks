package com.tasks.bookslib;

import java.util.ArrayList;

public class BooksDao {
	
	ArrayList<BooksLib> list = new ArrayList<BooksLib>();
	
	/**
	 * Method add new element
	 */
	public void add(String title, String author, int year) {
		Books temp = new Books(title,author,year);
		BooksLib booksLib = new BooksLib("NameOfLib",temp);
		list.add(booksLib);
	}
	
	/**
	 * Method iterate all elements
	 */
	public void iterate() {
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	/**
	 * Method search by title
	 */
	public void searchByTitle(String title) {
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				System.out.println("Your books index: " + i);
			}
		}
	}
	
	

}
