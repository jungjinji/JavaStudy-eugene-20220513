package j06_반복;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i < 100) { //true 참일 때만 반복, 참이 아닌 순간 반복 끝.
			//i = i + 1; //줄이고 싶으면 
			//i += 1; 복합 대입 연산; <-는 숫자 변경 가능 i += 4; 
			//++i; // < 선증가와 
			//i++;  < 후증가는 1씩 증가만 가능
			//반복에서는 후증가를 많이 씀.
			
			result = result + (i + 1);
			i++; //조건 변화 수식 
		}
		
			System.out.println(result);
	}
}
