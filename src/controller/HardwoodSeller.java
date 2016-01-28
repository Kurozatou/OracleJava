/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Esteban
 *
 */
public class HardwoodSeller {

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
		
	}
	
	public Double deliveryTime(){
		Double deliveryETA = 0.0;
		return deliveryETA;
	}
	
}
