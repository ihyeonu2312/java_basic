package lesson15_lamda;

import java.util.function.Function;

public class LamdaEx {

	public static void main(String[] args) {
		
		// 파라미터한개는 괄호 생략가능
		MyInter<Integer> inter = t -> t * t;
		System.out.println(inter.m(10));
		
		MyInter<String> inter2 = s -> "hello" + s;
		System.out.println(inter2.m("새똥이"));
		
		// Function<T, R>  T : 파라미터타입, R : 리턴타입
		Function<String, Integer> f = s -> Integer.parseInt(s);
//		Function<String, Integer> f2 = s -> Integer::parseInt;
		
		int result = f.apply("1234");
		System.out.println(result + 1000);
		
		Object o = new MyInter<Integer>() {
			@Override
			public Integer m(Integer t) {
				return t;
			}
		};
		
		Object o2 = (MyInter<String>)(s -> s);
	}

}

@FunctionalInterface // 반드시 추상메서드가 하나
interface MyInter<T> {
	T m(T t);

	default T m2(T t) {
		return t;
	}

}