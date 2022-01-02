package chap11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
	static int count =0 ;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		//num, sum enter
		StringTokenizer st =new StringTokenizer(s);
		int num = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		
		//num만큼 값 입
		String s2 = br.readLine();
		StringTokenizer st2 =new StringTokenizer(s2);
		int [] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
	
		int result = findMax(arr, num, sum);
		System.out.println(result);
		
		
	}

	private static int findMax(int[] arr, int num, int sum) {
		int result = 0;
		for(int i= 0; i < num-2; i++ ) {
			for(int j =i+1; j<num-1; j++) {
				for(int k = j+1; k<num; k++) {
					int temp = arr[i]+ arr[j]+ arr[k];
					if(temp <=sum && temp > result) {
						result = temp;
					}
					
				}
			}
		}
		
		return result;
	}
	
	
}