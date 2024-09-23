package lesson16_stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOther {
	
	public static void main(String[] args) {
		//스트림 생성
		
		// 연산
		// 1.중간연산
		// 필터, 맵, 정렬, peek
		
//		long cnt = 
		boolean result =
		Stream
		.of("홍길동", "김유신","이순신", "유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println)// 중간연산 (단독실행 x)
//		.allMatch(s->s.startsWith("홍")); 
		.anyMatch(s->s.startsWith("홍"));
		System.out.println(result);
//		.count(); //최종연산
//		System.out.println(cnt);
//		.forEach(System.out::println) // 최종연산
		
		
		// 2.최종연산
		// forEach, allMatch, anyMatch, 집계
		String str = null;
		Optional<String> optional = Optional.ofNullable(str);
		optional.ifPresent(System.out::println); // isPresent : null 체크, orElse("null일때 대체문자 출력")
	} 
	
}
