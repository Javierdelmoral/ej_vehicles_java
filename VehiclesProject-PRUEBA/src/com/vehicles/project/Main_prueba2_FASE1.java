package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main_prueba2_FASE1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//COCHE
		System.out.println("Please enter your plate, car brand and color");

		String plate = sc.nextLine();
		String brand = sc.nextLine();
		String color = sc.nextLine();

		Car userCar = new Car(plate, brand, color);

		System.out.println("Your plate is: " + userCar.plate + ", your brand is: " + userCar.brand
				+ " and your color is: " + userCar.color);

//RUEDAS
		System.out.println("Now we need the brand and diameter of the backwheels, both should have the same diameter!");

		System.out.println("Enter back leftwheel brand and diameter");

		String blwBrand = sc.nextLine();
		Double blwDiameter = new Double(sc.nextLine());

		Wheel backLeftWheel = new Wheel(blwBrand, blwDiameter);

		System.out.println(
				"backLeftWheel brand: " + backLeftWheel.getBrand() + " and diameter: " + backLeftWheel.getDiameter());

		System.out.println("Enter back rightwheel brand and diameter");

		String brwBrand = sc.nextLine();
		Double brwDiameter = new Double(sc.nextLine());

		Wheel backRightWheel = new Wheel(brwBrand, brwDiameter);

		System.out.println("backRightWheel brand: " + backRightWheel.getBrand() + " and diameter: "
				+ backRightWheel.getDiameter());

		
		System.out.println("Now we need the brand and diameter of the wheels, both should have the same diameter!");
		
		System.out.println("Enter front leftwheel brand and diameter");

		String flwBrand = sc.nextLine();
		Double flwDiameter = new Double(sc.nextLine());

		Wheel frontLeftWheel = new Wheel(flwBrand, flwDiameter);

		System.out.println("frontLeftWheel brand: " + frontLeftWheel.getBrand() + " and diameter: "
				+ frontLeftWheel.getDiameter());

		System.out.println("Enter front rightwheel brand and diameter");

		String frwBrand = sc.nextLine();
		Double frwDiameter = new Double(sc.nextLine());

		Wheel frontRightWheel = new Wheel(frwBrand, frwDiameter);

		System.out.println("frontRightWheel brand: " + frontRightWheel.getBrand() + " and diameter: "
				+ frontRightWheel.getDiameter());

		sc.close();

		
//ADD RUEDAS A LISTAS
				
		List<Wheel> backWheels = new ArrayList<>();

		backWheels.add(backRightWheel);
		backWheels.add(backLeftWheel);

		userCar.addTwoWheels(backWheels);

		List<Wheel> frontWheels = new ArrayList<Wheel>();

		frontWheels.add(frontRightWheel);
		frontWheels.add(frontLeftWheel);

		userCar.addTwoWheels(frontWheels);

		userCar.addWheels(frontWheels, backWheels);

	}

}


