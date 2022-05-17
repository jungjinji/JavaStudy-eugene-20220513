package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 * 
		 * result = false
		 * 
		 * 년도가 4의 배수이면 True 
		 * 아니면 False
		 * 
		 * 윤년이면 True 아니면 False
		 * ((4의 배수이면서, 100의 배수가 아닐 때)) (또는 400의 배수일 때 윤년)
		 * AND ~ 이면서, 그리고 - 동시만족
		 * OR ~ 일 때
		 * 변수를 많이 사용할수록 메모리를 잡아먹음 ;
		 */
		
		int year = 2000;
		boolean result = year % 4 == 0;
		
		System.out.println(result);
		
		year = 4000;
		boolean result2 = ((year % 4 == 0) && (year % 100 !=0 )) || (year % 400 == 0);
		System.out.println(result2);
	}

}
