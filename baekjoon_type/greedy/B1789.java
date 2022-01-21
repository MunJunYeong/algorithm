package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		long sum = Long.parseLong(br.readLine());
		long total = 0; 
		int i = 0;
		
		while(sum >= total) {
			total += (++i);
		}
		System.out.println(sum == total ? i : i-1);
		
	}
}
