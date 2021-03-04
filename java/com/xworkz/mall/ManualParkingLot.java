package com.xworkz.mall;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
@Qualifier("manualparkinglot")
public class ManualParkingLot implements ParkingLot {
	
	@Value("true")
	private boolean isAvailable;
//	public ManualParkingLot() {
//		System.out.println("manual parking with default constructor");
//	}

	@Override
	public boolean isAvail() {
	if(isAvailable==true){
		System.out.println("can  manually park");
	}
	else{
		System.out.println("cannot park");
	}
		return true;
	}

}
