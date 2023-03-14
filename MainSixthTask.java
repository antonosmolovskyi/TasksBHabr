package firstTasksB;

import java.util.Scanner;

public class MainSixthTask {

	public static void main(String[] args) { // 5
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter amount of numbers");
		int amount = number.nextInt();
		int[] numbers = new int[amount];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = number.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			boolean flag = true;
			int[] tempNumbers = new int[3];
			int temp = numbers[i];
			for (int k = 0; k < 3; k++) {
				tempNumbers[k] = temp % 10;
				temp /= 10;
			}
			for (int k = 0; k < 3; k++) {
				for (int j = 0; j < 3; j++) {
					if(k != j && tempNumbers[k] == tempNumbers[j]) {
						flag = false;
						break;
					}
				}
				
			}
			//System.out.println(flag);
			if(flag == true) {
				System.out.println(numbers[i]);
			}
		}
		
		number.close();

	}

}
