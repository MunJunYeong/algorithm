package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int arr[] = new int[k];
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		int max = arr[0] + (arr[0]*(k-1));
		for(int i =1; i < k; i++) {
			int temp = arr[i] + arr[i]*(k-i-1);
			if(temp > max) {
				max = temp;
			}
		}
		System.out.println(max);
	}
}
