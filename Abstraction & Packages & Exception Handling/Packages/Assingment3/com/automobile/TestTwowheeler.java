package com.automobile;
import com.automobile.twowheeler.*;

public class TestTwowheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Hero Splendor", "MP65MD5563", "Arish Ahmad", 90);
		System.out.println("Model name : "+hero.getModelname());
		System.out.println("Owner name : "+hero.getOwnerName());
		System.out.println("Registration Number : "+hero.getRegistrationNumber());
		System.out.println("Speed : "+hero.getSpeed()+" kmph");
		hero.radio();
		
		System.out.println("-----------------------------------------");
		
		Honda honda = new Honda("Honda Shine", "M15F345101", "Mohd Amir", 70);
		System.out.println("Model name : "+honda.getModelname());
		System.out.println("Owner name : "+honda.getOwnerName());
		System.out.println("Registration number : "+honda.getRegistrationNumber());
		System.out.println("Speed : "+honda.getSpeed()+" kmph");
		honda.cdplayer();	
	}
	

}
