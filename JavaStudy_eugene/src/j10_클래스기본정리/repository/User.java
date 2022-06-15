package j10_클래스기본정리.repository;

/*
 * Entity Class(독립체) Class  
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다. 데이터만 저장함 . 
 * 
 */

public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자
	//전체생성자
	//getter
	//setter
	//toString
	
	//기본생성자
	public User() {}
		//생략되어있다. 굳이 만든 이유 : 생성자 오버로딩이 되면 비활성화 된다. 그 후에 값을 넣도록 한 거임,, 무조건 있어야 돼
		//생성자 오버로딩 했으면 기본 생성자 만들어 주삼.

	
	//전체생성자  (옵+커+S)
	public User(String usercode, String email, String name, String username, String password) {
		super();
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	//getter & setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//옵+커+S to String 
	@Override // 상속을 배워야 알 수 있ㅋ음. 
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}

	
}
	
