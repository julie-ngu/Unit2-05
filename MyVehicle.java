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
							Vehicle myVehicle = new Vehicle(userPlate, userColour, userDoors);
							
							System.out.print("How much would you like to accelerate for vehicle " + counter + "? ");
								if(userInput.hasNextInt()) {
									int increase = userInput.nextInt();
									myVehicle.accelerate(increase);
									
									System.out.print("How much would you like to decelerate for vehicle " + counter + "? ");
									if(userInput.hasNextInt()) {
										int decrease = userInput.nextInt();
										myVehicle.brake(decrease);
										
										System.out.print("\nVehicle " + counter + " Info");
										myVehicle.print();
										System.out.println();
										userInput.nextLine();
									}
									else {
										System.out.print("\nError: Illegal Input");
									}
								}
								else {
									System.out.print("\nError: Illegal Input");
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
