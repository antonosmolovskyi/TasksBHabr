package firstTasksB;

import java.util.Scanner;

public class MainSeventhTask {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter amount of numbers");
		int amount = number.nextInt();
		int[] numbers = new int[amount];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = number.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		number.close();
	}
}
