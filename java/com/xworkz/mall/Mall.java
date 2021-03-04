package com.xworkz.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
@Primary
public class Mall {
	
	@Value("hipercity")
	private String name;
	
	@Value("Bangalore")
	private String city;
	
	@Qualifier("autoparkinglot")
	@Autowired
	private ParkingLot parkingLot;
//	@Autowired 
	
	public Mall(ParkingLot parkingLot)
	{
		this.parkingLot=parkingLot;
	}
	
	public void parking(){
		if(this.parkingLot.isAvail()){
			System.out.println("can park");
		}
		else{
			System.out.println("cannot park");
		}
		
		
	}

}
