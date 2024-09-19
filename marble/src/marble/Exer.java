package marble;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;

public class Exer {
	
	public static void main(String[] args) throws MalformedURLException {
		
	// 1. 달력 출력 (최소 이번달)
	// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 심플데이트포맷 파스를 이용해서 해당 연월 달력 출력
	Calendar today = Calendar.getInstance();
	
	System.out.print(today.get(Calendar.YEAR)+"년 "); 
	System.out.print(today.get(Calendar.MONTH)+1 +"월 "); 
	System.out.println(today.get(Calendar.DATE)+"일"); 
	System.out.println("------------"); 
	
	// 2. URL분석(String class 사용)
	String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
	
	str="https://www.naver.com";
	
//	URL url = new URL(str);
//	System.out.println(url.getProtocol());
//	System.out.println(url.getHost());
//	System.out.println(url.getPath());
//	System.out.println(url.getQuery());
//	
//	// 프로토콜 https 
//	
//	str = str.substring(str.indexOf("://"));
//	String protocol = str.substring(0, str.indexOf("://"));
//	System.out.println(protocol);
//	str = str.substring(str.indexOf("://")+3);
//	
//	System.out.println(str);
//	int idx = str.indexOf("/");
//	if(idx < 0) {
//		
//	}
//	System.out.println(idx);
//	System.out.println("www.naver.com".substring(0, -1));
	

	
	// 도메인 search.naver.com
	// 파일네임 search.naver
	// 쿼리스트링 where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
	// where :: nexearch
	// sm :: top_hty
	
	// 현재 위의 문자열은 5쌍의 key, value
		
	
//	int prtidx = str.indexOf("://");
////	System.out.println(str.indexOf("://"));
//	
//	
//	String prt = str.substring(0, prtidx);
//	System.out.println("프로토콜 " + prt); 
//	
//	
////	String dma = str.substring(prt.length(), str.lastIndexOf("/"));
//	
//	
//	int dmidx = str.lastIndexOf("/");
//	
//	String dm = str.substring(prtidx + 3 , dmidx);
//	
//	System.out.println("도메인 " + dm);
//	
//	
//	
//	
//	String[] stridx =	str.split("/");
////	for(int i = 0 ; i < stridx.length ; i++ ) {
////		System.out.println(stridx[i]);
////	}
//		
//	String[] arr = stridx[3].split("\\?");
//	
////	for( int j = 0 ; j < arr.length ; j++) {
////		
////		System.out.println( j +"."+ arr[j] );
////	}
//	
//	System.out.println("파일네임 " + arr[0]);
//	System.out.println("쿼리스트링 " + arr[1]);
//	
//	String[] query = arr[1].split("&");
//	
//	for( int i = 0 ; i < query.length ; i++) {
//		
//		System.out.println(query[i]);
//
//	}
	
//	MyUrl myUrl = new MyUrl(str);
//	System.out.println(myUrl);
//	myUrl.print();
	
	}
	class MyUrl{
		String protocol;
		String domain;
		String filename = "";
		String[] queryStrings;
		
		public MyUrl(String url) {
			String str = url;
			protocol = str.substring(0, str.indexOf("://"));
			str = str.substring(str.indexOf("://") + 3);
			
//			domain 초기화
			int idx = str.indexOf("/");
			if(idx < 0) {
				domain = str;
				return;
				
			}
			domain = str.substring(0, idx);
			str=str.substring(idx+1);

//			filename 초기화
			idx = str.indexOf("?");
			if(idx < 0) {
				filename = str;
				return;
			}
			filename=str.substring(0,idx);
			str=str.substring(idx+1);
			
			
			
//			queryString 초기화
			if(str.length()==0) {
				return;
			}
			
			queryStrings =	str.split("&");
			
			
		}

		@Override
		public String toString() {
			return "MyUrl [protocol=" + protocol + ", domain=" + domain +", filename" + filename + ",queryStrings=" +
			Arrays.toString(queryStrings) + "]";
		}
		public void print() {
			System.out.println("protocol=" + protocol + ", domain=" + domain +", filename" + filename);
			System.out.println(Arrays.toString(queryStrings));
			for(String qs : queryStrings) {
				String[] tmp = qs.split("=");
				System.out.println(tmp[0] + " ::: " + (tmp.length > 1 ? tmp [1] :""));
			}
		}
		
	}
}
	