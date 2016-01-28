/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

/**
 * @author Esteban & Elliot Rauchwerger
 *
 */
public class HardwoodSeller {

	private static String fullName;  	// the full name of the client
	private static String address;		// the address of the client
	private static String orderDate;	// the date the client ordered
	
	// an array of all the different types of wood sold
	private static WoodItem[] woodList = {new WoodItem("Cherry", 2.5, 5.95),
			new WoodItem("Curly Maple", 1.5, 6.00),
			new WoodItem("Genuine Mahogany", 3.0, 9.60),
			new WoodItem("Wenge", 5.0, 22.35),
			new WoodItem("White Oak", 2.3, 6.70),
			new WoodItem("Sawdust", 1.0, 1.5)};
	
	// a list of all the wood ordered
	private static List<WoodOrder> orderList = new ArrayList<WoodOrder>();
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Create a new scanner object
		Scanner s = new Scanner(System.in);
		// display prompt
		System.out.printf("Enter the name of your input file: ");
		// read in file name
		String filePath = s.next();
		// read input using file path
		readInputFile(filePath);
		s.close();
		// output results
		outputResults();
	}
	
	/**
	 * reads in the input file and parses it
	 * 
	 * @param inputFilePath
	 * @throws FileNotFoundException 
	 */
	public static void readInputFile(String inputFilePath) throws FileNotFoundException{
		// open the file
		File file = new File(inputFilePath);
		// scan through it
		Scanner in = new Scanner(file);
		// get first line of info
		in.useDelimiter("(\\n)|;");
		fullName = in.next();
		address = in.next();
		orderDate = in.next();
		
		// scan in wood
		while(in.hasNext()){
			String orderLine = in.next();
			int colon = orderLine.indexOf(":");
			// get name
			String name = orderLine.substring(0, colon);
			// get type based on name
			WoodItem type = null;
			for (WoodItem item : woodList) {
				if (name.equals(item.getType())) {
					type = item;
					break;
				}
			}
			// get quantity
			int quantity = Integer.parseInt((orderLine.substring(colon+1, orderLine.length())));
			// calculate price
			double price = quantity * type.getPrice();
			// calculate delivery time
			double delivery = type.getBaseDeliveryTime() * deliveryMultiplier(quantity);
			// create new order item
			orderList.add(new WoodOrder(type, quantity, price, delivery));
		}
		
		in.close();
	}
	
	/**
	 * outputs the results of the calculator
	 */
	public static void outputResults(){
		// output results
		double totalPrice = 0.0;
		double maxDeliveryTime = orderList.get(0).getDeliveryTime();
		System.out.printf("Name of buyer: %s\n", fullName);
		System.out.printf("Address of delivery: %s\n", address);
		System.out.println("WOOD ORDERED:");
		System.out.println("-------------");
		for (WoodOrder order : orderList){
			// update total price
			totalPrice += order.getPrice();
			// check for max delivery time
			if (order.getDeliveryTime() > maxDeliveryTime) 
				maxDeliveryTime = order.getDeliveryTime();
			// display each item on list
			System.out.printf("* %s\n", order);
		}
		System.out.printf("Total price of purchase: $%.2f\n", totalPrice);
		System.out.printf("Estimated delivery time: %.2f hours\n", maxDeliveryTime);
	}
	
	/**
	 * calculates a multiplier used for calculating estimated delivery time
	 * 
	 * @param quantity
	 * @return multiplier
	 */
	public static double deliveryMultiplier(int quantity){
		double multiplier = 0.0;
		
		if (quantity <= 500){
			multiplier = Math.ceil(quantity/100.0);
		} else {
			multiplier = 5.5;
		}
		
		return multiplier;
	}
	
}
