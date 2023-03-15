package com.tasks.homework11;

/**
 * 
 * @author Tigran
 *
 */
public class Address {
	private String City;
	private String Street;
	private int houseNumber;
	
	/**
	 * @param city
	 * @param street
	 * @param houseNumber
	 */
	public Address(String city, String street, int houseNumber) {
		
		City = city;
		Street = street;
		this.houseNumber = houseNumber;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}
	/**
	 * @return the houseNumber
	 */
	public int getHouseNumber() {
		return houseNumber;
	}
	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
}
