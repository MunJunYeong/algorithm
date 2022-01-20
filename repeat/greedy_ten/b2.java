package greedy_ten;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		long sum = 0;
		int i = 1;
		while(true) {
			sum+= i;
			if(sum > num) {
				break;
			}
			i++;
		}
		System.out.println(i-1);
		
		
	}
}

