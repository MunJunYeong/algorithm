package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s, "-");
		String [] a=  new String[100];
		int cnt = 0;
		while(st.hasMoreTokens()) {
			a[cnt] = st.nextToken();
			cnt++;
		}
		int cnt2 = 0;
		String [] temp = new String[cnt];
		for(int i =0 ; i< a.length; i++) {
			if(a[i] != null) {
				temp[cnt2] = a[i];
				cnt2++;
			}
		}
		
		StringTokenizer firstSt = new StringTokenizer(temp[0], "+"); //제일 처음에 나온 + 
		int sum = Integer.parseInt(firstSt.nextToken());
		while(firstSt.hasMoreTokens()) {
			sum += Integer.parseInt(firstSt.nextToken());
		}
		
		if(temp.length>= 1) {
			for(int i=1; i<temp.length; i++) {
				StringTokenizer st2 = new StringTokenizer(temp[i], "+");
				int tempSum = Integer.parseInt(st2.nextToken());
				while(st2.hasMoreTokens()) {
					tempSum += Integer.parseInt(st2.nextToken());
				}
				sum = sum-tempSum;
			}
		}
		System.out.println(sum);
		
		
		
	}
}
