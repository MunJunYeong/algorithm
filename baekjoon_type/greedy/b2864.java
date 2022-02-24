package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b2864 {


	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
		// 5 6 헷갈
		
//		int aL = (int) (Math.log10(a)+1);
//		int bL = (int) (Math.log10(b)+1);
		String minA = "";
		String minB = "";
		String maxA = "";
		String maxB = "";
		
		for(int i = 0; i < a.length(); i++) {
			char c= a.charAt(i);
			if(c == '6'-0) {
				minA = minA+ "5";
				maxA += c;
			}else if( c == '5'-0){
				minA += c;
				maxA = maxA + "6";
			}else {
				minA += c;
				maxA += c;
			}
		}
		for(int i =0; i < b.length(); i ++) {
			char c= b.charAt(i);
			if(c == '6'-0) {
				minB = minB+ "5";
				maxB += c;
			}else if( c == '5'-0){
				minB += c;
				maxB = maxB + "6";
			}else {
				minB += c;
				maxB += c;
			}
		}
		int tempMaxA= Integer.parseInt(maxA);
		int tempMaxB = Integer.parseInt(maxB);
		int tempMinA = Integer.parseInt(minA);
		int tempMinB = Integer.parseInt(minB);
		System.out.println((tempMinA + tempMinB) + " " + (tempMaxA + tempMaxB));
	}
}