package day2;

public class Exer2 {
	public static void main(String[] args) {
	      // 1. 지폐 및 동전 세기
	      int money = 123456;
	      int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
	      int[] counts = new int[10];
	      // {2,2,0,3,0,4,1,0,1,1}
	      String[] str = new String[10];


//	      int oman = money / units[0];
//	      int man = money % units[0] / units[1];
//	      int ochun = money % units[1] / units[2];
//	      int chun = money % units[2] / units[3];
//	      int obaik = money % units[3] / units[4];
//	      int baik = money % units[4] / units[5];
//	      int osib = money % units[5] / units[6];
//	      int sib = money % units[6] / units[7];
//	      int o = money % units[7] / units[8];
//	      int il = money % units[8] / units[9];

//	      str[0] = "오만원";
//	      str[1] = "만원";
//	      str[2] = "오천원";
//	      str[3] = "천원";
//	      str[4] = "오백원";
//	      str[5] = "백원";
//	      str[6] = "오십원";
//	      str[7] = "십원";
//	      str[8] = "오원";
//	      str[9] = "일원";

	      
	      for( int i = 0 ; i < counts.length ; i++ ) {
	    	  counts[i]=money / units[i];
	    	  money %= units[i];
	    	  
	      }
	      for( int i = 0 ; i < counts.length ; i++ ) {
	    	  System.out.printf("%d원 %d" + (units[i] >= 1000 ? "장" : "개") + "\n"
	    		, units[i], counts[i]  );
	      }
	      
	}
}
	      
	      
//	      counts[1]=money % units[0] / units[1];
//	      counts[2]=money % units[1] / units[2];
//	      counts[3]=money % units[2] / units[3];
//	      counts[4]=money % units[3] / units[4];
//	      counts[5]=money % units[4] / units[5];
//	      counts[6]=money % units[5] / units[6];
//	      counts[7]=money % units[6] / units[7];
//	      counts[8]=money % units[7] / units[8];
//	      counts[9]=money % units[8] / units[9];





//	      for( int i = 0 ; i < counts.length ; i++ ) {
//	    	  
//
//	         System.out.print(counts[i]+"장 ");
//
//	      }


//	      System.out.print(oman+","+man+","+ochun+","+chun+","+obaik+","+baik+","+osib+","+sib+","+o+","+il);
//	      System.out.println();
//	      System.out.println(counts[0]);
	//
//	      System.out.println(counts[0]);

//	      for( int i = 0 ; money > counts[i] ; i++ ) {
//	         money -= counts[i];
//	         if(i >= 0) {
//	         break;
//	         }
//	         System.out.print(counts[i]);
//   }