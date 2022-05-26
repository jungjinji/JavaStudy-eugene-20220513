package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("김준일");
		System.out.println(student.getName());
		
		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-9988-1916");
		teacher.showInfo(); //정보를 보여주라는 의미. 조합 의미 놉;
		

		
		//student.name = "김준일";
		//student.schoolName = "코리아아이티";
		
		//teacher.name = "김준이";
		//teacher.address = "부산"; 
		//이렇게 넣는 거는 있을 수가 없삼....
	}

}
