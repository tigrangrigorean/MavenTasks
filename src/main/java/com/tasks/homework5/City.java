package com.tasks.homework5;

public class City {
	
	String name;
	int population;



	/**
	 * @param name
	 * @param population
	 */
	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
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
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}



	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}



	public static void main(String[] args) {
		
		City Yerevan = new City("Yerevan", 700000);
		City Moscow = new City("Moscow", 120000);
		City NewYork = new City("New York", 100000);
		City Paris = new City("Paris", 1700000);

	}

}
