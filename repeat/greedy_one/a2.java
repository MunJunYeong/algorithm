package greedy_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int [] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		// 5
		int sum =0;
		for(int i = 0; i < num; i ++) {
			int temp = 0;
			
			for(int j  = 0; j <= i; j++) {
				temp += arr[j];
			}
			sum += temp;
		}
		System.out.println(sum);
		
	}
}
