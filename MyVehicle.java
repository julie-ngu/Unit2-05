/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Main file for Vehicle program (calls variables, etc. from Vehicle file and
 * 		gets input from user)
 *
 ****************************************************************************/

import java.util.Scanner;

public class MyVehicle {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int maxVehicles = 2;
		int counter = 0;
		
		do {
			counter ++;
			
			if(counter > maxVehicles) {
				break;
			}
			else {
				System.out.print("Enter the license plate number of vehicle " + counter + ": ");
				if(userInput.hasNextLine()) {
					String userPlate = userInput.nextLine();
					
					System.out.print("Enter the colour of vehicle " + counter + ": ");
					if(userInput.hasNextLine()) {
						String userColour = userInput.nextLine();
						
						System.out.print("Enter the number of doors of vehicle " + counter + ": ");
						if(userInput.hasNextInt()) {
							int userDoors = userInput.nextInt();
							if(userDoors > 0) {
								Vehicle myVehicle = new Vehicle(userPlate, userColour, userDoors);
								
								System.out.print("Enter speed increment of vehicle " + counter + " (accelerate): ");
								if(userInput.hasNextInt()) {
									int increase = userInput.nextInt();
									if(increase >= 0) {
										myVehicle.accelerate(increase);
										
										System.out.print("Enter speed decrement of vehicle " + counter + " (brake): ");
										if(userInput.hasNextInt()) {
											int decrease = userInput.nextInt();
											if(decrease >= 0) {
												myVehicle.brake(decrease);
												
												System.out.print("\n\nVehicle " + counter + "\nLicense Plate: " + myVehicle.getLicense() + "\nColour: " + myVehicle.getColour() + "\nNumber of Doors: " + myVehicle.getDoors() + "\nMax Speed: " + myVehicle.getMax() + "\nSpeed: " + myVehicle.getSpeed() + "\n\n");
												userInput.nextLine();
											}
											else {
												System.out.print("\nError: Illegal Input");
												break;
											}
										}
										else {
											System.out.print("\nError: Illegal Input");
											break;
										}
									}
									else {
										System.out.print("\nError: Illegal Input");
										break;
									}
								}
								else {
									System.out.print("\nError: Illegal Input");
									break;
								}
							}
							else {
								System.out.print("\nError: Illegal Input");
								break;
							}
						}
						else {
							System.out.print("\nError: Illegal Input");
							break;
						}
					}
					else {
						System.out.print("\nError: Illegal Input");
						break;
					}
				}
				else {
					System.out.print("\nError: Illegal Input");
					break;
				}
			}
		} while(true);
	}
}