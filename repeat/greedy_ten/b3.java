package greedy_ten;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long distance[] = new long[n-1]; // dis
		long price[] = new long[n]; //L price
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int i =0, j =0;
		while(st1.hasMoreTokens()) {
			distance[i] = Long.parseLong(st1.nextToken());
			i++;
		}
		while(st2.hasMoreTokens()) {
			price[j] = Long.parseLong(st2.nextToken());
			j++;
		}
		
		long sum = price[0] * distance[0];
		long prev = price[0];
		for(int k= 1 ; k < n-1 ; k++) {
			if(prev >= price[k]) {
				prev = price[k];
			}
			sum += (prev * distance[k]);
		}
		System.out.println(sum);
		
		
	}
}
