package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'c';
		String str = "김준일";
		
		switch(num / 10) {
			case 1:
				System.out.println("case 1");
			case 2:
				System.out.println("case 2");
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("찾을 수 없음.");
		}
		switch(c) {
			case 'a':
				System.out.println("case a");
			case 'b':
				System.out.println("case b");
			case 'c':
				System.out.println("case c");
			break;
			default:
				System.out.println("찾을 수 없음.");
		}
		switch(str) {
			case "김준일":
				System.out.println("case 김준일");
			case "박준형":
				System.out.println("case 박준형");
			break;
			case "한재안":
				System.out.println("case 한재안");
			default:
				System.out.println("찾을 수 없음.");
}
	}
}
//자료형이 같아야 찾아갈 수 있음. 해당 케이스를 찾아가서 중괄호가 없으니 
//그 다음 것까지 쭉 출력. 중간중간 break를 걸어야 함. 디폴트는 하단에.

