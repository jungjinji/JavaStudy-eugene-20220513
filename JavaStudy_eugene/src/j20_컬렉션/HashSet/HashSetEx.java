package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String> ();
		
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사"); //사까지만 출력 그와중에 순서도 뒤죽박죽. 주머니에 값넣는 방식
		name.add("김준일");
		name.add("김준일");
		
		System.out.println(name); //순서도 없으면서 값의 중복도 허락하지 않는다. ArrayList와 정반대 

		Iterator<String>iterator = name.iterator(); //이 커서 다음으로 데이터가 있니? 
		while(iterator.hasNext()) { 
			String name2 = iterator.next();
			//System.out.println(iterator.next());
			if(name2.equals("김준이")) {
				System.out.println(name2); //김준이 와 같으면 출력해라. 꺼내쓰면 데이터 사라짐 소모성.
			}
		}
		
		name.remove("김준사"); //값을 지워
		System.out.println(name);
		
		
		
	}

}
