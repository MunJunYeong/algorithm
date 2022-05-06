package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s18311 {
	
	static int n;
	static Long k;
	static int course[];
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Long.parseLong(st.nextToken());
		course = new int[n];
		max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i< n;i++) {
			course[i] = Integer.parseInt(st.nextToken());
			max += course[i];
		}
		if(k <= max) {
			straight();
		}else {
			reverse();
		}
		
	}
	private static void reverse() {
		int idx = n-2;
		int start = max;
		int limit = start - course[n-1];
		Long temp = max - (k-max);
		int res = n;
		while(true) {
			if(temp < start && temp >= limit) break;
			limit -= course[idx];
			res--;
			idx--;
			
		}
		System.out.println(res);
	}
	private static void straight() {
		int idx = 1;
		Long start = (long) 0;
		Long limit = (long) course[0];
		int res = 1;
		while(true) {
			if(start <= k && k < limit) {
				break;
			}
			start = limit;
			limit += course[idx];
			res++;
			idx++;
		}
		System.out.println(res);
	}

}