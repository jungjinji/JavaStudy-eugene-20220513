package j06_반복;

public class While02 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ...
		 * 2 * 9 = 18
		 * 
		 */

		int dan = 2;
		int num = 0; // num이 반복될 때마다 1씩 증가. 1~9까지 9번 반복하는 조건식
		
		while (num < 9) {
			System.out.println(dan + " * " + (num + 1) + " = " + dan * (num + 1));
			num++;
		}
			
			/*(num < 10);
			 * num = (num + 1)
			 * 내 오답 System.out.println("(dan * num) = ");
			 * 이상, 이하를 써버리면 안 됨. 
			 */
		
	}

}
