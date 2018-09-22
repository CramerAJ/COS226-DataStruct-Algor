package Goofingaround;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumbersUIMO {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance of each poles can travel (ex: 3 5 1 10 2):");

		String user_input = input.nextLine(); 						// picks up the user input as string

		long startTime = System.nanoTime(); 						// used to find the running time
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();			// array list containing the users given integers		
		Scanner array_add_ints = new Scanner(user_input);

		while (array_add_ints.hasNext()) { 							// scans the user input into the array list

			String distances = array_add_ints.next();
			int integers = Integer.parseInt(distances);
			input.add(integers);

		}
		input.close(); 			// close scanners
		array_add_ints.close(); //close scanners
		multiply(input); 		// output statement
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns"); // finds running time in nano seconds
	}

	public static void multiply(ArrayList<Integer> numbers){
		
		Collections.sort(numbers);
		
		for (int i = 0; i < numbers.size(); i++){
			int first = numbers.get(i);
			
		}
		
	}
}
