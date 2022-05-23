package j05_조건;

public class If02 {

	public static void main(String[] args) {
		int score = 85;
		
		if(score == 100) {
			System.out.println("만점입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79){
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("...");
		}
	}
}

/*
  실행 명령문이 딱 하나면 중괄호 생략 가능하삼. {}괄호 활용하셈 가독성이 좋아짐.
 
		int num = 5;
		
		if(num > 5) System.out.println("5보다 큽니다.");
		else System.out.println("5보다 크지 않습니다.");
*/