package jbk1;

public class Maruti800 extends Maruti {
	public Maruti800() {
	System.out.println("Constructor of class Maruti800");
	}
	
	public void speed() {
		System.out.println("Max speed: 80Kmph");
	}
	

	public static void main(String[] args) {
       Maruti800 obj = new Maruti800();
       obj.vehicleType();
       obj.brand();
       obj.speed();

	}

}
