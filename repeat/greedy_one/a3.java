package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int num =  Integer.parseInt(st1.nextToken());
		int sum =  Integer.parseInt(st1.nextToken());
		int arr[] = new int[num];
		for(int i = num-1; i >=0 ; i --) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int i = 0;
		int count = 0;
		while(sum != 0) {
			if(arr[i] <= sum) {
				count ++;
				sum -= arr[i];
			}else {
				i++;
			}
		}
		System.out.println(count);
		
		
	}
}
