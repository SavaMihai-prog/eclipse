package application;

public class Appset {
	public static void main(String[] args) {
		
		//add myAuto1 as object
		Carset myAuto1 = new Carset();
		//adding variables to myAuto1
		myAuto1.vehicleManufacture = "Bmw";
		myAuto1.color = "Purple";
		myAuto1.fuelLevel = 20;
		myAuto1.actualKm = 0;
		myAuto1.maxMileage = 30;
		myAuto1.totalTraveledDistance = 300;
		myAuto1.maxSpeed = 189.00;
		myAuto1.doorsNo = 5;
		
		myAuto1.coupe = false;
		
		
		
		//added values to be shown
		System.out.println("Car manufacture is :" + myAuto1.vehicleManufacture);
		System.out.println("Vehicle actual color is: " + myAuto1.color);
		System.out.println("Starting fuel level: " + myAuto1.fuelLevel + " " + "liters");
		System.out.println("Maximum speed of travel: " + myAuto1.maxSpeed + " " + "km/h");
		System.out.println("Does the car have 4 doors: " + myAuto1.coupe);
		System.out.println("Remember: If the car has 4 doors is slightly heavier and worse max mileage");
	}

}
