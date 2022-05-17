package j04_입력; // 자동완성 : ctrl + 스페이스 , 입력하기 위해서는 스캐너를 써야함.

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력: ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 값 입력: ");
		int num2 = scanner.nextInt();
		
		System.out.println("입력한 값: " + (num1 + num2));
	
		scanner.next();				//문자열(String)자료
		scanner.nextLine();			//문자열(String)
		scanner.next().charAt(0);	//문자(char)
		scanner.nextInt();			//정수(int)
		scanner.nextDouble();		//실수(double)
		
	}

}
