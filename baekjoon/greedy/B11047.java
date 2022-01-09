package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st =new StringTokenizer(s);
		int num = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int arr[]  =new int[num];
		
		for(int i=0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count =0;
		for(int i= num-1; i >=0; i--) {
			if(arr[i] <= max) {
				count++;
				max = max-arr[i];
				i++;
			}
		}
		System.out.println(count);
		
	}
}
