package firstTasksB;

import java.util.Scanner;

public class MainSecondTask {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter amount of numbers");
		int temp = number.nextInt();
		int[] numbers = new int[temp];
		for (int i = 0; i < temp; i++) {
			numbers[i] = number.nextInt();
		}
		int min = numbers[0];
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			} 
			if(numbers[i] < min) {
				min = numbers[i];
			} 
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		number.close();

	}

}
