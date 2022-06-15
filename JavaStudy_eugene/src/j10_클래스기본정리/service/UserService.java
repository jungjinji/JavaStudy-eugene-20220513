package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	public User insertUser() {  //메소드명 (사용자를 추가하겠다.)
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.print("사용자번호입력: ");
		usercode = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("사용자이름: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		User user = new User(usercode, email, name, username, password); //입력한 값을 유저객체 만들고 리턴해줌 
		return user;
	}
	
	private void showInsertView() { //private void 정보은닉, 캡슐화 //메소드호출: 명령 실행 
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
	
}