package com.xworkz.mall;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class MallInjection {
	@Value("hipercity")
	private String name;
	@Value("Bangalore")
	private String city;

}
