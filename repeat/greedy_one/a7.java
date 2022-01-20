package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a7 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine());
		// 500 100 50 10 5 1
		int res = 1000- sum;
		int [] arr = new int[6];
		arr[0] = 500;
		arr[1] = 100;
		arr[2] = 50;
		arr[3] = 10;
		arr[4] = 5;
		arr[5] = 1;
		int i = 0;
		int cnt = 0;
		while(res != 0) {
			if(arr[i] <=res) {
				res -= arr[i];
				cnt ++;
			}else {
				i++;
			}
		}
		System.out.println(cnt);
		
	}
}
