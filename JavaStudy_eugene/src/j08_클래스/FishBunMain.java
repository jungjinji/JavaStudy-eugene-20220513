package j08_클래스;

public class FishBunMain { //클래스 명은 무조건 대문자로 시작하삼.

	public static void main(String[] args) { //메인 붙으면 메인체크.
		FishBun fishBun = new FishBun(); //객체 생성. 참조자료형 + 해당자료형의 변수명 + 값 //new가 있으면 객체 생성. 없으면 부르는 것. 피쉬1 
		
		fishBun.showInfo(); 
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("========================");
		
		FishBun fishBun2 = new FishBun(); //객체 생성. 또 다른 존재를 찍어냄. 변수는 복제되었음. 피쉬2 
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun2.showInfo();
		fishBun.showInfo();  //클래스 파일은 하나인데, fish1과 2는 다름. 객체가 하나일 수는 없다. 피쉬2
		
		System.out.println(fishBun); //<-이 주소에 각각 있다.
		System.out.println(fishBun2);
		
	}

}
