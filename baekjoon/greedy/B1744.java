package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1744 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[]  = new int [num];
		int minusCnt = 0;
		for(int i = 0; i < num; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] <= 0) {
				minusCnt++;
			}
		}
		Arrays.sort(arr);
		int sum = 0;
		//총 12개 음수 5개  
		//음수일 경우 두 개를 곱해준 다음 더해주기 
		for(int i = 1; i < minusCnt; i+=2 ) {
			sum += (arr[i-1] * arr[i]);
		}
		// 음수의 개수가 홀수일 경우에 
		if(minusCnt % 2 == 1) {
			sum += arr[minusCnt -1];
		}
		// 양수의 개수가 홀수일 경우 하나를 그냥 더하기 
		if((num-minusCnt) % 2 == 1) {
			sum += arr[minusCnt]; 
		}
		for(int i = num-1; i > minusCnt; i -= 2) {
			int temp  = arr[i] * arr[i-1];
			int temp2  = arr[i] + arr[i-1];
			if(temp > temp2) {
				sum += temp;
			}else {
				sum += temp2;
			}
		}
		
		System.out.println(sum);
		
	}
}
