// 7개의 피보나치 수열을 출력하시오
public class Practice1 {
	public static void main(String[] args) {
//		int[] arrays = new int[8];
//		for (int i = 0; i < arrays.length-1; i++) {
//			if(i<=1) {
//				arrays[i] = i;
//			}
//			if(i==1) {
//				System.out.print(arrays[i]+"\t");
//			}
//			if(i>=1) {
//				System.out.print(arrays[i]+arrays[i-1] + "\t");
//				arrays[i+1] = arrays[i]+arrays[i-1];
//			}
//		}
		
		for(int i = 1 ; i <=7 ; i++) {
			System.out.print(fibo(i) + "\t");
		}
		
	}
	static int fibo(int n){
		if(n==1||n==2) return 1;
		else return fibo(n-1) + fibo(n-2);
	}
	
}
