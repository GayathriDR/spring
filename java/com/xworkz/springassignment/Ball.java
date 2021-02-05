package com.xworkz.springassignment;

public class Ball {
	private String type;
	private double weight;
	private String usedFor;

	public Ball(String type,String usedFor){
		System.out.println("string type and string usedfor");

		this.type=type;
		this.usedFor=usedFor;

	}
	public Ball(String type,double weight){
		System.out.println("string type and double weight");
		this.type=type;
		this.weight=weight;
	}
	public Ball(double weight, String type){
		System.out.println("double weight and string type");
		this.weight=weight;
		this.type=type; 
	}


//	public void setType(String type) {
//		this.type = type;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	public void setUsedFor(String usedFor) {
//		this.usedFor = usedFor;
//	}
	public void display(){
		System.out.println("this ball is used for"+this.usedFor);
	}

	@Override
	public String toString() {
		return "Ball [type=" + type + ", weight=" + weight + ", usedFor=" + usedFor + "]";
	}

}
