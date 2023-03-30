package com.tasks.bookslib;

public class Books {
	
	
	private String title;
	private String author;
	private int year;
	
	/**
	 * @param title
	 * @param author
	 * @param year
	 */
	public Books(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Books [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	
	
}
