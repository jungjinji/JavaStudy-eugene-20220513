package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * 0보다 작거나 100보다 크면 계산할 수 없는 점수입니다. 출력 백준 9498:시험성적
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
		 * 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 */
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.: ");
		score = scanner.nextInt();
		
		if(score < 0 || score > 100 ) {
			System.out.println("계산할 수 없는 점수입니다.");
		} else if(score > 89) {
			System.out.println("A");
		} else if(score > 79) {
			System.out.println("B");
		} else if(score > 69) {
			System.out.println("C");
		} else if(score > 59) {
			System.out.println("D"); 
		} else {
			System.out.println("F");
		}
	}
}
		// 입력해야하니까 스캐너 먼저, 조건은 줄일 수 있으면 줄여야 함.
		// '>','<' 으로만 만드려고 노력하삼 >= 이런거 지양하삼.