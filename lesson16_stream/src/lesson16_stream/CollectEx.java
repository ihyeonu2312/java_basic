package lesson16_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(3,1,2,4,5,1,2,3,1);
		List<String> list =
		stream
		.distinct()//중복제거
		.sorted((a, b) -> b - a)
		.map(i -> i.toString() + i + i)
		.collect(Collectors.toList());
		System.out.println(list);
//		.forEach(System.out::println); // 최종연산
		Stream.concat(list.stream(), list.stream()).forEach(System.out::println);
	}
	
}