package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b21758 {
	
	static int n;
	static int [] arr;
	
	static long total;				// 모든 장소들의 꿀 양 합
	static long[] zeroToRight;		// [0 ~ 벌 2 위치] 누적합
	static long[] RightToLeft;		// [끝 ~ 벌 2 위치] 누적합

	static long max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		zeroToRight = new long[n];
		RightToLeft = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long temp = 0;
		
		for(int i =0;i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			temp += arr[i];
			zeroToRight[i] = temp;
		}
		temp =0;
		for(int i = n-1; i >=0; i--) {
			temp += arr[i];
			RightToLeft[i] = temp;
		}
		total = zeroToRight[n-1];
		
		
		// 1. 왼쪽벌1, 오른쪽 벌통, 중간에 벌2 랜덤으
		findMax();
		// 2. 왼쪽 꿀통 , 오른쪽 벌1, 중간에 벌2 랜덤으
		findMax2();
		// 3. 왼쪽 벌, 오른쪽 벌, 중간에 꿀통 랜덤
		findMax3();
		
		System.out.println(max);
		
	}

	private static void findMax3() {
		long bee1, bee2;
		for(int i = 1; i <= n-2; i++) {
			bee1 = zeroToRight[i] - arr[0];
			bee2 = RightToLeft[i] - arr[n-1];
			max = Math.max(max, bee1+bee2);
		}
		
	}

	private static void findMax2() {
		long bee1, bee2;
		for(int i = n-2; i >=1; i--) {
			bee1 = total - arr[n-1] - arr[i];
			bee2 = total - RightToLeft[i];
			max = Math.max(max, (bee1+bee2));
		}
	}

	private static void findMax() {
		long bee1, bee2;
		for(int i = 1; i <=n-2; i++) {
			bee1 = total - arr[0] - arr[i];
			bee2= total - zeroToRight[i];
			max = Math.max((bee1+bee2), max);
		}
	}
	
}

	
	

