package marble;

import java.util.Arrays;

import marble.area.City;

public class MarbleMain {

	public static void main(String[] args) {
//		String names = "시작 > 방콕 > 보너스게임(동전던지기) > 베이징 > 포츈카드 > 독도 > 두바이 > 카이로 > 무인도 > 발리 > 도쿄 > 시드니 > 포츈카드 > 퀘백 > 하와이 > 상파울루 > 올림픽 > 프라하 > 푸켓 > 베를린 > 포츈카드 > 모스크바 > 제네바 > 로마 > 세계여행 > 타히티 > 런던 > 파리 > 포츈카드 > 뉴욕 > 국세청 > 서울";
//		String[] ns = names.split(" > ");
//		System.out.println(Arrays.toString(ns));
		
//		System.out.println(ns.length);
		System.out.println("어서오세요 모두의 마블입니다");
		GameService service = new GameService();
		service.play();
//		System.out.println(Arrays.toString((service.locals)));
//		구매가능 : 관광지, 일반
//		불가능 : 시작, 보너스게임, 포츈카드, 무인도, 올림픽, 세계여행, 국세청
//		City city = new City(0, "방콕", 0, new int[] {2,1,4,6,6}, new int[] {1,1,2,6,25});
//		city.building = 6;
//		int feeResult = city.getFee();
//		
//		System.out.println(feeResult);
	}
}
