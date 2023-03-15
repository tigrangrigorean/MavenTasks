package com.tasks.homework11;

public class Car {
	
	private int passangerCount;
	private String engineType;
	
	/**
	 * 
	 * @return passangerCount
	 */
	public int getPassangerCount() {
		return passangerCount;
	}
	/**
	 * 
	 * @param passangerCount
	 */
	public void setPassangerCount(int passangerCount) {
		if(passangerCount >= 2) {
		this.passangerCount = passangerCount;
		}
	}
	/**
	 * 
	 * @return engineType
	 */
	public String getEngineType() {
		return engineType;
	}
	/**
	 * 
	 * @param engineType
	 */
	public void setEngineType(String engineType) {
		if(engineType.matches("^[a-zA-Z]*$")) {
		this.engineType = engineType;
		
		}
	
	}
}
