/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Vehicle file for vehicle program (holds all variables, etc. to make 
 * 		program work)
 *
 ****************************************************************************/

public class Vehicle {

	private String _license;
	private String _colour;
	private int _numDoors;
	private int _speed = 0;
	private int _maxSpeed = 160;
	
	//constructor
	public Vehicle (String license,
					String colour,
					int numDoors) {
		
		this._license = license;
		this._colour = colour;
		this._numDoors = numDoors;
	}
	
	// getters and setters
	public String getLicense() {
		return _license;
	}
	public void setLicense(String input) {
		this._license = input;
	}
	
	public String getColour() {
		return _colour;
	}
	
	public int getDoors() {
		return _numDoors;
	}
	
	public int getSpeed() {
		return _speed;
	}
	
	public int getMax() {
		return _maxSpeed;
	}
	
	// methods
	protected void accelerate(int increment) {
		// increases speed
		
		if(increment <= _maxSpeed) {
			_speed += increment;
		}
		else {
			_speed = _maxSpeed;
		}
	}
	
	protected void brake(int decrement) {
		// apply brakes
		if(decrement <= _speed) {
			_speed -= decrement;
		}
		else {
			_speed = 0;
		}
	}
}