package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		
		User user1 = new User();
		System.out.println("첫 번째: "+ user1.name);
		System.out.println("메인메소드에서 호출: " + user1);
		//user1.name = "김준일";
		user1.setName("aaaa");
		System.out.println("두 번째: "+ user1.name);
		
		User user2 = new User("김준일", "29", "01099881916", "부산");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);
		
		//User user1 = new User();
		//user1.name = "김준일";
		//User user2 = new User();
		//user2.age = "29";
		
		//System.out.println(user1.name);
		//System.out.println(user1.age); //입력 안 되어있음.
		//System.out.println(user2.name);
		//System.out.println(user2.age);
		//System.out.println(user1); //위치 주소
		//System.out.println(user2);
		//new User("정유진"); 
		
	}

}
