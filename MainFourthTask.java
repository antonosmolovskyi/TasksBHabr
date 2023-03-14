package firstTasksB;

import java.util.Scanner;

public class MainFourthTask {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter amount of numbers");
		int temp = number.nextInt();
		int[] numbers = new int[temp];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = number.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			if((numbers[i] % 5 == 0) && (numbers[i] % 7 == 0)) {
				System.out.println(numbers[i] + " ");
			}
		}
		number.close();

	}

}
