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
	private static int _MAXSPEED = 160;
	
	//constructor
	
	public Vehicle (String license,
					String colour,
					int numDoors) {
		
		this._license = license;
		this._colour = colour;
		this._numDoors = numDoors;
	}
	
	protected void accelerate(int increment) {
		if(increment <= _MAXSPEED) {
			_speed += increment;
		}
		else {
			_speed = _MAXSPEED;
		}
	}
	
	protected void brake(int decrement) {
		if(_speed > 0) {
			if(decrement <= _speed) {
				_speed -= decrement;
			}
			else {
				_speed = 0;
			}
		}
		else {
			_speed = 0;
		}
	}
	
	public void print() {
		System.out.print("\n" + "License Plate: " + _license + "\nColour: " + _colour + "\nNumber of Doors: " + _numDoors + "\nSpeed: " + _speed);
	}
}
