package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Object system;
		/*
		 * num = 0;
		 * 
		 * 반복 횟수를 입력하세요 : 5
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("반복 횟수를 입력하세요: ");
		num = scanner.nextInt();
		
		int i = 0;
		
		while (i < num) {
			System.out.println((i + 1));
			i++;
		}
		
		i = 0;
		//반대로 할 때는 ?? 
		while(i < num) {
			System.out.println(num-i);
			i++;
		}
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		i = 0;
		
		while(i < numbers.length) {
			System.out.println(numbers[i]);
			i++;
		}
	}

}
