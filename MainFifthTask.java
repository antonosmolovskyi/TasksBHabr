package firstTasksB;

import java.util.Scanner;

public class MainFifthTask { // 6

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter amount of numbers");
		int temp = number.nextInt();
		int[] numbers = new int[temp];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = number.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 2 || numbers[i] == 3 || numbers[i] == 5 ) {
				System.out.print(numbers[i] + " ");
			}
			if(!(numbers[i]% 2 == 0 || numbers[i]% 3 == 0 || numbers[i]% 5 == 0)) {
				System.out.print(numbers[i] + " ");
			}
		}
		number.close();
	}

}
