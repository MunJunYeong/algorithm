package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a5 {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		double [] arr = new double[num];
		double max = 0;
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		for(int i = 0; i < num; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		double d[] = new double[num];
		double sum = 0;
		for(int i = 0; i < num; i++) {
			d[i] = (arr[i]/max) *100;
			sum += d[i];
		}
//		System.out.println(sum/num);
		System.out.printf("%.4f", sum/num);
		
		
		
	}
}
