package j04_입력;

import java.util.Scanner;

public class Input06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String result = " ";
		
		System.out.print("두 수를 입력하세요: ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		
		//a가 b보다 큰 경우 >를 출력한다. a가 b보다 작은 경우에는 <를 출력한다. a와 b가 같은 경우에는 ==를 출력한다. 길어지면 연산자 앞에서 줄바꿈.
		
		System.out.println(a > b ? ">" : a < b ? "<" : "==");
	
	}

}
