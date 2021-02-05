package com.xworkz.springassignment;

public class Projector {
	private int life;
	private boolean hd;
	private double maxDistance;
	private double cost;
	
	public Projector(int life,boolean hd,double maxDistance){
		System.out.println("projector bean created");
		this.life=life;
		this.hd=hd;
		this.maxDistance=maxDistance;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void displayProjector() {
		System.out.println("the projector info is provided");
	}

	@Override
	public String toString() {
		return "Projector [life=" + life + ", hd=" + hd + ", maxDistance=" + maxDistance + ", cost=" + cost + "]";
	}
	

}
