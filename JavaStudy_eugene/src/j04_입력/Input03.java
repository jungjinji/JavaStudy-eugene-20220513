package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름: 정유진					문자열	name
		 * 나이: 29						정수	age
		 * 연락처: 010-9988-1916		문자열	phone
		 * 주소: 부산 동래구 사직동		문자열	address
		 * 성별: 남						문자	gender
		 * 
		 * [개인정보 출력]
		 * 이름 => 정유진					문자열
		 * 나이 => 29						정수
		 * 연락처 => 010-9988-1916			문자열
		 * 주소 => 부산 동래구 사직동		문자열
		 * 성별 => 남						문자
		 * 
		 * 
		 * next : 사용했을 때 띄어쓰기 전에서 잘림. 부산 해운대구 우동 = '값이 여기까지삼.(띄어쓰기 전까지)' address1 + address2 + address3 = 부산해운대구우동
		 * nextLine : 띄어쓰기가 포함 가능, 띄어쓰기 필요하면 nextLine을 쓰삼. 엔터\n를 먹음 버퍼에 남음; 그 다음 넥스트 라인 때 정상적으로 작동.
		 * 
		 * 버퍼가 없으면 바로 출력 '정'이 'ㅈㅓㅇ' 이렇게 입력됨.
		 * 
		 */ 
		
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = ' ';
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		scanner.nextLine();
		
		System.out.print("주소: ");
		address = scanner.nextLine();
		
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
	
		
		System.out.println("[개인정보 출력]");
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
	}

}
