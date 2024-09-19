package lesson13_collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	
	public static void main(String[] args) {
		
//		List<Object> list = new ArrayList<>(); // 같은 Object타입 생략가능
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0, 2); // 0번 인덱스에 2
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(10);
		System.out.println(list);
		int sum = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i + "::" + list.get(i));
//			sum += (Integer)list.get(i); // 오브젝트를 인트로 변환
			sum += list.get(i); // Integer일 시 캐스팅 생략 가능
		}
		System.out.println(sum);
		
	}
	
}