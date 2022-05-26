package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;

	User() { //기본생성사 (아무것도 들어있지 않은)
		System.out.println("생성.");
	}
	
	User(String name) { //사용자정의 생성자.
		System.out.println(name);
		this.name = name;
	}
	
	User(String name, String age, String phone, String address) {//생성할 때 값을 넣겠삼.
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	void setName(String name) {
		System.out.println("setName 메소드 안에서 호출: " + this);
		this.name = name;  //*디스: 현재 자기 자신의 주소 디스; 유저1.네임 주소에 접근 
	}
	
	//변수명이 같아도 자료형이 다르면 매개변수가 다르면(갯수) 오버로딩이 가능.
	//같은 이름으로 선언 가능.
	
}
