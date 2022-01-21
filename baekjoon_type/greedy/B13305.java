package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st1=  new StringTokenizer(br.readLine());
		long [] km = new long[num-1];
		for(int i = 0; i < num-1; i++) {
			km[i] = Long.parseLong(st1.nextToken());
		}
		
		StringTokenizer st2=  new StringTokenizer(br.readLine());
		long [] price = new long[num];
		for(int i = 0; i < num; i++) {
			price[i] = Long.parseLong(st2.nextToken());
		}
		long minPrice = price[0];
		long sum = minPrice * km[0];
		
		for(int i = 1 ; i < num-1; i++) {
			if(price[i] <= minPrice) {
				minPrice = price[i];
			}
			sum += (km[i]*minPrice);
		}
		System.out.println(sum);
	}
}
