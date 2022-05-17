package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		// 
		int num = 10;
		
		num = num + 1;
		
		System.out.println(num);
		System.out.println(++num);
		System.out.println(++num);
		
		System.out.println(--num);
		System.out.println(--num);
		System.out.println(--num);		
		System.out.println(num);
		
		System.out.println(num + 10);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(num--);
		System.out.println(num);
		
		/*
		 * 
		 * ++선증가
		 * ++num 바로 1을 증가시킨다. - 선증가
		 * num++ 그 다음줄 앞에 1증가 그 이전줄은 증가 X
		 * 
		 * 후증가++
		 * 지금은 증가 안 시킬게, 그 다음부터 증가 시켜라
		 */

	}

}
