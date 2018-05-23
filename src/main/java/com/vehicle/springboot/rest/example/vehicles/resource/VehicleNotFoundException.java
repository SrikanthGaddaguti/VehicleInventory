package com.vehicle.springboot.rest.example.vehicles.resource;

public class VehicleNotFoundException extends RuntimeException {

	public VehicleNotFoundException(String exception) {
		super(exception);
	}

}
