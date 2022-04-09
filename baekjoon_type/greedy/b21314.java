package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b21314 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// M = 1 MM = 10
		// K = 5 MK = 50
		
		String s = br.readLine();
		
		String max = findMax(s);
		String min = findMin(s);
		System.out.println(max);
		System.out.println(min);
	}

	private static String findMin(String s) {
		StringBuilder sb = new StringBuilder();
		int size = s.length();
		int k = 0;
		for(int i = 0; i < size; i++) {
			char c = s.charAt(i);
			if(c == 'M') {
				k = i;
				while(k < size && s.charAt(k) == 'M') {
					k++;
				}
				sb.append(1);
				for(; i+1 < k; i++) {
					sb.append(0);
				}
				i = k-1;
			}else {
				sb.append(5);
			}
			
		}
		
		return sb.toString();
	}

	private static String findMax(String s) {
		StringBuilder sb = new StringBuilder();
		int size = s.length();
		int k = 0;
		for(int i =0; i < size; i++) {
			char c = s.charAt(i);
			if(c == 'M') {
				k = i;
				while(k < size && s.charAt(k) == 'M') {
					k++;
				}
				if(k == size) {
					for(; i<k; i++) {
						sb.append(1);
					}
				}else {
					sb.append(5);
					for(; i<k; i++) {
						sb.append(0);
					}
				}
				i = k;
			}else {
				sb.append(5);
			}
			
			
		}
		return sb.toString();
	}
	
}

	
	

