package j02_변수와_상수;

public class Myinfo {

	public static void main(String[] args) {
		//주석
		/*
		 * 메모, 필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름:
		 * 나이:
		 * 연락처:
		 * 주소:
		 * 
		 */

	char name1 = '정';
	char name2 = '유';
	char name3 = '진';
	String phone = "010-9929-2311";
	String address = "부산 해운대구 우동";
	int age = 28;
	
	System.out.print("이름: ");
	System.out.print(name1);
	System.out.print(name2);
	System.out.println(name3);
	System.out.print("나이: ");
	System.out.println(age);
	System.out.print("연락처: ");
	System.out.println(phone);
	System.out.print("주소: ");
	System.out.println(address);
	
	//+ 한 줄
	System.out.print("이름: ");
	System.out.println(name1 + name2 + name3);
	// = 이름이 유니코드로 들어간 상태라 153849 로 인식됨.
	// 해결방법 : 문자열이랑 유니코드랑 합친 상태면 플러스가 + 가능 <문자열이 됨. 문자로 취급>
	System.out.print("이름: ");
	System.out.println("" + name1 + name2 + name3);
	
	
	System.out.println("세 수의 합: " + 10 + 20 + 30);
	System.out.println("세 수의 합: " + (10 + 20 + 30));
	//차이 알기. 연산자 우선 순위라 1번째 경우 문자로 취급한 상황. 괄호 먼저하게끔.
	
	}

}
