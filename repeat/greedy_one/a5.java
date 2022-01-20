package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a5 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int [] a = new int[num]; 
		int [] b = new int[num]; 
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < num; i++) {
			a[i] = Integer.parseInt(st1.nextToken());
			b[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int j = num-1;
		int sum = 0;
		for(int i = 0; i < num; i ++) {
			sum += a[i] * b[j];
			j--;
		}
		System.out.println(sum);
		
	}
}

