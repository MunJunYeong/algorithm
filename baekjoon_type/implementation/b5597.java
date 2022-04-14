package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b5597 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean [] stu = new boolean[31];
		for(int i = 0; i < 28; i++) {
			int temp =Integer.parseInt(br.readLine());
			stu[temp] = true;
		}
		for(int i = 1; i < 31; i++) {
			if(!stu[i]) {
				System.out.println(i);
			}
		}
	}
	
}

	
	


