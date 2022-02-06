package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle{

String ModelName,RegistrationNumber,OwnerName;
int speed;
	
	public Honda(String Model_name,String Registration_number,String Owner_name,int speed){
		this.ModelName =  Model_name;
		this.RegistrationNumber = Registration_number;
		this.OwnerName = Owner_name;
		this.speed= speed;
	}
	@Override
	public String getModelname() {
		// TODO Auto-generated method stub
		return ModelName;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return RegistrationNumber;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return OwnerName;
	}
	public int getSpeed() {
		return speed;
	}
	public String cdplayer() {
		return "This vehicle provide cd player facility";
	}
}
