package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringTokenizer st =new StringTokenizer(s);
		int [] arr = new int [num];
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int sum = 0;
		for(int i =0; i < num; i++) {
			int count = 0;
			if(i!=0) {
				for(int j =i; j >= 0; j--) {
					count += arr[j];
				}
			}
			sum = sum + count;
		}
		
		System.out.println(sum);
	}
}
