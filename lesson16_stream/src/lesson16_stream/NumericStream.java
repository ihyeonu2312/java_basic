package lesson16_stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {

	public static void main(String[] args) {
//		IntStream.range(1, 50); 1이상 50미만
//		IntStream.rangeClosed(1, 50); 1이상 50이하
		IntStream is = IntStream.range(1, 100);
		is.forEach(System.out::println);

		List<Integer> list = IntStream.range(1, 100).mapToObj(s -> s).collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		
		LongStream ls = new Random().longs(6, 1, 100).sorted(); // sorted() 정렬
		ls.forEach(System.out::println);
		
		IntBinaryOperator ibo = Math::max;
		
		Function<String, Integer> f = Integer::parseInt;
		
//		BinaryOperator<String> bo = (x, y) -> x.concat(y);
		BinaryOperator<String> bo = String::concat;
		System.out.println("a".concat("b"));
		
//		Function<String, Exception> f2 = s -> new Exception(s);
		Function<String, Exception> f2 = Exception::new;
		
		is = "가나다ABC".chars();
		is.forEach( s -> System.out.println((char)s));
//		 is = "가나다라ABCD".chars();
//	     is.forEach(s -> System.out.println((char) s));
		
//		Comparator<String> com = (x, y) -> x.compareTo(y);
		Comparator<String> com = String::compareTo;

	
	}
}
