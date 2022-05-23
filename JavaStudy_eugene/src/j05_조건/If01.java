package j05_조건;

public class If01 {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("프로그램 시작");
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}else{
			if(num < 5) {
				System.out.println("5보다 작습니다.");
			}else{
				System.out.println("num 5입니다.");
			}
		
		System.out.println("프로그램 종료");
		}
	}
}

/*		else꼭 이거 아니면 요거;, 괄호도 주의하삼
 * 		2번째 if,else (1set); if 없이 else 못씀 if는 혼자 가능; if 안에 if는 안 됨;
 * 		int num = 10;
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		if(num < 5) {
			System.out.println("5보다 작습니다.");*/
