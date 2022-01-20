package bruceforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> a = new ArrayList<>();
		
		int sum = 0;
		for(int i =0; i < 9; i++) {
			a.add(Integer.parseInt(br.readLine()));
			sum += a.get(i);
		}
		Collections.sort(a);
		int idx = 0;
		int idx2 = 0;
		
		for(int i = 0; i < a.size()-1; i++) {
			for(int j = i+1; j < a.size(); j++) {
				int temp =  a.get(i) + a.get(j);
				if(sum-temp == 100){
					idx = i;
					idx2 = j;
					break;
				}
			}
		}
		
		
		for(int i=0; i < a.size(); i ++ ) {
			if(i == idx || i == idx2) {
				continue;
			}
			System.out.println(a.get(i));
		}
		
	}
}
