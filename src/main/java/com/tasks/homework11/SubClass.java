package com.tasks.homework11;

public class SubClass extends SuperClass{
	
	private String message = "Hello Sub Class";
	
	/**
	 * @print messages
	 */
	public SubClass() {
		System.out.println(super.getMessage());
		System.out.println(this.getMessage());
	}
	
	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message
	 * 
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
