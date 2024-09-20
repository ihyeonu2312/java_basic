package lesson16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MakeStream {
	
	public static void main(String[] args) {
		// 배열로 스트림 나누기
		String[] strs = {"가","나","A","B"};
		Stream<String> stream = Arrays.stream(strs);
//		System.out.println(stream);
		stream.forEach(System.out::println); // :: 참조 
//		stream.forEach(System.out::println); // stream 1회성
		stream = Arrays.stream(strs); // stream 초기화
		stream.forEach(System.out::println);
		
		System.out.println("==========");
		stream = Arrays.stream(strs, 1, 3);
		stream.forEach(System.out::println);
		
		// 리스트로 스트림 만들기
		System.out.println("=====리스트로 스트림 만들기=====");
		List<String> list = new ArrayList<String>(Arrays.asList(strs));
		stream = list.parallelStream();
		stream.forEach(System.out::println);

		// 셋으로 스트림 만들기
		System.out.println("=====셋으로 스트림 만들기=====");
		stream = new HashSet<>(list).stream();
		stream.forEach(System.out::println);
		
		// 빌더 패턴으로 스트림 만들기
		System.out.println("=====빌더 패턴으로 스트림 만들기=====");
		stream = Stream.builder().add("새똥이").add("길동이").add("소똥이").build().map(o -> o.toString());
		stream.forEach(System.out::println);
		
		// generate 사용으로 스트림 만들기
		System.out.println("=====generate 사용으로 스트림 만들기=====");
		stream = Stream.generate(() -> "애국가").limit(10); // limit 미사용 시 무한반복
		stream.forEach(System.out::println);
	
		// iterate 사용으로 스트림 만들기
		System.out.println("=====iterate 사용으로 스트림 만들기=====");
		stream = Stream.iterate("A", s -> (char)(s.charAt(0) + 1)+ "").limit(26); // limit 미사용 시 무한반복
		stream.forEach(System.out::println);
		
		// of 사용으로 스트림 만들기
		System.out.println("=====of 사용으로 스트림 만들기=====");
		stream = Stream.of("가", "길동이", "새똥이");
		stream.forEach(System.out::println);
		
	}
}
