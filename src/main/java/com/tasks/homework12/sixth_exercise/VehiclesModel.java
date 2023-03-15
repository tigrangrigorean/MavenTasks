package com.tasks.homework12.sixth_exercise;

public class VehiclesModel {
	
	private int id;
	private VehiclesTypes vehiclesType;
	private Kinds kind;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the kind
	 */
	public Kinds getKind() {
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(Kinds kind) {
		this.kind = kind;
	}
	/**
	 * @return the vehiclesType
	 */
	public VehiclesTypes getVehiclesType() {
		return vehiclesType;
	}
	/**
	 * @param vehiclesType the vehiclesType to set
	 */
	public void setVehiclesType(VehiclesTypes vehiclesType) {
		this.vehiclesType = vehiclesType;
	}

}
