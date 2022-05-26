package j08_클래스;

public class FishBun {
	String material; //(재료) 선언 
	String dough;
	
	FishBun(){ // 생성자
		System.out.println("생성자 호출");
		
	}
	
	//void test() { 보이드와 피쉬번 차이 : 반환 자료형이 없다. 메소드는 변수처럼 소문자로 사용해야한다. 
	
	void showInfo() { //정의가 되어있어야 호출 가능 
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}

}
