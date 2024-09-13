package marble.area;

public class City extends SaleLocal{
	
	public int building;
	
	public int[] buildCost = {2,1,4,6,6};
	public int[] fee = {1,1,2,6,25};
	
//	public City(int colorIdx, String name, int Idx, int[] buildCost, int[] fee) {
//		super(colorIdx, name, Idx);
//		this.buildCost = buildCost;
//		this.fee = fee;
//		
//	}
	public City(int colorIdx, String name, int Idx) {
		super(colorIdx, name, Idx);
	}
	
	public int getFee() {
		int cnt = 0;
		int feeResult = fee[cnt++];
		
		
		int i = building;
		while(i != 0) {
			if( i % 2 == 1) {
				feeResult += fee[cnt];
			}
			cnt++;
			i /=2;
		}
		return feeResult;
	}
}