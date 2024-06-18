package com.webjava.repository.entity;


//Hứng dữ liệu từ DB
public class BuildingEntity {
	private Long id;
	private String name;
	private String ward;
	private String street;
	private Long districtId;
	private Long numberOfBasement;
	private String managerName;
	private Long managerPhoneNumber;
	private Long floorArea;
	private Long vacantArea;
	private Long brokerageFees;
	private String type;
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
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Long getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
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
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
