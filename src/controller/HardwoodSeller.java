/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.WoodItem;

/**
 * @author Esteban
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
										  new WoodItem("Sawdust", 1.5, 1.00)};
	
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
	}
	
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
		System.out.print(address);
		
		// scan in wood
		while(in.hasNext()){
			
		}
	}
	
	public Double deliveryTime(){
		Double deliveryETA = 0.0;
		return deliveryETA;
	}
	
}
