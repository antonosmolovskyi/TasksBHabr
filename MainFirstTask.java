package firstTasksB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFirstTask {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter amount of numbers");
		int temp = number.nextInt();
		List<Integer> oddNumbers = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		for (int i = 0; i < temp; i++) {
			int enteredNumber = number.nextInt();
			if( enteredNumber % 2 == 0) {
				evenNumbers.add(enteredNumber);
			} else oddNumbers.add(enteredNumber);
		}
		System.out.print("Odd numbers : " + oddNumbers + " ");
		System.out.print("Even numbers : " + evenNumbers + " ");
		
		number.close();
	}

}
