package com.tasks.map_set;

public class Car implements Comparable{
	
	private String carsName;
	private int year;
	
	/**
	 * @param carsName
	 * @param year
	 */
	public Car(String carsName, int year) {
		super();
		this.carsName = carsName;
		this.year = year;
	}
	/**
	 * @return the carsName
	 */
	public String getCarsName() {
		return carsName;
	}
	/**
	 * @param carsName the carsName to set
	 */
	public void setCarsName(String carsName) {
		this.carsName = carsName;
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
		return "Car [carsName=" + carsName + ", year=" + year + "]";
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		
		Car car = (Car) o;
		
		 if (this.year > car.year) {
	            return 1;
	        }
	        if (this.year < car.year) {
	            return -1;
	        }
	        return 0;
	}
	
}
