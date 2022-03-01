package project2;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * 
 * Helper Class for Driver
 * @author nisanth
 * @version 1.0
 * 
 */

public class Helper {
	
	// Test reference based linked list.
	
	private final static String dataList = "data.txt";
	public static void start() {
		
		ArrayList<LinkedString> strings = new ArrayList<>();
		
		//Create and display list.
		
		create(strings);
		displayMore((strings));
		
		
	}
	
	/**
	 * Create list of names and reference data.
	 * @param list reference to data.
	 */
	
	public static void create(ArrayList<LinkedString> strings) {
		
		try {
			
			Scanner input = new Scanner(new File(dataList));
			int turn = 0;
			while(input.hasNext()) {
				
				if (turn == 0)
					strings.add(new LinkedString(input.next()));
				else
					strings.add(new LinkedString(input.next().toCharArray()));
				turn = (turn+1)%2;
				
				}
				
			} catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		
	}
		
	
	/*
	 * Display the data in order.
	 * @param list a reference to the list of data given.
	 */
	
	public static void displayMore(ArrayList<LinkedString> strings) {
		
		for (int i = 1; i < strings.size(); i++) {
			if(!strings.get(i-1).isEmpty() && !strings.get(i).isEmpty()) {
				System.out.println("String 1: " + strings.get(i-1));
                System.out.println("\tSize: " + strings.get(i-1).length());
                System.out.println("\tCharacter at 0: " + strings.get(i-1).charAt(0));
                System.out.println("\tSubstring(0,1): " + strings.get(i-1).substring(0,1));           
                System.out.println("String 2: " + strings.get(i));
                System.out.println("\tSize: " + strings.get(i).length());
                System.out.println("\tCharacter at 0: " + strings.get(i).charAt(0));
                System.out.println("\tSubstring(0,1): " + strings.get(i).substring(0,1));       
                System.out.println("String 1 + String 2: " + strings.get(i-1).concat(strings.get(i)));
                System.out.println("\n");

			}
		}
		
	}
	

}
