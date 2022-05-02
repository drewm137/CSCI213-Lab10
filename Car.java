/**
* This is the Car class, it extends Vehicle
*
* @author Drew Millner
* Date: 5/2/22
*
*/

public class Car extends Vehicle{
	// New IVs
	private int numDoors;
	private int numPassengers;
	
	
	/**
	* This is a parameterized constructor for Car
	* @param aMake the given make of the car as string
	* @param aModel the given model of the car as string
	* @param aPlate the given license plate of the car as string
	* @param doors the given number of doors as int
	* @param passengers the given number of passengers as int
	*/
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
		super(aMake, aModel, aPlate);
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	
	/**
	* This is the doors getter
	* @return the number of doors as an int
	*/
	public int getDoors(){
		return this.numDoors;
	}
	
	
	/**
	* This is the passengers getter
	* @return the number of passengers as an int
	*/
	public int getPassengers(){
		return this.numPassengers;
	}
	
	
	/**
	 * This is the toString method.
	 * @return the Car information as a string
	 */
	@Override
	public String toString(){
		int doors = this.numDoors;
		String vehicle = super.toString();
		String result = String.format("%d-door %s", doors, vehicle);
		
		return result;
	}
	
	
	/**
	 * This is the equals method.
	 * @return true if equal, false if not equal or not same object type.
	 */
	@Override
	public boolean equals(Object other) {
		// Assure same type
		if(!(other instanceof Car)) {
			return false;
		}
		
		// Cast
		Car otherCar = (Car) other;
		
		// Test Equality
		int doors1 = this.numDoors;
		int doors2 = otherCar.getDoors();
		int pass1 = this.numPassengers;
		int pass2 = otherCar.getPassengers();
		
		if(doors1 == doors2 && pass1 == pass2){
			return super.equals(otherCar);
		}
		
		return false;
	}
	
	
	/**
	 * This is the copy method.
	 * @return a copy of the car as a new car
	 */
	public Car copy() {
		int doors = this.getDoors();
		int pass = this.getPassengers();
		String make = this.getMake();
		String model = this.getModel();
		String plate = this.getPlate();
		
		Car theCopy = new Car(make, model, plate, doors, pass);
		
		return theCopy;
	}
}