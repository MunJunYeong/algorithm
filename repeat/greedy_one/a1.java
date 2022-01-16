package greedy_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int weight = Integer.parseInt(br.readLine());
		
		int nmg = weight%5;
		
		if(weight == 7 || weight == 4 ) {
			System.out.println(-1); System.exit(0);
		}
		
		if(nmg == 1 || nmg == 3) {
			System.out.println(weight/5 + 1);
		}else if(nmg == 2 || nmg == 4) {
			System.out.println(weight/5 +2);
		}else {
			System.out.println(weight/5);
		}
		
	}
}
