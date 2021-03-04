package com.xworkz.mall;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
//@Service("autoparking")
@Qualifier("autoparkinglot")
public class AutoParkingLot implements ParkingLot {
	
	@Value("true")
	private boolean isAvailable;

	public boolean isAvail() {
		if(isAvailable==true){
			System.out.println("can park automatically");
		}
		else{
			System.out.println("cannot park");
		}
		return true;
	}

}
