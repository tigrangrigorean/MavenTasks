package com.tasks.bookslib;

public class BooksLib {

	private String name;
	private Books books;
	
	
	
	/**
	 * @param name
	 * @param books
	 */
	public BooksLib(String name, Books books) {
		this.name = name;
		this.books = books;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the books
	 */
	public Books getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(Books books) {
		this.books = books;
	}
	
	/**
	 * Method get title of book
	 * @return
	 */
	public String getTitle() {
		return books.getTitle();
	}
	
	@Override
	public String toString() {
		return name + " " + books;
	}
	
	
}
