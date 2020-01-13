package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main_vehicles_fase3_DEFINITIVA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean wrongVehicle = true;
		boolean wrongPlate = true;
		boolean wrongDiam = true;
		boolean info = true;
		String inputPlate, brand, color, bwBrand, fwBrand, typeVehicle;
		Double bwDiam, fwDiam;
		Vehicle userVehicle = null;
		Car userCar;
		Bike userBike;

//CAR OR BIKE?
		do {
			System.out.println("What do you prefer, a car or a bike?");
			
			typeVehicle = sc.nextLine();
			
			if(typeVehicle.equalsIgnoreCase("car")) {
				
				wrongVehicle = false;
				
			} else if (typeVehicle.equalsIgnoreCase("bike")) {
				
				wrongVehicle = false;
				
			} else {
				
				System.out.println("Not a valid type of vehicle!");
				
			}
			
		} while(wrongVehicle);

		
//INPUT OF THE PLATE
		do {
			System.out.println("Please enter your plate, it should have 4 numbers and two or three characters");

			inputPlate = sc.nextLine();

			char[] plateCode = inputPlate.toCharArray();

			int countNum = 0;
			int countChar = 0;

			for (int i = 0; i < plateCode.length; i++) {

				if (Character.isDigit(plateCode[i])) {

					countNum++;

				} else {

					Character.isLetter(plateCode[i]);
					countChar++;

				}

			}
			
			if (countNum != 4 || countChar > 3 || countChar < 2){
								
				System.out.println("This plate format is not correct! Try again please...");
				
			} else {
				
				System.out.println("Your plate is: ");
				System.out.println(inputPlate);
				
				wrongPlate = false;
				
			}
		
		} while (wrongPlate);

		
//INPUT BRAND AND COLOR			  
		  System.out.println("Please enter your vehicle's brand: ");
		  
		  brand = sc.nextLine(); 
		  
		  System.out.println("Please enter your vehicle's color: ");

		  color = sc.nextLine(); 
	  
		  
//BACKWHEELS BRAND, DIAM 
		  System.out.println("Now you should enter your backwheels brand: "); 
		  
		  bwBrand = sc.nextLine();
		  		  
		  do {
			  System.out.println("Now we need the backwheels diameter, each one should have a diameter between 0,4 and 4");

			  bwDiam = Double.parseDouble(sc.nextLine()); 
			  
			  if (bwDiam < 0.4 || bwDiam > 4) {
				  
				  System.out.println("It can't has this diameter! Choose between 0,4 and 4. Please try again...");
			  
			  } else {
				
				  wrongDiam = false;
			  
			  }
		  			  
		  } while (wrongDiam);
		  
		  
//FRONTWHEELS BRAND, DIAM 
		  System.out.println("Now you should enter your frontwheels brand: "); 
		  
		  fwBrand = sc.nextLine();
		  		  
		  do {
			  System.out.println("Now we need the frontwheels diameter, each one should have a diameter between 0,4 and 4");

			  wrongDiam = true;
			  
			  fwDiam = Double.parseDouble(sc.nextLine()); 
			  
			  if (fwDiam < 0.4 || fwDiam > 4) {
				  
				  
				  System.out.println("It can't has this diameter! Choose between 0,4 and 4. Please try again...");
			  
			  } else {
				  
				  wrongDiam = false;
			  
			  }
		  			  
		  } while (wrongDiam);

		  
//CONSTRUCT THE WHOLE VEHICLE
		  if(typeVehicle.equalsIgnoreCase("car")) {
			  
			  	userCar = new Car(inputPlate, brand, color);
			  	
			  	userVehicle = userCar;
			  
		  } else if (typeVehicle.equalsIgnoreCase("bike")) {
		  			  
		  		userBike = new Bike(inputPlate, brand, color);
		  		
		  		userVehicle = userBike;
		  		
		  }

//CONSTRUCT WHEELS		  
		  Wheel backWheels = new Wheel(bwBrand, bwDiam);

		  Wheel frontWheels = new Wheel(fwBrand, fwDiam);
		  
		  
//ADD WHEELS TO LISTSWHEELS
		  List<Wheel> listBackWheels = new ArrayList<>();
		  
		  listBackWheels.add(backWheels); 
		  listBackWheels.add(backWheels);
		  		  
		  List<Wheel> listFrontWheels = new ArrayList<Wheel>();
		  
		  listFrontWheels.add(frontWheels); 
		  listFrontWheels.add(frontWheels);
		  
		  userVehicle.addWheels(listFrontWheels, listBackWheels);
		  

//GET THE WHOLE INFO		  
		  System.out.println("Do you want to see your vehicle's info? Say 'yes or 'no'");
		  
		  do {
		  
			  String wantInfo = sc.nextLine().toLowerCase();
			  
			  if(wantInfo.equalsIgnoreCase("yes")) {
				  				  
				  System.out.println("Your plate is: " + userVehicle.plate +
				  ", your brand is: " + userVehicle.brand + " and your color is: " +
				  userVehicle.color);
				  
				  System.out.println("backWheels brand: " + backWheels.getBrand() +
				  " and diameter: " + backWheels.getDiameter());

				  System.out.println("frontWheels brand: " + frontWheels.getBrand() +
				  " and diameter: " + frontWheels.getDiameter());
				  
				  info = false;
				  
			  } else if ( wantInfo.equalsIgnoreCase("no")){
				  
				  System.out.println("We are ready!");
				  
				  info = false;
				  				  
			  } else {
				  
				  System.out.println("I don't understand you, please write YES or NO");
				  
			  }
			  
		  } while (info);	
		  
		  sc.close();

	}

}







/*----------------------------------------------------------FAILS---------------------------------------------------------
  
 
 		 /*
		  Wheel backLeftWheel = new Wheel(bwBrand, bwDiam);

		  Wheel backRightWheel = new Wheel(bwBrand, bwDiam);

		  Wheel frontLeftWheel = new Wheel(fwBrand, fwDiam);

		  Wheel frontRightWheel = new Wheel(fwBrand, fwDiam);
		  */
 
 
 
 
 		  /*
		  List<Wheel> backWheels = new ArrayList<>();
		  
		  backWheels.add(backRightWheel); backWheels.add(backLeftWheel);
		  		  
		  List<Wheel> frontWheels = new ArrayList<Wheel>();
		  
		  frontWheels.add(frontRightWheel); frontWheels.add(frontLeftWheel);
		  
		  userVehicle.addWheels(frontWheels, backWheels);
		  */


		  /*
		  if(typeVehicle.equalsIgnoreCase("car")) {
			  
			  userCar.addWheels(frontWheels, backWheels);
			  
			  //userCar.addTwoWheels(frontWheels);
			  
			  //userCar.addTwoWheels(backWheels);
			  			  
			  //userCar.addWheels(listFrontWheels, listBackWheels);
			  
			  			  
		  } else if (typeVehicle.equalsIgnoreCase("bike")) {
			  
			  //userBike.addTwoWheels(listFrontWheels);
			  
			  //userBike.addTwoWheels(listBackWheels);
			  
			  //userBike.addWheels(frontWheels, backWheels);
			  
			  userBike.addWheels(frontWheels, backWheels);

		  }		 			  
		  
 */

