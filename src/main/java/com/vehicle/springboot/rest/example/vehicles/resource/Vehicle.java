package com.vehicle.springboot.rest.example.vehicles.resource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "All details about the Vehicles. ")
public class Vehicle {
	
	@Id
	private Long id;

	@ApiModelProperty(notes = "Name should have atleast 4 characters")
	@Size(min = 4, message = "Name should have atleast 4 characters")
	private String name;

	private String vehicleType;

	private String numberofSeats;

	private String color;

	private String vehicleyear;

	private String engineType;

	private String registrationIndicator;

	private String engineNumber;

	private String bodyType;

	public Vehicle() {
		super();
	}

	public Vehicle(Long id, String name, String vehicleType, String numberofSeats, String color, String vehicleyear,
			String engineType, String registrationIndicator, String engineNumber, String bodyType) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleType = vehicleType;
		this.numberofSeats = numberofSeats;
		this.color = color;
		this.vehicleyear = vehicleyear;
		this.engineType = engineType;
		this.registrationIndicator = registrationIndicator;
		this.engineNumber = engineNumber;
		this.bodyType = bodyType;
	}

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

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(String numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVehicleyear() {
		return vehicleyear;
	}

	public void setVehicleyear(String vehicleyear) {
		this.vehicleyear = vehicleyear;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getRegistrationIndicator() {
		return registrationIndicator;
	}

	public void setRegistrationIndicator(String registrationIndicator) {
		this.registrationIndicator = registrationIndicator;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

}
