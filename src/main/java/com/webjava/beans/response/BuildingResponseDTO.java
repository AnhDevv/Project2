package com.webjava.beans.response;

public class BuildingResponseDTO {
	private Long id;
	private String name;
	private String address;
	private Long numberOfBasement;
	private String managerName;
	private Long managerPhoneNumber;
	private Long floorArea;
	private Long vacantArea;
	private Long brokerageFees;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(Long numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Long getManagerPhoneNumber() {
		return managerPhoneNumber;
	}
	public void setManagerPhoneNumber(Long managerPhoneNumber) {
		this.managerPhoneNumber = managerPhoneNumber;
	}
	public Long getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(Long floorArea) {
		this.floorArea = floorArea;
	}
	public Long getVacantArea() {
		return vacantArea;
	}
	public void setVacantArea(Long vacantArea) {
		this.vacantArea = vacantArea;
	}
	public Long getBrokerageFees() {
		return brokerageFees;
	}
	public void setBrokerageFees(Long brokerageFees) {
		this.brokerageFees = brokerageFees;
	}

	

}
