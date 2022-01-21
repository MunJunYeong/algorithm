package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nu = Integer.parseInt(br.readLine());
		int num = 1000- nu;
		int a[] = new int[6];
		a[0] = 500;
		a[1] = 100;
		a[2] = 50;
		a[3] = 10;
		a[4] = 5;
		a[5] = 1;
		int cnt = 0;
		
		int i = 0;
		while(num !=0) {
			if(a[i] <= num) {
				num = num-a[i];
				cnt++;
			}else {
				i++;
			}
		}
		System.out.println(cnt);
		
	}
}
