package com.nt.fmp;

public class BajajChennaiFactory extends BajajFactory{
	public  void assemble(){
		System.out.println("Bike assembling");
	}
	public  void paint(){
		System.out.println("Bike Painting");
	}
	public  void oiling(){
		System.out.println("Bike oiling");
	}
	public  void roadTest(){
		System.out.println("road Testing ");
	}
	public  void deliver(){
		System.out.println("delivering ");
	}
	public void machineTest() {
		System.out.println("machineTest ");
	}
	
	public Bike createBike(String type){
		 Bike bike=null;
		if(type.equals("pulsor")){
			bike=new PulsorBike();
		}
		else if(type.equals("discover")){
			bike=new DiscoverBike();
		}
	   return bike;
	}//method


}//class
