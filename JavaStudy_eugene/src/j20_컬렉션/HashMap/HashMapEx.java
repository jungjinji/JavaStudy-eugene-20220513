package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import lombok.val;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();

		//값 추가
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");

		System.out.println(studentMap);

		//key로 value 가져오기
		System.out.println(studentMap.get(10));

		//수정
		studentMap.put(10, "김준육"); // key 값이 없을 경우 추가가 됨.
		studentMap.replace(10, "김준칠");

		//삭제
		studentMap.remove(10);

		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}


		//람다식(함수형 프로그래밍)
		studentMap.forEach(
			(k, v) -> {
				System.out.println("key: " + k);
				System.out.println("key: " + k);
				System.out.println("value: " + v);
			}
		);

		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));



	}

}





