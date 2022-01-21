package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String s1 = br.readLine();
		String s2 = br.readLine();
		int a[] = new int[num];
		int b[] = new int[num];
		StringTokenizer st = new StringTokenizer(s1);
		StringTokenizer st2 = new StringTokenizer(s2);
		
		for(int i=0; i < num; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i < num; i++) {
			b[i] = Integer.parseInt(st2.nextToken());
		}
		
		int sum = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		int j = 0;
		for(int i=num-1; i >= 0; i--) {
			sum = sum + a[j]*b[i];
			j++;
		}
		System.out.println(sum);
		
		
	}
}
